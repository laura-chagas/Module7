package Ex4

fun main() {

    ExercicioQuatro().receiveInfos()
}

class ExercicioQuatro {
    fun receiveInfos() {
        print("Base: ")
        val b = readln().toDouble()
        print("Altura: ")
        val h = readln().toDouble()

        calculate(b, h)
    }

    fun calculate(b: Double, h: Double) {
        val areaRectangle = b * h
        println("A área do retângulo é $areaRectangle")
    }
}