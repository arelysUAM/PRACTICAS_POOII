package Ejercicio01

class Estudiante{
    var nombre:String = ""
    var carnet:String = ""
    var carrera:String = ""
    var anio:Int = 0

    fun mostrarDatos(){
        println("Nombre: $nombre \nCarnet: $carnet \nCarrera: $carrera \nAño: $anio")
    }
}

fun main(){
    val estudiante1 = Estudiante()
    estudiante1.nombre = "Maria"
    estudiante1.carnet = "999"
    estudiante1.carrera = "Sistemas"
    estudiante1.anio = 2
    estudiante1.mostrarDatos()
    println()
}