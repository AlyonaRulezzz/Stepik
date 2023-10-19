package ru.test.cryptoinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.test.cryptoinfo.utils.convertTimestampToTime

class CoinPriceListActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
//    val viewModel by android.arch.lifecycle.ViewModel<CoinViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_price_list)
        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
//        viewModel.priceList.observe(this, Observer {
//        Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it")
//    })
        viewModel.getDetailInfo("BTC").observe(this, Observer {
            Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it")
        })
        convertTimestampToTime(88888)
    }
}
