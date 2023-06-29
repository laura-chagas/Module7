package Ex6

fun main() {
    println("Informe um número: ")
    println(ExercicioSeis().converterRealEmDolar(readln().toDouble()))
}

class ExercicioSeis {

    fun converterRealEmDolar(num: Double): Double {
        return num * 4.86
    }
}




