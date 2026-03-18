package Ejercicio09

//Herencia en el sistema educativo
//La universidad desea modelar las personas dentro del sistema académico.

open class Persona (
    var nombre: String,
    var edad: Int,
){
    open fun mostrarDados(): String{
        return "Nombre: $nombre \nEdad: $edad"
    }
}

class Docente (nombre: String, edad: Int, var asignatura: String) : Persona(nombre, edad){
    override fun mostrarDados(): String {
        return super.mostrarDados() + "\nAsignatura: $asignatura"
    }
}
class Estudiante (nombre: String, edad: Int, var cif: Int) : Persona(nombre, edad){
    override fun mostrarDados(): String {
        return super.mostrarDados() + "\nCif: $cif"
    }
}

fun main (){
    val docente = Docente("Alejandro", 38, "Contabilidad")
    val estudiante = Estudiante("Arelys", 22, 24011333)
    println(docente.mostrarDados())
    println()
    println(estudiante.mostrarDados())
}