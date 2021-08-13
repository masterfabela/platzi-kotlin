class Functions {
    fun functions() {
        printSentence("En platzi nunca paramos de aprender".randomCase())
    }

    fun String.randomCase(): String {
        return when ((0..1).random()) {
            0 -> this.uppercase()
            else -> this.lowercase()
        }
    }

    private fun printSentence(sentence: String) {
        println("Tu frase es: $sentence")
    }
}