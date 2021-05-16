import java.lang.NullPointerException

const val PI = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")

    var dinero = 10 //lectura - escritura
    println(dinero)
    dinero = 5
    println(dinero)

    val nombre = "Maria" //variable lectura
    println(nombre)

    println(PI)

    val boolean = true
    val numerolargo = 300000000000000L
    val double = 2.7182
    val float = 1.1f
    val primerValor = 20
    val segundo = 10
    val tercerValor = primerValor.minus(segundo)
    println(tercerValor)
    val cuartoValor = tercerValor - segundo;
    println(cuartoValor)

    val apellido = "Vetri"
    val nombreG = "Giuseppe"
    val nombreCompleto = nombreG + " " + apellido
    println(nombreCompleto)
    val nombreCompleto2 = "$nombreG $apellido"
    println(nombreCompleto2)

    //IF
    val nombreM = "li"

    if (nombreM.isNotEmpty()) {
        println("El largo de nuestra variable nombre es ${nombreM.length}")
    } else {
        println("Error, la variable esta vacia")
    }

    //asignacion inmutable
    val mensaje: String = if (nombreM.length > 4) {
        "Tu nombre es largo!"
    } else if (nombreM.isEmpty()) {
        "Nombre esta vacio"
    } else {
        "Tienes un nombre corto"
    }

    println(mensaje)

    //WHEN
    val nombreColor = "Carmesi"

    when (nombreColor) {
        "Amarillo" -> println("El amarrillo es el color de la alegria")
        "Rojo", "Carmesi" -> println("Este color simboliza el calor")
        else -> println("Error. No tengo informacion del color")
    }

    val codigo = 404

    when (codigo) {
        in 200..299 -> println("Todo a ido bien")
        in 400..500 -> println("Algo a fallado")
        else -> println("Codigo desconocido, algo a fallado.")
    }

    val tallaDeZapatos = 46
    val mensaje2 = when (tallaDeZapatos) {
        41, 43 -> "Tenemos disponible"
        42, 44 -> "Casi no nos quedan!"
        45 -> "Lo siento no tenemos disponible"
        else -> "Estos zapatos solo vienen en tallas 41,42,43,44 y 45"
    }

    println(mensaje2)

    //WHILE - DO WHILE
    var contador = 10

    while (contador > 0) {
        println("El valor de contador es $contador")
        contador--
    }

    do {
        println("Generando numero aleatorio")
        val numeroAleatorio = (0..100).random()
        println("El numero generado es $numeroAleatorio")
    } while (numeroAleatorio > 50)

    //FOR
    val listOfFruit = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
    for (fruit in listOfFruit) {
        println("Hoy voy a comerme una fruta llamada $fruit")
    }

    listOfFruit.forEach { fruit ->
        println("Hoy voy a comerme una fruta nueva llamada $fruit")
    }

    val charactersDeFruit = listOfFruit.map { fruit ->
        fruit.length
    }
    println(charactersDeFruit)

    val listFiltrate = charactersDeFruit.filter { characters ->
        characters > 5
    }
    println(listFiltrate)

    //TRY CATCH
    var nombre3: String? = null

    try {
        //println(nombre3!!.length) //double bang
        println(nombre3?.length) //self card
        throw NullPointerException("Referencia Nula")
    } catch (excepcion: NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error... Cerrando Aplicacion")
    }

    val primerValor1 = 10
    val segundoValor = 0

    val result: Int = try {
        primerValor / segundoValor
    } catch (exception: Exception) {
        0
    }
    println(result)

    //Elvis Operator
    var nombre4: String? = null
    val characterOfName: Int = nombre?.length ?: 0
    println(characterOfName)

    //LIST
    var listOfNames = listOf("Juan", "Enrique", "Camita")
    println(listOfNames)

    var listEmpty = mutableListOf<String>();
    println(listEmpty)

    listEmpty.add("Juan")
    println(listEmpty)

    val valueUsingGet = listEmpty.get(0)
    println(valueUsingGet)

    val valueUsingOperator = listEmpty[0];
    println(valueUsingOperator)

    val firstValueName = listOfNames.firstOrNull()
    println(firstValueName)

    listEmpty.removeAt(0)
    println(listEmpty)

    listEmpty.add("Wilson")

    listEmpty.removeIf { caracteres ->
        caracteres.length > 3
    }
    println(listEmpty)

    val myArray = arrayOf(1, 2, 3, 4)
    println("Nuestro array $myArray")
    println("Array como lista ${myArray.toList()}")

    //Ordenar lista
    val numberOfLottery = listOf(11, 22, 43, 56, 78, 66)
    val numberSorted = numberOfLottery.sorted()
    println(numberSorted)

    val numberOfLotteryDescend = numberOfLottery.sortedDescending()
    println(numberOfLotteryDescend)

    val orderByMultiple = numberOfLottery.sortedBy { numero -> numero < 50 }
    println(orderByMultiple)

    val numberAleatory = numberOfLottery.shuffled()
    println(numberAleatory)

    val numberReverse = numberOfLottery.reversed()
    println(numberReverse)

    val messagesOfNumber = numberOfLottery.map { number ->
        "Tu number de loteria es $number"
    }
    println(messagesOfNumber)

    val numberFiltered = numberOfLottery.filter { number ->
        number > 50
    }
    println(numberFiltered)

    //MAP
    val ageSuperHeros = mapOf(
        "Iroman" to 35,
        "Spriderman" to 23,
        "Capitan America" to 99
    )//mapas imnutables
    println(ageSuperHeros)

    val ageSuperHerosMutable = mutableMapOf(
        "Iroman" to 35,
        "Spriderman" to 23,
        "Capitan America" to 99
    )
    println(ageSuperHerosMutable)

    ageSuperHerosMutable.put("Wolverine", 45)
    println(ageSuperHerosMutable)
    ageSuperHerosMutable["Storm"] = 30
    println(ageSuperHerosMutable)

    val ageIroman = ageSuperHeros["Iroman"]
    println(ageIroman)

    ageSuperHerosMutable.remove("Wolverine")
    println(ageSuperHerosMutable)

    println(ageSuperHerosMutable.keys)
    println(ageSuperHerosMutable.values)

    //SETS
    val vocalRepeat = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(vocalRepeat)

    val numberFavorite = mutableSetOf(1, 2, 3, 4)
    println(numberFavorite)
    numberFavorite.add(5)
    println(numberFavorite)

    numberFavorite.remove(5)
    println(numberFavorite)

    val valueOfSet = numberFavorite.firstOrNull { number -> number > 2 }
    println(valueOfSet)

    //FUNCTION =>FUN
    val fraseRandom = "En platzi nunca paramos de aprender"
    //val fraseOrderedRandom = randomCase(fraseRandom)
    //println(fraseOrderedRandom)
    printFrase(randomCase(fraseRandom))
    printFrase(fraseRandom.randomCaseExt())

    printName("Wilson", "", "Neira")

    //LAMBDA
    val myLambda : (String) -> Int = {
        value -> value.length
    }
    val lambdaExecute : Int = myLambda("Hola")
    println(lambdaExecute)

    val greetings = listOf("Hello", "Hola", "Ciao")
    val longOfGreetings = greetings.map (myLambda)
    println(longOfGreetings)

    //High Order Function
    var largeOfInitValue = superFunction(initValue = "Hola!", block = {valor -> valor.length})
    println(largeOfInitValue)

    val lambda = superFunctionInception("Wilson");
    val valueLambda = lambda();
    println(valueLambda)

    //Scope function => LET
    var name : String? = null
    name?.let {
        valor -> println("el nombre no es nulo, es $valor")
    }

    name ="Wilson"
    name?.let{
        valor -> println("el nombre no es nulo, es $valor")
    }

    //WITH
    val colors = listOf("Azul", "Amarillo", "Rojo")
    with(colors){
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }

    //RUN
    val movils = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiomi mi a3")
        .run {
            removeIf { movil -> movil.contains("Google") }
            this
        }
    println(movils)

    //APPLY
    val movilss = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiomi mi a3")
        .apply {
            removeIf { movil -> movil.contains("Google") }
        }
    println(movilss)

    //val colorss : MutableList<String>? = null
    val colorss : MutableList<String>? = mutableListOf("Azul", "Amarillo", "Rojo")
    colorss?.apply {
        println("Nuestros colores son $this")
        println("Cantidad de colores es $size")
    }

    //ALSO
    val movilsss = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiomi mi a3")
        .also {
            lista -> println("El valor origina de la lista es $lista")
        }.asReversed()

    println(movilsss)
}

fun superFunction(initValue : String, block : (String)->Int) : Int {
    return block(initValue)
}

fun superFunctionInception(name : String) : () -> String {
    return {
        "Hola desde la lambda $name"
    }
}

//funcion sin retorno
fun printFrase(frase : String) : Unit{
    println ("Tu frase es: $frase")
}

//funcion con retorno
fun randomCase (frase : String) : String{
    val numberRandom = (0..99).random()

    return if (numberRandom.rem(2) == 0) {
        frase.toUpperCase()
    } else {
        frase.toLowerCase()
    }
}

//funcion de extension
fun String.randomCaseExt () : String{
    val numberRandom = (0..99).random()

    return if (numberRandom.rem(2) == 0) {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}

fun printName(name: String, surname: String){
    println("Mi nombre es $name y mi apellido es $surname")
}

fun printName(name: String, secondName : String = "", surname: String){
    println("Mi nombre completo es $name $secondName $surname")
}