fun main(args: Array<String>) {
    val revenueByWeek = listOf(
        listOf(8, 7, 5, 1, 8),
        listOf(7, 6, 5, 2, 3),
        listOf(3, 6, 4, 1, 9),
        listOf(2, 4, 5, 4, 2)
    )

//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it) {
//            total.add(i)
//        }
//    }

    val total = revenueByWeek.flatten()
//    val total = revenueByWeek.flatMap { it }

    val average1 = total.average()
//    println(average1)

//    val data = mutableMapOf<String, List<Int>>()
//    data["file1"] = listOf(15, 20, 45, 33, 10)
//    data["file2"] = listOf(21, 30, 40, 22, 19)
//    data.put("file3", listOf(16, 11, 45, 20, 13))

//    val data = mapOf<String, List<Int>>(
//        "file1" to listOf(15, 20, 45, 33, 10), "file2" to listOf(21, 30, 40, 22, 19), "file3" to listOf(16, 11, 45, 20, 13)
//    )

    val data = mapOf<String, List<Int>>(
        Pair("file1", listOf(15, 20, 45, 33, 10)),
        Pair("file2", listOf(21, 30, -40, 22, 19)),
        Pair("file3", listOf(16, 11, 45, 20, 13))
    )

//    val average = data.flatMap { it.value }.average()
//    println(average)

//    val average = data.filterNot {
//        it.value.any { it < 0 }
    val average = data.filter {
        it.value.all { it > 0 }
    }.flatMap { it.value }.average()
    println(average)

}