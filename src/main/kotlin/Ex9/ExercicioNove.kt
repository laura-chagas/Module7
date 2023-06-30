package Ex9

fun main() {

    ExercicioNove().coletarInfos()
}

class ExercicioNove {
    var n1: Int = 0
    var n2: Int = 0

    fun coletarInfos() {
        print("Informe o primeiro número: ")
        n1 = readln().toInt()
        print("Informe o segundo número: ")
        n2 = readln().toInt()

        println("\nSendo: \n[1]Somar os números;\n[2]Subtrair os números;\n[3]Multiplicar os números;\n[4]Dividir os números.")
        print("\nVocê deseja: ")
        calcularDecisao(readln().toInt(), n1, n2)
    }

    fun calcularDecisao(dec: Int, n1: Int, n2: Int) {
        when (dec) {
            1 -> println("\nA soma dos números resultou em " + (n1 + n2))
            2 -> println("\nA subtração dos números resultou em " + (n1 - n2))
            3 -> println("\nA multiplicação dos números resultou em " + (n1 * n2))
            4 -> println("\nA divisão dos números resultou em " + (n1 / n2))

        }

    }

}