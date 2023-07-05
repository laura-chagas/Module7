package Ex10

fun main() {

    ExercicioDez().receiveNumbers()
}
class ExercicioDez {
    fun receiveNumbers(){
        print("Digite um valor: ")
        val x = readln().toInt()

        print("Digite outro valor: ")
        val y = readln().toInt()

         verfNumbers(x, y)
    }
    fun verfNumbers(x: Int, y: Int){
        if (x == y) {
            print( "$x e $y são iguais!")
        }
    }
}