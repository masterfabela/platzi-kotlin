class Control {
    fun controlIf() {
        val name = "Maria"
        if (name.isNotEmpty()) {
            println("El largo de nuestra variable nombre es ${name.length}")
        } else {
            println("Error la variable esta vacia")
        }
        val message: String =
            when {
                name.length > 4 -> {
                    "Tu nombre es largo"
                }
                name.isEmpty() -> {
                    "Tu nombre esta vacio"
                }
                else -> {
                    "Tienes un nombre corto"
                }
            }
        println(message)
    }

    fun controlWhen() {
        val colorName = "Carmesi"
        when (colorName) {
            "Amarillo" ->
                println("El amarillo es el color de la alegria")
            "Rojo", "Carmesi" ->
                println("El rojo simboliza el calor")
            else ->
                println("Error no tengo informacion del color")
        }

        val code = 404
        when (code) {
            in 200..299 -> println("Todo ha ido bien")
            in 400..500 -> println("Algo ha fallado")
            else -> println("Codigo desconocido algo ha fallado")
        }

        val shoesSize = 41
        val message = when (shoesSize) {
            41, 43 -> "Tenemos disponible"
            42, 44 -> "Casi no nos quedan"
            else -> "No esta disponible"
        }
        println(message)
    }
}