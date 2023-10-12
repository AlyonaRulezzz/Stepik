import java.util.*

class Dog {
    var nickname = ""
        get() = field.lowercase(Locale.getDefault()).replaceFirstChar { it.uppercase() }
    var age = 0
        set(value) {
            if (value > 0)
                field = value
        }
    var weight = 0
        set(value) {
            if (value > 0)
                field = value
        }
}