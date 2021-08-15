class ScopeFunctions {
    fun let() {
        var name: String? = null
        name = "Jose Ramon"

        name?.let { value ->
            println("En nombre no es nulo es $value")
            println(value)
        }
    }

    fun with() {
        val colors = listOf("Azul", "Amarillo", "Rojo")
        with(colors) {
            println("Nuestros colores son $this")
            println("Esta lista tiene una cantidad de colores de $size")
        }
    }
}