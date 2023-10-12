fun main(args: Array<String>) {
    val user = User()
//    user.setAge(15)
//    user.setName("Andrey")
//    println("${user.getName()}, ${user.getAge()}")
//    user.name = "Andrey"
    user.age = 5
    println("${user.name}, ${user.age}")

    val dog = Dog()
    dog.nickname = "kookoo"
    println(dog.nickname)
}