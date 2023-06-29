package Ex7

fun main() {
    println("Informe a base")
    var base = readln().toDouble()
    println("Informe a altura")
    var altura = readln().toDouble()

    ExercicioSete().calcularAreaRetangulo(base, altura)
}

class ExercicioSete {
    fun calcularAreaRetangulo(base: Double, altura: Double) {
        println("A área do retângulo é " + (base * altura))
    }
}
