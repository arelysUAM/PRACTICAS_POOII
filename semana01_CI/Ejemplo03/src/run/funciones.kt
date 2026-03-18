package run

//Ejemplo de recurso UAMV
fun generateAnswerString(count: Int): String {
    val answerString = if (count == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }
    return answerString
}

fun sayHello() {
    println("Hello World!")
}

fun greet (name: String) {
    println("Hola $name, mucho gusto.")
}

//Funciones que retornan un valor
fun addGrade (garde: Int, extra: Int): Int {
    return garde + extra
}

fun getScore(score : Int, extra : Int) : Int = score + extra

fun createUser (name: String, rol : String = "Usuario") {
    println("Usuario $name y su rol $rol")
}

fun main(args: Array<String>) {
    sayHello()
    greet("Hazell")
    val garde = addGrade(65, 5)
    println(garde)

    println ("Nota final ${addGrade(70, 10)}")
    println("Aumento ${addGrade(100, 20)}")
    createUser("Arelys", rol = "Administrador")
    createUser(rol = "Administrador", name = "Arelys") // No cambio
}
