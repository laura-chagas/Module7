package Ex1

fun main() {

    ExercicioUm().adicionarValores()

}

class ExercicioUm {
    var vet = IntArray(5)
    fun adicionarValores() {
        for (posic: Int in vet.indices) {
            println("Digite o " + (posic + 1) + "º valor:")
            vet[posic] = readln().toInt()
        }
        var soma: Int = vet.sum()
        println(soma)
    }
}
