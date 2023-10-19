package ru.test.cryptoinfo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.test.cryptoinfo.adapters.CoinInfoAdapter
import ru.test.cryptoinfo.databinding.ActivityCoinPriceListBinding
import ru.test.cryptoinfo.pojo.CoinPriceInfo

class CoinPriceListActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
//    val viewModel by android.arch.lifecycle.ViewModel<CoinViewModel>()
    private lateinit var binding: ActivityCoinPriceListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinPriceListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = CoinInfoAdapter(this)

        binding.rvCoinPriceList.adapter = adapter
        adapter.onCoinClickListener = object: CoinInfoAdapter.OnCoinClickListener {
            override fun onCoinClick(coinPriceInfo: CoinPriceInfo) {
                Log.d("ON_CLICK_TEST", coinPriceInfo.fromSymbol)
            }

        }

        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        viewModel.priceList.observe(this, Observer {
            println("JJJJJ ${adapter.coinInfoList}")
            Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it")
            adapter.coinInfoList = it
    })
        viewModel.getDetailInfo("BTC").observe(this, Observer {
            Log.d("TEST_OF_LOADING_DATA", "Success in activity: $it")
        })
    }
}
