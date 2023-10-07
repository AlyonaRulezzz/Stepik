import java.util.StringJoiner

fun main(args: Array<String>) {
    val nameList = mutableListOf<String>()
    val namePrototype = listOf("Алина", "Игорь", "Елена", "Сергей", "Максим")
    for (i in 0..999) {
        nameList.add( namePrototype[(Math.random() * 5).toInt()] )
//        println(nameList[i])
    }

    val phoneList = mutableListOf<String>()
    val phonePrototype = listOf("+7-911-000-00-00", "+7-911-000-00-01", "+7-911-000-00-02",
        "8-911-000-00-03", "8-911-000-00-04")
    for (i in 0..999) {
        phoneList.add( phonePrototype[(Math.random() * 5).toInt()] )
//        println(phoneList[i])
    }

    val users = nameList.zip(phoneList)
//    for (user in users)
//        println("${user.first}, ${user.second}")


    val fio = arrayOf("Алова Алина", "Истров Игорь", "Елева Елена",
        "Серов Сергей", "Максов Максим")
    val surname = arrayOfNulls<String>(fio.size)
    val name = arrayOfNulls<String>(fio.size)

    for ((index, i) in fio.withIndex()) {
        surname[index] = i.split(" ")[0]
        name[index] = i.split(" ")[1]
    }

//    val zippedFio = surname.zip(name)
    val zippedFio = fio.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }
    for (i in zippedFio)
        println(i)
}