package Ex5

fun main() {

    println("Informe um número: ")
    ExercicioCinco().verificarNumero(readln().toDouble())

}

class ExercicioCinco {
    fun verificarNumero(num: Double) {
        when {
            num >= 0 -> println("O número é positivo :)")
            else -> {
                println("O número é negativo")
            }
        }

    }
}