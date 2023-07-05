package Ex9


fun main() {

    ExercicioNove().receiveQtdEmp()
}

class ExercicioNove {
    var yVacat = 0
    var nVacat = 0

    fun receiveQtdEmp() {
        var nameEmp: String
        var monthEmp: Int

        print("Informe a quantidade de Funcionários: ")
        val qtdEmp = readln().toInt()

        for (i in 1..qtdEmp) {
            print("Informe o nome do funcionário: ")
            nameEmp = readln()

            print("Informe quantos meses de empresa ele tem: ")
            monthEmp = readln().toInt()

            if (monthEmp > 12) {
                println("\n$nameEmp tem direito a férias\n")
                ++yVacat
            } else {
                println("\n$nameEmp não tem direito a férias")
                nVacat++
            }
        }
        println("\nFuncionários que podem ter férias: $yVacat | Funcionários que não podem ter férias: $nVacat")
    }
}
