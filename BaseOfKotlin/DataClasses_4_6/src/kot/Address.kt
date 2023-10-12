package kot

data class Address(val city: String, val street:String, val house: Int) {
}

//class Address(val city: String, val street:String, val house: Int) {
//    fun copy(city: String = this.city, street: String = this.street, house: Int = this.house): Address =
//        Address(city, street, house)
//
//    operator fun component1() = city
//    operator fun component2() = street
//    operator fun component3() = house
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Address
//
//        if (city != other.city) return false
//        if (street != other.street) return false
//        if (house != other.house) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = city.hashCode()
//        result = 31 * result + street.hashCode()
//        result = 31 * result + house
//        return result
//    }
//}