package Ex11

fun main() {
    ExercicioOnze().receiveInfos()
}

class ExercicioOnze {

    fun receiveInfos() {
        print("Informe o percentual: ")
        val percentage = readln().toDouble()
        print("Informe o preço de custo: ")
        val priceProduct = readln().toDouble()

        calculateInfos(percentage, priceProduct)
    }

    fun calculateInfos(percentage: Double, priceProduct: Double) {

        val salePrice = priceProduct + (priceProduct * (percentage / 100))
        println("O valor de venda do produto será: R$%.2f".format(salePrice))

    }
}