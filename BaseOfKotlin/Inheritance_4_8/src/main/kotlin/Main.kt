fun main(args: Array<String>) {
    val dog = Dog(10f)
    println(dog.habitat)

    val workers = listOf(Worker("Яна", 90), Programmer("kotlin", 20),
        Worker("Максим", 39), Programmer("js", 24))

    for (i in workers)
        i.work()
}