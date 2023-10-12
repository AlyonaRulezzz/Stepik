class Programmer(val language: String, age: Int): Worker("Программист", age) {
    override fun work() {
        println("Пишу код на $language")
    }
}