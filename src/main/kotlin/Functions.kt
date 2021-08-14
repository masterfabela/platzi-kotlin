class Functions {
    fun functions() {
        printSentence("En platzi nunca paramos de aprender".randomCase())
    }

    fun functionsParams() {
        printName(name = "Jose Ramon", lastName = "Vieites")
    }

    fun lambdas() {
        val myLambda: (String) -> Int = { valor -> valor.length }
        println(myLambda("Hola mundo"))

        val greetings = listOf("Hello", "Hola", "Ciao")
        val greetingsLong = greetings.map(myLambda)
        println(greetingsLong)
    }

    fun highOrderFunctions() {
        println(superFunction(initialValue = "Jose Ramon", block = { name -> name.length }))
        println(inceptionFunction("Jose Ramon")())
    }

    fun superFunction(initialValue: String, block: (String) -> Int): Int {
        return block(initialValue)
    }

    fun inceptionFunction(name: String): () -> String {
        return { "Hola desde la lambda $name" }
    }

    private fun printName(name: String, lastName: String, lastName2: String = "") {
        println("Mi nombre completo es $name $lastName $lastName2")
    }

    private fun String.randomCase(): String {
        return when ((0..1).random()) {
            0 -> this.uppercase()
            else -> this.lowercase()
        }
    }

    private fun printSentence(sentence: String) {
        println("Tu frase es: $sentence")
    }
}