package Ex5

fun main() {
    ExercicioCinco().receiveNumbers()
}

class ExercicioCinco {

    fun receiveNumbers() {
        print("Digite o primeiro número: ")
        val n1 = readln().toDouble()
        print("Digite o segundo número: ")
        val n2 = readln().toDouble()

        calculate(n1, n2)
    }

    fun calculate(n1: Double, n2: Double) {
        println("A soma de $n1 e $n2 resultou em ${n1 + n2}")
        println("A subtração de $n1 e $n2 resultou em ${n1 - n2}")
        println("A multiplicação de $n1 e $n2 resultou em ${n1 * n2}")
        println("A divisão de $n1 e $n2 resultou em ${n1 / n2}")
    }
}