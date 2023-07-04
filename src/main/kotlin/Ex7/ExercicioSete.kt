package Ex7

fun main() {

    ExercicioSete().receiveInfos()

}

class ExercicioSete {

    fun receiveInfos() {
        print("Nome do vendedor: ")
        val name = readln()

        print("Salário fixo: ")
        val fSalary = readln().toDouble()

        print("Total de vendas em dinheiro: ")
        val sales = readln().toDouble()

        showInfos(name, fSalary, sales)
    }

    fun showInfos(name: String, fSalary: Double, sales: Double) {
        println("------------------------------------")
        println("Nome: $name \nSalário fixo: $fSalary \nSalário final: ${(sales * 0.15) + fSalary}")

    }
}