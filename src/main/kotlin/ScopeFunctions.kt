class ScopeFunctions {
    fun let() {
        var name: String? = null
        name = "Jose Ramon"

        name?.let { value ->
            println("En nombre no es nulo es $value")
            println(value)
        }
    }
}