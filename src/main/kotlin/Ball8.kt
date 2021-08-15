const val AFIRMATIVE_ANSWER = "✔"
const val NEGATIVE_ANSWER = "❌"
const val NEUTRAL_ANSWER = "?"

val answers = mapOf(
    "Si" to AFIRMATIVE_ANSWER,
    "Es cierto" to AFIRMATIVE_ANSWER,
    "Totalmente" to AFIRMATIVE_ANSWER,
    "Sin duda" to AFIRMATIVE_ANSWER,
    "Pregunta en otro momento" to NEUTRAL_ANSWER,
    "No puedo decirte en este momento" to NEUTRAL_ANSWER,
    "Puede que si o puede que no" to NEUTRAL_ANSWER,
    "No va a suceder" to NEGATIVE_ANSWER,
    "No cuentes con ello" to NEGATIVE_ANSWER,
    "Definitivamente no" to NEGATIVE_ANSWER,
    "No lo creo" to NEGATIVE_ANSWER
)

class Ball8 {

    fun main() {
        println("Hola soy tu bola 8 magica creada en kotlin. Cual de estas opciones deseas realizar")
        println("1. Realizar una pregunta")
        println("2. Revisar todas las respuestas")
        println("3. Salir")
        when (readLine()) {
            "1" -> makeQuestion()
            "2" -> showAnswer()
            "3" -> exit()
            else -> showError()
        }
    }

    private fun showError() {
        println("Valla parece que has elegido una opcion no valida")
    }

    private fun exit() {
        println("Hasta luego!")
    }

    private fun showAnswer() {
        println("Seleciona una opcion")
        println("1. Revisar todas las respuestas")
        println("2. Revisar solo las respuestas afirmativas")
        println("3. Revisar solo las respuestas dudosas")
        println("4. Revisar solo las respuestas negativas")
        when (readLine()) {
            "1" -> showAnswersByType()
            "2" -> showAnswersByType(AFIRMATIVE_ANSWER)
            "3" -> showAnswersByType(NEUTRAL_ANSWER)
            "4" -> showAnswersByType(NEGATIVE_ANSWER)
            else -> println("Respuesta no valida. Adios.")
        }
    }

    private fun showAnswersByType(answerType: String = "TODOS") {
        when (answerType) {
            "TODOS" -> answers.keys.forEach { answer -> println(answer) }
            AFIRMATIVE_ANSWER -> answers
                .filterValues { value -> value == AFIRMATIVE_ANSWER }
                .run { println(keys) }
            NEGATIVE_ANSWER -> answers
                .filterValues { value -> value == NEGATIVE_ANSWER }
                .run { println(keys) }
            NEUTRAL_ANSWER -> answers
                .filterValues { value -> value == NEUTRAL_ANSWER }
                .run { println(keys) }
        }
    }

    fun makeQuestion() {
        println("Que pregunta deseas realizar?")
        readLine()
        println("Asi que esa era tu pregunta... La respuesta a eso es:")
        val generatedAnswer = answers.keys.random()
        println(generatedAnswer)
    }
}