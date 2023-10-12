import java.util.StringJoiner

fun main(args: Array<String>) {
//    val list: MyList<String> = MyArrayList<String>()
    val list: MyList<Float> = MyArrayList<Float>()

    for (i in 0..100) {
        list.add(i.toFloat())
    }

    for (i in 0..90) {
        list.removeAt(0)
    }

    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}