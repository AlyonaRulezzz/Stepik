class Car(override var name: String = "Машина"): Transport(name) {
    override fun drive() {
        println("Машина едет...")
    }
    fun startEngine(code: Int) : Boolean = code != 0
}