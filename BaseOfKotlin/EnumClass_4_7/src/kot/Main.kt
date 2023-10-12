package kot

import kot.Month.*
import kot.Season.*

fun main() {
//    val season = when ("June") {
//        "June", "July", "August" -> "Summer"
//        "September", "October", "November" -> "Autumn"
//        "December", "January", "February" -> "Winter"
//        "March", "April", "May" -> "Spring"
//        else -> "Not defined"
//    }

    val month = SEPTEMBER
    val season = when (month) {
         JUNE, JULY, AUGUST -> SUMMER
             SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
            DECEMBER, JANUARY, FEBRUARY -> WINTER
            MARCH, APRIL, MAY -> SPRING
    }

    println(month.tempAverage)
    println(season)
}