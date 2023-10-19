package ru.test.cryptoinfo

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.google.gson.Gson
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ru.test.cryptoinfo.api.ApiFactory
import ru.test.cryptoinfo.database.AppDatabase
import ru.test.cryptoinfo.pojo.CoinPriceInfo
import ru.test.cryptoinfo.pojo.CoinPriceInfoRowData
import java.util.concurrent.TimeUnit

class CoinViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.getInstance(application)
    private val compositeDisposable = CompositeDisposable()

    val priceList = db.coinPriceInfoDao().getPriceList()

    fun getDetailInfo(fSym: String): LiveData<CoinPriceInfo> {
        return db.coinPriceInfoDao().getPriceInfoAboutCoin(fSym)
    }

    init {
        loadData()
    }

    private fun loadData() {
        val disposable = ApiFactory.apiService.getTopCoinsInfo(limit = 10)
//        val disposable = ApiFactory.apiService.getFullPriceList( fSyms = "BTC,ETH,EOS")
            .map { it.data?.map {
                println("RRRRRR   ${it.coinInfo?.name}")
                it.coinInfo?.name }?.joinToString(",") }//  IT'S IMPORTANT TO DON'T ADD SPACE AFTER COMMA: ", " - IT WON'T WORK COS в адресной сроки идёт сплошной текст
            .flatMap {
                println("HHHHH $it")
                ApiFactory.apiService.getFullPriceList(fSyms = it) }
            .map { getPriceListFromRawData(it) }
            .delaySubscription(10, TimeUnit.SECONDS)
            .repeat()
            .retry()
            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())  //  теперь нам не нужно переключаться на главный поток, всё делаем в побочном
            .subscribe(
                {
                    db.coinPriceInfoDao().insertPriceList(it)
                    Log.d("TEST_OF_LOADING_DATA", "Success: $it")
                }, {
                    Log.d("TEST_OF_LOADING_DATA", "Failure: " + it.message!!)
                })
        compositeDisposable.add(disposable)
    }

    private fun getPriceListFromRawData(
        coinPriceInfoRowData: CoinPriceInfoRowData
    )    : MutableList<CoinPriceInfo> {
        val result = ArrayList<CoinPriceInfo>()
        val jsonObject = coinPriceInfoRowData.coinPriceInfoJsonObject ?: return result
        println("FFFFF ${coinPriceInfoRowData.coinPriceInfoJsonObject.size()}")
        val coinKeySet = jsonObject.entrySet().map { it.key }.toMutableSet()
        jsonObject.entrySet().forEach { println("EEEEE ${it.key}") }
        for (coinKey in coinKeySet)
            println("DDDDD $coinKey")
        for (coinKey in coinKeySet) {
            val currencyJson = jsonObject.getAsJsonObject(coinKey)
            val currencyKeySet = currencyJson.entrySet().map { it.key }.toMutableSet()
            for (currencyKey in currencyKeySet) {
                val priceInfo = Gson().fromJson(
                    currencyJson.getAsJsonObject(currencyKey), CoinPriceInfo::class.java)
                result.add(priceInfo)
            }
        }
        return result
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}