class Programmer(val language: String, age: Int):
    Worker("Программист", age),Cleaner {
    override fun work() {
        println("Пишу код на $language")
    }

    override fun clean() {
        println("Программист убирает")
    }
}