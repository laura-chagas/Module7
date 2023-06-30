package Ex2

import java.lang.IllegalArgumentException

fun main() {

    println("Informe um dia da semana entre 1 e 7: ")
    ExercicioDois().mostarDiadaSemana(readln().toInt())
}

class ExercicioDois {
    fun mostarDiadaSemana(number: Int) {

        if (number > 0 && number < 8) {
            val daysOTWeeek = arrayOf<String>(
                "Segunda-Feira",
                "Terça-Feira",
                "Quarta-Feira",
                "Quinta-Feira",
                "Sexta-Feira",
                "Sábado",
                "Domingo"
            )
            println("Dia " + number + " é " + daysOTWeeek[number - 1])
        } else {
            throw IllegalArgumentException()
        }
    }


}