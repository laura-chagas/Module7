package Ex1

fun main() {
    ExercicioUm().receiveNumbers()
}

class ExercicioUm {
    fun receiveNumbers() {
        print("Digite um número: ")
        val numberX = readln().toInt()

        print("Digite outro número: ")
        val numberY = readln().toInt()
        calculate(numberX, numberY)
    }

    fun calculate(numberX: Int, numberY: Int) {
        var sum = 0

        if (numberX < numberY) {
            for (i in numberX..numberY) {
                if (!(i % 13 == 0)) {
                    sum += i
                }
            }
            showSum(sum)
        } else {
            for (i in numberY..numberX) {
                if (!(i % 13 == 0)) {
                    sum += i
                }
            }
            showSum(sum)
        }


    }

    fun showSum(sum: Int) {
        println("A soma dos números que não são multiplos de 13 resultou em $sum")
    }
}