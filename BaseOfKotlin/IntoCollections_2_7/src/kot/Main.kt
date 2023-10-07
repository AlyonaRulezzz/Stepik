package kot

fun main() {
    val array: Array<Int?> = arrayOf(1, 2, 3, 4)
    array[3] = null
    println(array[3])

    val array2 = arrayOfNulls<Int?>(10)
    println(array2[0])

//    val list = ArrayList<Int>()
//    better use abstractions, if it possible:
    val list: MutableList<Int> = ArrayList()
    list.add(10)
    println(list[0])

    val list1: MutableList<Int> = mutableListOf()
    list1.add(10)
    println(list1[0])
}