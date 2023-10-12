fun main(args: Array<String>) {
    val car: Transport = Car()
    val bike: Transport = Bike()
//    if (car is Car)
//        car.name = "Машина 2"

//    if (car !is Car) return
//    car.name = "Машина 2"

//    if (car is Car && car.startEngine(1)) // smart cast
//    if (car !is Car || car.startEngine(0)) // smart cast
//    if (car is Car || car.startEngine(0)) // CAN'T smart cast // error

//    println(car.name)

//    travel(car)

    travel(object: Transport("Мотобайк") {
        override fun drive() {
            println("Мотобайк едет...")
        }
    })

    val sportsman = Sportsman()
    sportsman.callWaterBearer(object: WaterBearer {
        override fun bringWater() {
//            println("Несу воду")
        }
    })

    val sportsman1 = Sportsman()
    sportsman1.callWaterBearer { println("Воды, пожалуйста") }
}

fun travel(transport: Transport) {
    transport.drive()
}