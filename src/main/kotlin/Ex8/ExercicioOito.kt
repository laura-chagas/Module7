package Ex8

fun main() {
    ExercicioOito().retornarFibonacci()
}

class ExercicioOito {
    fun retornarFibonacci() {
        println("Informe um número: ")
        val num = readln().toInt()

        var fib1 = 0
        var fib2 = 1
        var fibonacci = 0

        for (i in 1..num) {
            fibonacci = fib1 + fib2
            fib2 = fib1
            fib1 = fibonacci
        }
        println("Fib($num) = $fibonacci")
    }
}