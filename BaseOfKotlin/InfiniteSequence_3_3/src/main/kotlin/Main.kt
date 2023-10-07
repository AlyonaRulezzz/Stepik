fun main(args: Array<String>) {
//    val array = (0..1000).toList()
//    val employees = array.map { "Employee №$it" }
//    val first30 = employees.take(30)
//    val drop30 = employees.drop(30)

//    val array = generateSequence(0) {
//        println("Сгенерировано ${it + 2}")
//        it + 2
//    }
//    val evenList = array.take(10)
//    for (i in evenList)
//        println(i)

    val array = generateSequence('A') {
//        println("Сгенерировано ${it + 1}")
        it + 1
    }

    val first10 = array.take(10)
//    for (i in first10)
//        println(i)

    val randomArray = generateSequence { (Math.random() * 200).toInt() }

    val employees = generateSequence(1) { it + 1 }.map { "Сотрудник №$it" }.take(100)
    for (i in employees)
        println(i)
}