import java.util.StringJoiner

fun main(args: Array<String>) {
    val age = 5
//    if ((age >= 12) && (age <= 100))
//    if (age in 12..100)
//        println("Valid")
//
//    if (age in 12..100)
//        println("Valid too")
//
//    if (age in 12..100)
//        println("Valid too 2")

//    if (isAgeValid(age))
//        println("Valid")
//
//    if (isAgeValid(age))
//        println("Valid too")
//
//    if (isAgeValid(age))
//        println("Valid too 2")

    if (age.isAgeValid())
        println("Valid")

    if (age.isAgeValid())
        println("Valid too")

    if (age.isAgeValid())
        println("Valid too 2")

//    println(age.isPositive())

//    println(age.isPrime())

    val list = listOf<Int>()
    val string = "fdfd"
//    myWith(string) {
//        println(this.toUpperCase())
//        println(toUpperCase())
//    }

    val obj = mutableMapOf<String, String>("dsfsd" to "1", "fdsfs" to "2")
    myWith(obj) {
        println(this.keys)
        values
    }
}

//fun isAgeValid(age:Int) = age in 6..100

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrime() : Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0)
            return false
    }
    return true
}

fun Any.isYou() = 0

//fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) {
//    list.operation()
//}
//
//fun myWith(string: String, operation: String.() -> Unit) {
//    string.operation()
//}

//fun myWith(obj: Any, operation: Any.() -> Unit) {
//    obj.operation()
//}

//inline fun<T> myWith(obj: T, operation: T.() -> Unit) {
//    obj.operation()
//}

inline fun<T, R> myWith(obj: T, operation: T.() -> R) : R {
    return obj.operation()
}