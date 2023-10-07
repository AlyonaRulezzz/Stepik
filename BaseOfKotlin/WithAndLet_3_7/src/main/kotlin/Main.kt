//var name: String? = null
var name: String? = "gl,;g,le;g"

//val numbersCollection: MutableList<Int>? = null
val numbersCollection: MutableList<Int>? = mutableListOf()

fun main(args: Array<String>) {
//    if (name == null) return
//    if (name?.length?.compareTo(5) == 1)
//        println("fdhf")

    name?.let {
//        if (it.length > 5)
//            println("fkmfd")
    }

    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0 until 1000) {
            add((Math.random() * 100).toInt())
        }

//        println(sum())
//        println(average())
//        println(min())
//        println(max())
//        println(first())
//        println(last())
    }

    numbersCollection?.let {
        with(numbersCollection) {
            for (i in 0..1000) {
                add((Math.random() * 1000).toInt())
            }
            val result = filter { it % 2 == 0 }.take(100)
            for (i in result)
                println(i)
        }
    }
}