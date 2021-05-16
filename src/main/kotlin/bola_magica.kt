// Declaramos los valores de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✅"
const val RESPUESTA_NEGATIVA = "❌"
const val RESPUESTA_DUDOSA = "?"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main(args: Array<String>) {
    println("Hola soy tu bola 8 magica creada en Kotlin. Cual de estas opciones deseas realizar?")
    println("1.- Realiza una pregunta")
    println("2.- Revisar todas las respuesta")
    println("3.- Salir")

    val valueInput = readLine()

    when(valueInput){
        "1" -> makeQuestions()
        "2" -> showAnwser()
        "3" -> bye()
        else -> "Opcion incorrecta"
    }
}

fun makeQuestions(){
    println("Que pregunta deseas realizar?")
    readLine()
    println("Asi que esa era tu pregunta... La respues a eso es:")
    val generateAnswer = respuestas.keys.random()
    println(generateAnswer)
}

fun showAnwser(){
    println("Seleccion una opcion")
    println("1.- Revisar todas las respuesta")
    println("2.- Revisar solo las respuestas afirmativas")
    println("3.- Revisar solo las respuestas dudosas")
    println("4.- Revisar solo las respuestas negativa")

    val optionInput = readLine()
    when(optionInput){
        "1" -> showAnwserByTypo()
        "2" -> showAnwserByTypo(anwserType = RESPUESTA_AFIRMATIVA)
        "3" -> showAnwserByTypo(anwserType = RESPUESTA_NEGATIVA)
        "4" -> showAnwserByTypo(anwserType = RESPUESTA_DUDOSA)
        else -> println("Respuesta no valida. Adios")
    }
}

fun showAnwserByTypo(anwserType : String = "TODOS"){
    when(anwserType) {
        "TODOS" -> respuestas.keys.forEach{respuesta -> println(respuesta)}
        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { value -> value == RESPUESTA_AFIRMATIVA }
            .also{
                positiveAnwser -> println(positiveAnwser.keys)
            }
        RESPUESTA_DUDOSA -> respuestas.filterValues { value -> value == RESPUESTA_DUDOSA }
            .also{
                    dudaAnwser -> println(dudaAnwser.keys)
            }
        RESPUESTA_NEGATIVA -> respuestas.filterValues { value -> value == RESPUESTA_NEGATIVA }
            .also{
                    negativeAnwser -> println(negativeAnwser.keys)
            }
    }
}

fun bye() {
    println("Hasta luego")
}