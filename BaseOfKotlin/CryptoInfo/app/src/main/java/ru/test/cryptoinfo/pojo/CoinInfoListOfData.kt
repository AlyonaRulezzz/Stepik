package ru.test.cryptoinfo.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfoListOfData (
    @Expose
    @SerializedName("Data")
    val data: List<Datum>? = null
)