package Ex3


fun main() {
    println("Insira um número")
    ExercicioTres().verificarNumero(readln().toInt())
}

class ExercicioTres {
    fun verificarNumero(number: Int): Boolean {
        if (number % 5 == 0) {
            println("O número $number é multiplo de 5")
            return true
        } else {
            println("O número $number não é multiplo de 5")
            return false
        }
    }
}