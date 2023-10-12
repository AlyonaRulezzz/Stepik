class MyRandom {
    companion object {
        private const val MONDAY = "Monday"
        private const val TUESDAY = "Tuesday"
        private const val WEDNESDAY = "Wednesday"
        private const val THURSDAY = "Thursday"
        private const val FRIDAY = "Friday"
        private const val SATURDAY = "Saturday"
        private const val SUNDAY = "Sunday"

        fun randomIntNumber(from: Int, to: Int) =
            (Math.random() * (to - from + 1)).toInt() + from

//        fun randomBoolean() = ((Math.random() * 100).toInt() % 2) == 0
        fun randomBoolean() = randomIntNumber(0, 1) == 0

        fun randomWeekday() = when ((Math.random() * 100).toInt() / 10) {
            0, 1 -> MONDAY
            2 -> TUESDAY
            3 -> WEDNESDAY
            4, 5 -> THURSDAY
            6 -> FRIDAY
            7 -> SATURDAY
            else -> SUNDAY
        }
    }

}