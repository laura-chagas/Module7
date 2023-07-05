package Ex2

fun main() {
    ExercicioDois().receiveNumber()
}

class ExercicioDois {
    var arrayNumbers = IntArray(10)

    fun receiveNumber() {
        print("Digite um número: ")
        arrayNumbers[0] = readln().toInt()

        for (i in 1 until arrayNumbers.size) {
            arrayNumbers[i] = arrayNumbers[i - 1] * 2
        }

        for (i in arrayNumbers) {
            print("$i ")
        }
    }
}