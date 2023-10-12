fun main(args: Array<String>) {
    val workers = listOf(Saler("Яна", 90),
        Programmer("kotlin", 20),
        Saler("Максим", 39),
        Programmer("js", 24),
        Director("Ник", 50))

    for (i in workers) {
        i.work()
//        i as Cleaner
//        i.clean()  //   будет ошибка, т к у Director нет метода clean()
        if (i is Programmer) {
            println(i.language)
        }
        if (i is Cleaner) {
            i.clean()
        }
    }

    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for (i in cleaners) {
        i.clean()
    }
}