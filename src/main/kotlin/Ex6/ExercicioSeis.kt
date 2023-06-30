package Ex6

fun main() {
    println("Informe um número: ")
    println("O valor convertido é RS%.2f".format(ExercicioSeis().converterRealEmDolar(readln().toDouble())))
}

class ExercicioSeis {

    fun converterRealEmDolar(num: Double): Double {
        return num * 4.86
    }
}




