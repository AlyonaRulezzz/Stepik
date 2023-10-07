fun main(args: Array<String>) {
    val data = mapOf(
        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )

    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val averageRevenueByWeek = data.filter {
        it.value.all { it > 0 }
    }.flatMap { it.value }.average()

    val averageRevenueByMonth = data.filter {
        it.value.all { it > 0 }
    }.map { it.value.sum() }.average()

    val maxRevenueByMonth = data.filter {
        it.value.all { it > 0 }
    }.map { it.value.sum() }.max()

    val maxRevenueMonths = data.filter {
        it.value.all { it > 0 }
    }.filter { it.value.sum() == maxRevenueByMonth }.map { it.key }

    val minRevenueByMonth = data.filter {
        it.value.all { it > 0 }
    }.map { it.value.sum() }.min()

    val minRevenueMonths = data.filter {
        it.value.all { it > 0 }
    }.filter { it.value.sum() == minRevenueByMonth }.keys

    val monthsWithErrors = data.filter {
        it.value.any { it < 0 }
    }.keys

    println("Средняя выручка в неделю: $averageRevenueByWeek\n" +
            "Средняя выручка в месяц: $averageRevenueByMonth\n" +
            "Максимальная выручка в месяц: $maxRevenueByMonth\n" +
            "Была в следующих месяцах: $maxRevenueMonths\n" +
            "Минимальная выручка в месяц: $minRevenueByMonth\n" +
            "Была в следующих месяцах: $minRevenueMonths\n" +
            "Ошибки произошли в следующих месяцах: $monthsWithErrors\n"
    )
}