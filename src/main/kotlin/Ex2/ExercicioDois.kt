package Ex2


fun main() {
    println("Informe sua idade: ")
    val days = ExercicioDois().calcularDias(readln().toInt())
    println("Você já viveu $days dias de vida")
}

class ExercicioDois {
    fun calcularDias(age: Int): Int {
        return age * 365
    }
}