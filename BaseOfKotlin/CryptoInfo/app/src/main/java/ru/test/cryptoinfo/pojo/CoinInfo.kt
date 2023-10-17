package ru.test.cryptoinfo.pojo

import android.media.Rating
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*


data class CoinInfo(
//    @Expose
//    @SerializedName("Id")
//    val id: String? = null,

    @Expose
    @SerializedName("Name")
    val name: String? = null
//    ,
//
//    @Expose
//    @SerializedName("FullName")
//    val fullName: String? = null,
//
//    @Expose
//    @SerializedName("ImageUrl")
//    val imageUrl: String? = null,
)