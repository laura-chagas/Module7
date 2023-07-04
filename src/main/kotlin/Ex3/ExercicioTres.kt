package Ex3

fun main() {
    ExercicioTres().receiveInfos()
}

class ExercicioTres {

    fun receiveInfos() {
        print("Informe sua altura (separado por [.]): ")
        val heightUser = readln().toDouble()

        print("Informe seu peso (separado por [.]: ")
        val weightUser = readln().toDouble()
        calculate(heightUser, weightUser)
    }

    fun calculate(heightUser: Double, weightUser: Double) {
        val imc: Double = weightUser / (heightUser * heightUser)

            when {
                (imc < 18.5) -> println("MAGREZA")
                (imc in 18.5..24.9) -> println("NORMAL")
                (imc in 25.0..29.9) -> println("SOBREPESO")
                (imc in 30.0..39.9) -> println("OBESIDADE")
                (imc > 40.0) -> println("OBESIDADE GRAVE")
                else -> println("Não foi possível calcular o IMC")
            }

}
}