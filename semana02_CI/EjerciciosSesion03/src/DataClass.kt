data class Student(
    var cif : String,
    var nombre : String,
    var carrera: String,
    var promedio : Double
)

fun main(){
    val solieth = Student("911", "Solieth", "ISI", 92.0)
    println(solieth.nombre)
}