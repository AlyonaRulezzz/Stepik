class Sportsman {
    fun callWaterBearer(waterBearer: WaterBearer) {
        waterBearer.bringWater()
    }

    inline fun callWaterBearer(giveWater: () -> Unit) {
        giveWater()
    }
}