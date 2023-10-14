package ru.test.cryptoinfo.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinPriceInfoRowData(
    @Expose
//    @SerializedName("RAW")
    @SerializedName("coinPriceInfoJsonObject")
    val coinPriceInfoJsonObject: JsonObject? = null
)