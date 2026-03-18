package Ejercicio03

//Sistema de transporte urbano
// La alcaldía desea modelar buses del transporte urbano.

class Bus (
    var numeroRuta : Int,
    var capacidad : Int,
    var conductor : String,
){
    fun iniciarRuta(){
        return println("La ruta $numeroRuta con capacidad $capacidad pasajeros ha iniciado...")
    }
}

fun main(){
    val bus1 = Bus(201,40,"Arelys")
    val bus2 = Bus(222,60,"Hazell")

    bus1.iniciarRuta()
    println()
    bus2.iniciarRuta()
}