class Saler(name: String, age: Int): Worker(name, age), Cleaner {
    override fun clean() {
        println("Продавец убирает")
    }

    override fun work() {
        println("Продаю товар")
    }
}