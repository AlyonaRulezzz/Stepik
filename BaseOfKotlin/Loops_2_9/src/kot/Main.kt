package kot

fun main() {
//    val array = arrayOf(1, 5, 3 ,6, 5, 4)
//    for (i in array)
//        println(i)

    val  array = arrayOfNulls<Int?>(101)
    for (i in array.indices) {
        array[i] = i
    }
//    for (i in array)
//        println(i)

//        for (i in 100 downTo 0 step 3)
//            println(i)

    val newArray = arrayOfNulls<Int?>(101)
    for (i in 0..100) {
        array[i] = i
    }
    for ((index, i) in array.withIndex()) {
        array[index] = i?.times(2)
    }
//    for (i in array) {
//        println(i)
//    }

    val homeworkArray = arrayOfNulls<Int>(301)
    for ((index, i) in (300..600).withIndex()) {
        homeworkArray[index] = i
    }
    for (i in 300 downTo 0 step 5) {
        println(homeworkArray[i])
    }
}