package Ex4

fun main() {

    println("Informe a temperatura [SOMENTE NUMEROS]")
    ExercicioQuatro().converterTermperatura(readln().toDouble())
}

class ExercicioQuatro {
    fun converterTermperatura(temperatura: Double) {
        when {
            temperatura <= 18 -> println("O clima é frio")
            temperatura >= 19 && temperatura <= 23 -> println("O clima é agradável")
            temperatura >= 24 && temperatura <= 35 -> println("O clima é quente")
            temperatura > 35 -> println("O clima é muito quente")
            else -> {
                println("Temperatura inválida")
            }
        }
    }
}
