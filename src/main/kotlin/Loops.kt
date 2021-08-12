class Loops {
    fun loopWhile() {
        var counter = 10
        while (counter > 0) {
            println("El valor de contador es $counter)}")
            counter--
        }
    }

    fun loopDoWhile() {
        do {
            val randomNumber = (0..100).random()
            println("El numero generado es $randomNumber")
        } while (randomNumber > 50)
    }

    fun loopFor() {
        val fruitList = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
        for (fruit in fruitList) {
            println("Hoy voy a comerne una fruta llamada $fruit")
        }
        fruitList.forEach { fruit ->
            run {
                println("Hoy voy a comerme una fruta nueva que se llama $fruit")
            }
        }
        val fruitsCharacters: List<Int> = fruitList.map { fruit ->
            fruit.length
        }
        println(fruitsCharacters)
        val filterList = fruitsCharacters.filter { fruitLength -> fruitLength > 5 }
        println(filterList)
    }
}