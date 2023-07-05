package Ex6

fun main() {
    ExercicioSeis().showNumbers()
}

class ExercicioSeis {

    fun showNumbers() {
        println("-----TABUADA-----")

        for (i in 1..9) {
            for (j in 0..10) {
                println("\t$i X $j = ${i * j}")
            }
            println()
        }

    }
}