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

    fun run() {
        val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
            .run {
                removeIf { mobile -> mobile.contains("Google") }
                this
            }
        println(mobiles)
    }

    fun apply() {
        val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
            .apply {
                removeIf { mobile -> mobile.contains("Google") }
            }
        println(mobiles)

        val colors: MutableList<String>? = mutableListOf("Amarillo", "Azul", "Rojo")
        colors?.run {
            println("Nuestros colores son $this")
            println("La cantidad de colores es $size")
        }
    }

    fun also() {
        val mobiles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
            .also { list ->
                println("El valor original de la lista es $list")
                list.removeIf { mobile -> mobile.contains("Google") }
            }.asReversed()
        println(mobiles)
    }
}