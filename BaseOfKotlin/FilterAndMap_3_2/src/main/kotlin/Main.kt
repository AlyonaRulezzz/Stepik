import kotlin.concurrent.fixedRateTimer

fun main(args: Array<String>) {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }

    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
//    for (i in listOfEvenNumbers)
//        println(i)

    val listOfNames = listOf<String>("Ally", "Maks", "Antonian", "Jessy")
    val listOfANames = listOfNames.filter { it.startsWith("A") }
//    for (i in listOfANames)
//        println(i)


    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { number: Int -> number * 2 }
//    for (i in doubledNumbers)
//        println(i)

    val employees = numbers.map { "Employee №$it" }
//    for (i in employees)
//        println(i)

    val array = arrayOf(8, 9, 0, -4, 3)
    val sortedArray = array.sortedDescending()
//    for (i in sortedArray)
//        println(i)

    val randomNumbers = mutableListOf<Int>()
    for (i in 0 until 1000)
        randomNumbers.add((Math.random() * 1000).toInt())
    val modifiedrandomNumbers = randomNumbers.filter { (it % 5 == 0) || (it % 3 == 0) }.map { it * it }
        .sortedDescending().map { it.toString() }
    for (i in modifiedrandomNumbers)
        println(i)
}