interface Calculadora {
    fun sumar(num1: Int, num2: Int): Int

    fun restar(num1: Int, num2: Int): Int

    fun multiplicar(num1: Int, num2: Int): Int

    fun dividir(num1: Double, num2: Double): Double
}

class MiCalculadora : Calculadora {
    override fun sumar(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    override fun restar(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    override fun multiplicar(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    override fun dividir(num1: Double, num2: Double): Double {
        return num1 / num2
    }
}

fun main() {
    val miCalculadora = MiCalculadora()
    println(miCalculadora.sumar(5, 10))
    println(miCalculadora.restar(5, 10))
    println(miCalculadora.multiplicar(5, 10))
    println(miCalculadora.dividir(6.0,2.0))
}