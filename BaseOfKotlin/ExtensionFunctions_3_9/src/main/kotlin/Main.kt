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

    println(age.isPrime())
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