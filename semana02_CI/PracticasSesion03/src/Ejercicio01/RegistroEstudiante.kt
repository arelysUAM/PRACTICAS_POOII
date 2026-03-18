package Ejercicio01

//Registro de estudiantes universitarios
//La universidad necesita un sistema sencillo para registrar estudiantes de Ingeniería en Sistemas.

class Estudiante (
    //Declarar atributo de la clase
    //Incluirlo en el constructor
    var nombre:String,
    var carnet:String,
    var carrera:String,
    var anio:Int = 0) {
    fun mostrarDatos(){
        println("Nombre: $nombre \nCarnet: $carnet \nCarrera: $carrera \nAño: $anio")
    }
}

fun main(){
    val estudiante1 = Estudiante("Arelys", "24011333", "Ingeniería en Sistemas", 3)
    val estudiante2 = Estudiante("Ashley", "24001001", "Arquitectura", 2)
    val estudiante3 = Estudiante("Hazell", "24002002", "Nutrición", 1)

    estudiante1.mostrarDatos()
    println()
    estudiante2.mostrarDatos()
    println()
    estudiante3.mostrarDatos()
}