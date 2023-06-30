package Ex11

fun main() {

    ExercicioOnze().lerNumeros()
}

class ExercicioOnze {
    var arrayNumber = arrayOf<Int>()

    fun lerNumeros() {
        for (i in 0..15) {
            print("Digite um número: ")
            arrayNumber = arrayNumber.plus(readln().toInt())
        }
        var medArray = arrayNumber.sum() / arrayNumber.size
        println("A média dos números resultou em $medArray")
    }
}