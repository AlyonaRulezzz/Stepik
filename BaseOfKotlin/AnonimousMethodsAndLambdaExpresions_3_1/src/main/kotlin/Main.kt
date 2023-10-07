fun main(args: Array<String>) {

    val sum: (Int, Int) -> Int = {a, b -> a + b}
//    println(sum(2, 10))

//    val square: (Int) -> Int = {a -> a * a}
    val square: (Int) -> Int = {it * it}
//    println(square(7))

    val perimeter:(Int, Int) -> Int = { a, b -> (a + b) * 2 }
//    println(perimeter(0, -4))

    val helloName: (String) -> Unit = { println("Hello, $it") }
//    helloName("Anna")

//    val sort: (Array<Int>) -> Array<Int> = { array -> array.sortedArray() }
//    val array = arrayOf(9, 0, 8, -4)
//    for (i in sort(array))
//        println(i)

    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }

    val sortedArray = sort(arrayOf(9, 0, 8, -4))
    for (i in sortedArray)
        println(i)
}