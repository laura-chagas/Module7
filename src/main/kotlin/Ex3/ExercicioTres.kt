package Ex3

fun main() {
    ExercicioTres().mostrarMensagem()
}

class ExercicioTres {
    val msg = "Eu gosto de estudar Algoritmos!"
    var cont = 0
    fun mostrarMensagem() {

        while (cont < 21) {
            println(msg)
            ++cont
        }

    }
}