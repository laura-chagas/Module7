package Ex4

import java.lang.IllegalArgumentException

fun main() {
    ExercicioQuatro().receiveQtdAnimals()
}

class ExercicioQuatro {
    var cat = 0
    var dog = 0
    fun receiveQtdAnimals() {
        print("Informe a quantidade de animais: ")
        val qtdAnimals = readln().toInt()

        for (i in 1..qtdAnimals) {
            println("Para registrar o tipo de animal, digite: \n[1] Gato    [2] Cachorro")
            when (readln().toInt()) {
                1 -> ++cat
                2 -> ++dog
                else -> throw IllegalArgumentException("Número inserido é inválido")
            }
        }
        showAnimals(cat, dog)
    }

    fun showAnimals(cat: Int, dog: Int) {
        println("A LOJA POSSUI: ")
        print("Gatos: $cat | Cachorros: $dog")
    }

}