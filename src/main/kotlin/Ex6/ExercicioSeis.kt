package Ex6

fun main() {
    ExercicioSeis().receiveNumber()
}

class ExercicioSeis {
    var arrayNumbers = arrayOf<Int>()

    fun receiveNumber() {
        print("Informe a quantidade de números que vão ser inseridos: ")
        val qtdNumber = readln().toInt()

        for (i in 1..qtdNumber) {
            print("Digite um número: ")
            arrayNumbers = arrayNumbers.plus(readln().toInt())
        }
        showMinNumber(arrayNumbers)
    }

    fun showMinNumber(arrayNumbers: Array<Int>) {

        println("O menor número encontrado foi ${arrayNumbers.min()}")

    }

}