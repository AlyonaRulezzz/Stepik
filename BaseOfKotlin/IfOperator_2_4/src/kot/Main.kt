package kot

fun main() {
    var count = 500
    val food = if (count > 300) {
        count -= 300
        "pizza"
    } else if (count > 200) {
        count -= 200
        500
    } else {
        count -= 60
        null
    }
    println("Это $food. Food to String = ${food.toString()}")

    val a: Boolean? = true
    if (кa == true) {
        println("aaaa")
    }
}