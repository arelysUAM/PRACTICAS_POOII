//Clases y objetos
class Estudiante {
    var nombre = ""
    var edad = 0

    fun estudiar(){
        println("$nombre esta estudiando...")
    }

}

//Encapsulamiento
class Asignatura(private val nombre: String, private val precio: Double) {

    fun getNombre(): String {
        return "La asignatura es $nombre"
    }

    fun getPrecio(): Double {
        return precio
    }
}

fun main(){
    val estudiante = Estudiante()

    estudiante.nombre="Arelys Castillo"
    estudiante.edad=20
    estudiante.estudiar()

    estudiante.nombre="Hazell Reyes"
    estudiante.edad=22
    estudiante.estudiar()

    val poo = Asignatura("POO", 250.0)
    println(poo.getNombre())
    println(poo.getPrecio())
}