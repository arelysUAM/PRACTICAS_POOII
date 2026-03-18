package Ejercicio02

//Sistema de productos de una pulpería
//Una pulpería de barrio en Masaya necesita registrar sus productos.

data class Producto (
    var nombre:String,
    var precio: Double,
    var cantidad:Int
    ){
    fun mostrarProductos(){
        return println("Producto: $nombre \nPrecio: C$$precio \nCantidad: $cantidad")
    }
}

fun main(){
    val producto1 = Producto("Arroz", 80.0,2)
    val producto2 = Producto("Frijoles",90.0,8)
    val producto3 = Producto("Azúcar",40.0,6)
    val producto4 = Producto("Aceite",30.0,4)
    val producto5 = Producto("Jabón",60.0,1)

    producto1.mostrarProductos()
    println()
    producto2.mostrarProductos()
    println()
    producto3.mostrarProductos()
    println()
    producto4.mostrarProductos()
    println()
    producto5.mostrarProductos()
}