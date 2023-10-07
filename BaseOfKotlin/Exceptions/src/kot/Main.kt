package kot

import java.lang.Exception

//fun main() {
//    println(sum("10", "17lk"))
//}
//
//fun sum(a: String, b: String): Int {
//    return try {
//        val numA = a.toInt()
//        val numB = b.toInt()
//        numA + numB
//    } catch (e: Exception) {
//        0
//    }
//}

var name: String? = "Sergey"

fun main() {
    if (name != null) {
        if (name?.length!! > 5) {
            println("Больше 5-ти")
        } else {
            println("Меньше 5-ти")
        }
    }
}