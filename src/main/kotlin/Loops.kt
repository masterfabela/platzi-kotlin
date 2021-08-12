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
}