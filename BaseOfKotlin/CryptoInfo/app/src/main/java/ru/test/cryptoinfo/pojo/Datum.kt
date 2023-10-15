package ru.test.cryptoinfo.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Datum (
    @Expose
//    @SerializedName("Id")
    @SerializedName("CoinInfo")
    val coinInfo: CoinInfo? = null
)