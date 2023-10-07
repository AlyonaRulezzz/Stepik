package kot

    fun main() {
//        println(max(10, 15))
//        println(crop("123"))
//        println(sum(10, 12, -4))
//        val numbers = mutableListOf<Int>(5, 7, 1, 2, 0)
        val numbers = arrayOf(5, 7, 1, 2, 0)
        val result = sort(numbers)
//        val result = sort(7, 1, 2, 0, 5, 3, 5)
        for (i in result)
            println(i)
    }

    fun max(a:Int, b: Int) = if (a > b) a else b

    fun crop(s: String) = s.substring(0, Math.min(5, s.length))

fun sum(vararg numbers: Int): Int {
    var res = 0
    for (num in numbers) {
        res += num
    }
    return res
}

fun sort(numbers: MutableList<Int>) : List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

fun sort(array: Array<Int>) : List<Int> {
    return sort(array.toMutableList())
}

fun sort(vararg numbers: Int) : List<Int> = sort(numbers.toMutableList())