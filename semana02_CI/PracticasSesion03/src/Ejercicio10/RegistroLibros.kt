package Ejercicio10

//Sistema de biblioteca universitaria
//La biblioteca de la universidad quiere registrar libros.

class Libro (
    var titulo : String,
    var autor : String,
    var anioPublicacion : Int,
){
    fun mostrarInformacion(): String {
        return "Información \nTítulo: $titulo \nAutor: $autor \nAño de Publicación: $anioPublicacion"
    }
}

fun main (){
    val libro1 = Libro("Código Limpio", "Robert C. Martin", 2008)
    val libro2 = Libro("Algoritmos ilustrados", "Aditya Bhargava", 2016)
    val libro3 = Libro("El mítico hombre-mes", "Frederick P. Brooks Jr", 1975)
    val libro4 = Libro("No me hagas pensar", "Steve Krug", 2000)

    println(libro1.mostrarInformacion())
    println()
    println(libro2.mostrarInformacion())
    println()
    println(libro3.mostrarInformacion())
    println()
    println(libro4.mostrarInformacion())
}