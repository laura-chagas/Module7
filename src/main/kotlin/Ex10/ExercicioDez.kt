package Ex10

fun main() {
    ExercicioDez().receiveUSD()

}
class ExercicioDez {

    fun receiveUSD(){
        print("Qual a cotação do Dólar: ")
        val cot = readln().toDouble()
        print("Valor em USD: ")
        val money = readln().toDouble()

        showBRL(money, cot)
    }
    fun showBRL(money: Double, cot: Double){
        println("O valor: $%.2f".format(money) + " convertido para real é R$%.2f".format(money/cot))

    }

}