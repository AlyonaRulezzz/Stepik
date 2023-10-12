var f = 0

fun main(args: Array<String>) {
    f = 9
//    val list: MyList<String> = MyArrayList<String>()
//    val list: MyList<Float> = MyArrayList<Float>()
    val list =
        MyArrayList.myListOf("ghg", "hghg", "srewr", "yuu", 4, 5f)

    for (i in 0..100) {
        list.add("$i")
    }

    for (i in 0..90) {
        list.removeAt(0)
    }

    for (i in 0 until list.size()) {
        println(list.get(i))
    }

    val dog = Dog()
    dog.printA()
}

//fun main() {
//    var a: Int? = 10
//    println(a > 5)
//}