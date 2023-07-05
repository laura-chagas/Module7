package Ex6

fun main() {
    ExercicioSeis().showNumbers()
}

class ExercicioSeis {

    fun showNumbers() {
        println("-----TABUADA-----")

        for (i in 1..10) {
            for (j in 1..10) {
                println("\t$i X $j = ${i * j}")
            }
            println()
        }

    }
}