package Ex3

fun main() {
    ExercicioTres().receiveQt()
}

class ExercicioTres {
    var arrayPrice = arrayOf<Double>()

    fun receiveQt() {
        print("Informe a quantidade de produtos: ")
        val qtdProduct = readln().toInt()

        for (i in 1..qtdProduct) {
            print("Informe o preço: ")
            arrayPrice = arrayPrice.plus(readln().toDouble())
        }
        println("O cliente deverá pagar R$ ${arrayPrice.sum()}")
    }

}