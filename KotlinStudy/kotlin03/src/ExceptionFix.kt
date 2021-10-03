import java.lang.Exception
import java.lang.IllegalArgumentException

fun main() {
    var number: Int? = null
    try {
        checkOperation(number)
        number!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
}

fun checkOperation(number: Int?) {
//    number ?: throw UnskilledException()
    checkNotNull(number, {"Something is not good."})
}

class UnskilledException() : IllegalArgumentException("操作不当")