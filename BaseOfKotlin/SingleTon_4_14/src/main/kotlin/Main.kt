fun main(args: Array<String>) {
//    val db = Database.getInstance()
    val db = Database
    db.insertData("1")
    db.insertData("2")
    db.insertData("3")

    val test = Test()
    test.insertTestData("4")
    test.insertTestData("5")
    test.insertTestData("6")

    for (str in db.data) {
        println(str)
    }
}



