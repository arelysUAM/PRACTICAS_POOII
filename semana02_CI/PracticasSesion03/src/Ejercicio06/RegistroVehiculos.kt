package Ejercicio06

//Sistema de taxis
//Una cooperativa de taxis de Granada quiere registrar sus vehículos.

class Taxi (
    var placa : String,
    var conductor : String,
    var modelo : String,
){
    fun iniciarServicio(){
        println("El servicio ha iniciado. \nDatos del viaje \n-Conductor asignado: $conductor \n-Placa: $placa \n-Modelo: $modelo")
    }
}

fun main(){
    val taxi1 = Taxi("GR 0102",  "Brayton",  "Sportage")
    taxi1.iniciarServicio()
}