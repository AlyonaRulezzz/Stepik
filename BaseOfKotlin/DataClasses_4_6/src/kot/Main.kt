package kot

fun main() {
//    val student1 = Student("Ivan", "Ivanov", "123456")
//    val student2 = Student("Ivan", "Ivanov", "123456")
////    val student2 = student1
////    val (name, lastName, id) = student2
//    val (name, _, id) = student2
//    println(name)
////    println(lastName)
//    println(id)
//
//    println(student1)
//    println(student2)
//    println(student1.hashCode())
//    println(student2.hashCode())
//    println(student1 == student2)
//    println(student1 === student2)
//
//    val student4 = student1.copy()
//    println(student4 === student1)
//
//    val student5 = student1.copy(id = "55555")
//    println(student1)
//    println(student5)

    val address1 = Address("Volgograd", "Port-Saida", 10)
    val address2 = address1.copy()

    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    println(address1 == address2)

    val (city, street, house) = address2
    println(city)
    println(street)
    println(house)
}