import java.util.*

fun main(args: Array<String>) {
    val result =
        modifyString("Hello world!!!") { it.uppercase(Locale.getDefault()) }

//    println(result)

    val res = operateCollection((0..100).toList()) { it.sum() }

    println(res)
}

fun modifyString(string: String, modify: (String) -> String) : String {
    return modify(string)
}

inline fun operateCollection(collection: List<Int>, operator: (List<Int>) -> Int) : Int {
    return operator(collection)
}