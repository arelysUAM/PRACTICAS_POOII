package run

fun main (){
    var age = 0

    println(age)

    age = 13

    println(age)

    var lk1 = "Arelys"
    println("My name is: $lk1" )

    val college  = "UAM"
    println("My university is: $college" )

    //Variables de tipo entero
    val quan : Int = 20
    var totalstudents : Int = 21
    println("Cantidad de estudiantes: $quan \nTotal de estudiantes: $totalstudents") //Interpolación

    //Variables de tipo decimal
    val price: Double = 99.99
    var average : Float = 100.0f

    //average = 99.9f

    println("Promedio: $average \nPrecio $price ")

    //Texto
    val phase: String = "It gets easier every day"
    println(phase)

    //Caracter
    var grade : Char = 'A'
    println("Su calificación es: $grade")

    //Booleanos
    var isActive : Boolean = true
    isActive = false
    println(!isActive)

    val answerString = generateAnswerString(42)
    println(answerString)
}

