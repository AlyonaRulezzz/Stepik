package ru.test.cryptoinfo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ru.test.cryptoinfo.R
import ru.test.cryptoinfo.databinding.ItemCoinInfoBinding
import ru.test.cryptoinfo.pojo.CoinPriceInfo

class CoinInfoAdapter(private val context: Context): RecyclerView.Adapter<CoinInfoAdapter.CoinInfoViewHolder>() {

    var coinInfoList: MutableList<CoinPriceInfo> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    var onCoinClickListener: OnCoinClickListener? = null

    inner class CoinInfoViewHolder(private val binding: ItemCoinInfoBinding):
        RecyclerView.ViewHolder(binding.root) {
        val ivLogoCoin = binding.ivLogoCoin
        val tvSymbols =binding.tvSymbols
        val tvPrice = binding.tvPrice
        val tvLastUpdate = binding.tvLastUpdate
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinInfoViewHolder {
        val item = LayoutInflater
            .from(parent.context).inflate(R.layout.item_coin_info, parent, false)
        val binding = ItemCoinInfoBinding.bind(item)
        return CoinInfoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoinInfoViewHolder, position: Int) {
        val coin = coinInfoList[position]
        with(holder) {
            val symbolsTemplate = context.resources.getString(R.string.symbols_template)
            val lastUpdateTemplate = context.resources.getString(R.string.last_update_template)
            tvSymbols.text = String.format(symbolsTemplate, coin.fromSymbol, coin.toSymbol)
//            tvSymbols.text = "${coin.fromSymbol} / ${coin.toSymbol}"
            tvPrice.text = coin.price.toString()
            tvLastUpdate.text = String.format(lastUpdateTemplate, coin.getFormattedTime())
//            "Время последнего обновления: ${coin.getFormattedTime()}".also { tvLastUpdate.text = it }
            Picasso.get().load(coin.getFullImageUrl()).into(ivLogoCoin)
            itemView.setOnClickListener {
                onCoinClickListener?.onCoinClick(coin)
            }
        }
    }

    override fun getItemCount(): Int = coinInfoList.size

    interface OnCoinClickListener {
        fun onCoinClick(coinPriceInfo: CoinPriceInfo)
    }
}