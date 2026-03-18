package Ejercicio08

// Sistema de pedidos en una fritanga
//Una fritanga local desea registrar pedidos de comida.

data class Pedido (
    var cliente: String,
    var platillo: String,
    var precio: Double,
){
    fun mostrarPedidos(){
        return println("Detalles del pedido \nCliente: $cliente \nPlatillo: $platillo \nPrecio: C$$precio")
    }
}

fun main (){
    val pedido1 = Pedido("Sara", "Barbacoa", 250.0)
    val pedido2 = Pedido("Hazell", "Nacatamal", 150.0)
    val pedido3 = Pedido("Arlen", "Pescado Frito", 180.0)

    pedido1.mostrarPedidos()
    println()
    pedido2.mostrarPedidos()
    println()
    pedido3.mostrarPedidos()
}