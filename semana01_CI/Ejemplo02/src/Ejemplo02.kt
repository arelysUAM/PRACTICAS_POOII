import javax.swing.JOptionPane

class Ejemplo2 {
    fun saludar(nombre: String) {
        println("Hola $nombre")
    }

    fun producto(nu1: Int, nu2: Int): Int {
        return nu1 * nu2
    }
}

fun main(args: Array<String>) {

    val saludo = Ejemplo2()
    saludo.saludar("Manuel")

    val num1 = 10
    val num2 = 20

    println(saludo.producto(num1, num2))

    val prod = saludo.producto(num1, num2)
    JOptionPane.showMessageDialog(null, "Producto: $prod")

    var c = Calculadora()
    var suma: Int = c.Suma(num1, num2)

    println(suma)
}