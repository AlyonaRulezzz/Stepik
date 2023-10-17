package ru.test.cryptoinfo.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_price_list")
data class CoinPriceInfo(
    @Expose
    @SerializedName("TYPE")
    val type: String? = null,

    @Expose
    @SerializedName("MARKET")
    val market: String? = null,

    @PrimaryKey
    @Expose
    @SerializedName("FROMSYMBOL")
    val fromSymbol: String? = null,

    @Expose
    @SerializedName("TOSYMBOL")
    val toSymbol: String? = null,

    @Expose
    @SerializedName("FLAGS")
    val flags: String? = null,

    @Expose
    @SerializedName("LASTMARKET")
    val lastMarket: String? = null,

    @Expose
    @SerializedName("MEDIAN")
    val median: Double? = null,

    @Expose
    @SerializedName("TOPTIERVOLUME24HOUR")
    val topTierVolume24Hour: Double? = null,

    @Expose
    @SerializedName("TOPTIERVOLUME24HOURTO")
    val topTierVolume24HourTo: Double? = null,

    @Expose
    @SerializedName("LASTTRADEID")
    val lastTradeId: String? = null,

    @Expose
    @SerializedName("PRICE")
    val price: Double? = null,

    @Expose
    @SerializedName("LASTUPDATE")
    val lastUpdate: Int? = null,

    @Expose
    @SerializedName("LASTVOLUME")
    val lastVolume: Double? = null,

    @Expose
    @SerializedName("LASTVOLUMETO")
    val lastVolumeTo: Double? = null,

    @Expose
    @SerializedName("VOLUMEHOUR")
    val volumeHour: Double? = null,

    @Expose
    @SerializedName("VOLUMEHOURTO")
    val volumeHourTo: Double? = null,

    @Expose
    @SerializedName("OPENHOUR")
    val openHour: Double? = null,

    @Expose
    @SerializedName("HIGHHOUR")
    val highHour: Double? = null,

    @Expose
    @SerializedName("LOWHOUR")
    val lowHour: Double? = null,

    @Expose
    @SerializedName("VOLUMEDAY")
    val volumeDay: Double? = null,

    @Expose
    @SerializedName("VOLUMEDAYTO")
    val volumeDayTo: Double? = null,

    @Expose
    @SerializedName("OPENDAY")
    val openDay: Double? = null,

    @Expose
    @SerializedName("HIGHDAY")
    val highDay: Double? = null,

    @Expose
    @SerializedName("LOWDAY")
    val lowday: Double? = null,

    @Expose
    @SerializedName("VOLUME24HOUR")
    val volume24hour: Double? = null,

    @Expose
    @SerializedName("VOLUME24HOURTO")
    val volume24hourto: Double? = null,

    @Expose
    @SerializedName("OPEN24HOUR")
    val open24hour: Double? = null,

    @Expose
    @SerializedName("HIGH24HOUR")
    val high24hour: Double? = null,

    @Expose
    @SerializedName("LOW24HOUR")
    val low24hour: Double? = null,

    @Expose
    @SerializedName("CHANGE24HOUR")
    val change24hour: Double? = null,

    @Expose
    @SerializedName("CHANGEPCT24HOUR")
    val changepct24hour: Double? = null,

    @Expose
    @SerializedName("CHANGEDAY")
    val changeday: Double? = null,

    @Expose
    @SerializedName("CHANGEPCTDAY")
    val changepctday: Double? = null,

    @Expose
    @SerializedName("CHANGEHOUR")
    val changehour: Double? = null,

    @Expose
    @SerializedName("CHANGEPCTHOUR")
    val changepcthour: Double? = null,

    @Expose
    @SerializedName("CONVERSIONTYPE")
    val conversiontype: String? = null,

    @Expose
    @SerializedName("CONVERSIONSYMBOL")
    val conversionsymbol: String? = null,

    @Expose
    @SerializedName("CONVERSIONLASTUPDATE")
    val conversionlastupdate: Int? = null,

    @Expose
    @SerializedName("SUPPLY")
    val supply: Int? = null,

    @Expose
    @SerializedName("MKTCAP")
    val mktcap: Double? = null,

    @Expose
    @SerializedName("MKTCAPPENALTY")
    val mktcappenalty: Int? = null,

    @Expose
    @SerializedName("CIRCULATINGSUPPLY")
    val circulatingsupply: Int? = null,

    @Expose
    @SerializedName("CIRCULATINGSUPPLYMKTCAP")
    val circulatingsupplymktcap: Double? = null,

    @Expose
    @SerializedName("TOTALVOLUME24H")
    val totalvolume24h: Double? = null,

    @Expose
    @SerializedName("TOTALVOLUME24HTO")
    val totalvolume24hto: Double? = null,

    @Expose
    @SerializedName("TOTALTOPTIERVOLUME24H")
    val totaltoptiervolume24h: Double? = null,

    @Expose
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    val totaltoptiervolume24hto: Double? = null,

    @Expose
    @SerializedName("IMAGEURL")
    val imageurl: String? = null
)