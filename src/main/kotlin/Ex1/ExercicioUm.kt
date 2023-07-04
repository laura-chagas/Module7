package Ex1

fun main() {
    ExercicioUm().numberSum(ExercicioUm().receiveNumbers())
}
class ExercicioUm {

    fun receiveNumbers(): Int{
        print("Informe um número: ")
        val userNumber = readln().toInt()
        return userNumber
    }
    fun numberSum(userNumber: Int){
        var sum = 0

        for (i in 1 .. userNumber){
            sum += i
        }

        println("A soma dos números de 1 até $userNumber resultou em $sum")
    }

}