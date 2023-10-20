package ru.test.cryptoinfo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.squareup.picasso.Picasso
import ru.test.cryptoinfo.databinding.ActivityCoinDetailBinding

class CoinDetailActivity : AppCompatActivity() {

    private lateinit var viewModel: CoinViewModel
    private lateinit var binding: ActivityCoinDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (!intent.hasExtra(EXTRA_FROM_SYMBOL)) {
            finish()
            return
        }
        val fromSymbol = intent.getStringExtra(EXTRA_FROM_SYMBOL)
        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        viewModel.getDetailInfo(fromSymbol!!).observe(this, Observer {
            binding.tvPrice.text = it.price.toString()
            binding.tvMinOfDayPrice.text = it.low24hour.toString()
            binding.tvMaxOfDayPrice.text = it.high24hour.toString()
            binding.tvLastDeal.text = it.lastMarket
            binding.tvLastUpdate.text = it.getFormattedTime()
            binding.tvSymbols.text = "${it.fromSymbol} / ${it.toSymbol}"
            Picasso.get().load(it.getFullImageUrl()).into(binding.ivLogoCoin)
            Log.d("DETAIL_INFO", it.toString())
        })
    }

    companion object {
        private const val EXTRA_FROM_SYMBOL = "fSym"

        fun newIntent(context: Context, fromSymbol: String): Intent {
            val intent = Intent(context, CoinDetailActivity::class.java)
            intent.putExtra(EXTRA_FROM_SYMBOL, fromSymbol)
            return intent
        }
    }
}