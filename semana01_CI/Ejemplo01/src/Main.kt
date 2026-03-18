fun main() {
    var name = "Kotlin"
    println("Hello, " + name + "!")
    name = "Arelys"
    println("Hello $name") //Interpolación

    for (i in 1..5) {
        println("i = $i")
    }
}