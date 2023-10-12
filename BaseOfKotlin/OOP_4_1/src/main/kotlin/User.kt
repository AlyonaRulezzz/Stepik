class User {
    var age: Int = 0
        set(value) {
            if (value >= 0) field = value
        }
    var name: String? = null
        get() = if (field == null) "" else field

//    fun setAge(age: Int) {
//        this.age = age
//    }
//    fun getAge() = age
//
//    fun setName(name: String) {
//        this.name = name
//    }
//    fun getName() = name
}