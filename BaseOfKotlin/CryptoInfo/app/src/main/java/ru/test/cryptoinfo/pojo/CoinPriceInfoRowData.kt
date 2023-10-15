package ru.test.cryptoinfo.pojo

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinPriceInfoRowData(
//    @SerializedName("coinPriceInfoJsonObject") // так возвращает null
    @Expose
    @SerializedName("RAW")
    val coinPriceInfoJsonObject: JsonObject? = null
)