class Calc {
    companion object {
        private const val PI = 3.14
//        val PI = 3.14
//        get() = field * 2
        fun square(num: Int) = num * num
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }

}