package run

fun isAdult (age: Int) : Boolean = age >= 18

fun calculateBonus(salary: Double) : Double = salary * 0.1

fun scholarship(grade: Int): Double {
    return when (grade) {
        in 70..78 -> 0.25
        in 80..89 -> 0.30
        in 90..95 -> 0.50
        in 96..100 -> 0.75
        else -> 0.0
    }
}