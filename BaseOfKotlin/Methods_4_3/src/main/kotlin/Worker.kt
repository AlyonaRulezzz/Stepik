import java.time.Year
import java.util.*

class Worker(val name: String, val jobTitle: String, val hiredYear: Int) {
    fun work() = println("Работаю...")

    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - hiredYear
}