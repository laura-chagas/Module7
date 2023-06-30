package Ex12

fun main() {
    ExercicioDoze().lerECalcular()
}

class ExercicioDoze {
    var year = 0
    var age = 0
    fun lerECalcular() {
        println("Informe seu ano de nascimento: ")
        year = readln().toInt()

        println("Ano: $year  | Idade: $age")
        while (year < 2023) {
            println("Ano: " + (++year) + " | Idade: " + (++age))

        }
    }
}