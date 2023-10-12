fun main(args: Array<String>) {
    val cat = Cat("Barsik",5 , 4f)
    cat.printInfo()
//    cat.isOld()
    println(cat.isOld)
    cat.age = 13
    println(cat.isOld)

    val worker = Worker("Mary", "developer", 2015)
    worker.info()
}

fun Worker.info() {
    println("$name, $jobTitle, $hiredYear, $experience")
    work()
}

//fun Cat.isOld() = println(age > 12)