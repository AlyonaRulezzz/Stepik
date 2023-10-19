package ru.test.cryptoinfo.utils

import java.sql.Date
import java.text.SimpleDateFormat
import java.util.*

fun convertTimestampToTime(timestamp: Long?): String {
    if (timestamp == null) return ""
    val stamp = java.sql.Timestamp(timestamp * 1000)
//    val date = Date(stamp.time)
//    val k = stamp.time
//    val k1 = timestamp * 1000
//    println("SSSS" + (k == k1))
    val date = Date(timestamp * 1000)
    val pattern = "HH:mm:ss"
    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
    sdf.timeZone = TimeZone.getDefault()
    return sdf.format(date)
}