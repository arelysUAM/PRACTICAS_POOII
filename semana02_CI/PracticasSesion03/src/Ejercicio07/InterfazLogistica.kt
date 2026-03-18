package Ejercicio07

//Interfaces para vehículos
//Una empresa de logística usa diferentes tipos de transporte.

interface Vehiculo {
    fun mover (vehiculo: String):String
}

class Camion : Vehiculo {
    override fun mover(vehiculo: String): String {
        return "El $vehiculo se está moviendo."
    }
}

class Motocicleta : Vehiculo {
    override fun mover(vehiculo: String): String {
        return "La $vehiculo se está moviendo."
    }
}

fun main(){
    val vehiculo1 = Camion()
    val vehiculo2 = Motocicleta()
    println(vehiculo1.mover("camión"))
    println(vehiculo2.mover("motocicleta"))
}