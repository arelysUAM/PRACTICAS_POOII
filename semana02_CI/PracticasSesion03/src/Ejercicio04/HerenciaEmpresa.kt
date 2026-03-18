package Ejercicio04

//Herencia en una empresa de software
//Una empresa de desarrollo de software en Managua tiene diferentes tipos de empleados.

open class Empleado (
    private var nombre : String,
    private var salario : Double,
){
    //open para permitir que la función pueda heredarse y modificarse
    open fun mostrarInformacion(): String {
        return "Empleado: $nombre \nSalario: $$salario"
    }
}

class Programador (nombre: String,
                   salario: Double,
                   var lenguaje: String):Empleado(nombre,salario){
    override fun mostrarInformacion(): String {
        //super permite usar lo del padre y extenderlo, no reemplazarlo completamente
        return super.mostrarInformacion() + "\nLenguaje: $lenguaje"
    }
}

fun main(){
    val programador = Programador("Arelys", 1000.0, "Kotlin")
    println(programador.mostrarInformacion())
}