package Ex10

fun main() {
    ExercicioDez().somarNumeros()

}

class ExercicioDez {

    fun somarNumeros() {
        var num = 1
        var sum = 0
        do {
            sum += num
            ++num
        } while (num < 16)

        println("A soma dos números resultou em: $sum ")
    }

}