package kot

import java.util.*

fun main() {
    val month = "fgf".lowercase(Locale.getDefault())
    val season: String = when (month) {
        "january", "february", "december" ->
            "winter"
        "march", "april", "may" ->
            "spring"
        "june", "july", "august" ->
            "summer"
        else -> {
            "autumn"
        }
    }
    println(season)

    val temperature = 90
    val state = when {
        temperature < 0 -> "ice"
        temperature in 0 until 100 -> "water"
        else -> "gas"
    }
    println(state)
}