package Ex4

fun main() {

    ExercicioQuatro().receberNumeros()
}

class ExercicioQuatro {
    var vet = IntArray(10)

    fun receberNumeros() {

        for (posic: Int in vet.indices) {
            println("Digite o " + (posic + 1) + "º valor:")
            vet[posic] = readln().toInt()
        }

        for (num in vet) {
            if (num % 2 == 0) {
                print("$num ")
            }
        }
    }

}