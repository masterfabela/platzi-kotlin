import java.lang.Exception
import java.lang.NullPointerException

class NullSafety {
    fun tryCatch() {
        var name: String? = null

        try {
            throw NullPointerException("Referencia nula")
        } catch (exception: NullPointerException) {
            println("Ha ocurrido un error")
        } finally {
            println("Finalmente ha ocurrido un error... cerrando aplicacion")
        }
        
        val firstValue = 10
        val secondValue = 0
        val result: Int = try {
            firstValue / secondValue
        } catch (exception: Exception) {
            0
        }
        println(result)
    }
}