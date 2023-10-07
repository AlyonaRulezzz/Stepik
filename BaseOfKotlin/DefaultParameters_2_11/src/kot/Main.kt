package kot

fun main() {
//    printInfo("Иванов", "Иван")
//    printInfo()
//    printInfo("", "Иван")
//    printInfo(patronymic = "Иванович", lastname = "Иванов")
    println(parallelepipedVolume(5, 7, 3))
}

fun printInfo(lastname: String = "", name: String = "", patronymic: String = "") {
    if (lastname.isNotEmpty())
        println("Фамилия: $lastname")
    if (name.isNotEmpty())
        println("Имя: $name")
    if (patronymic.isNotEmpty())
        println("Отчество: $patronymic")
}

//fun printInfo(lastname: String, name: String) {
//    printInfo(lastname, name, "")
//}

fun parallelepipedVolume(firstSide: Int,
                         secondSide: Int = firstSide, thirdSide: Int = firstSide) =
    firstSide * secondSide * thirdSide