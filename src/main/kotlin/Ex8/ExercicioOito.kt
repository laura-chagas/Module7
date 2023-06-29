package Ex8

fun main() {
    var x = 8
    var y = 9
    var z = x
    println("Valores iniciais: \nx:$x \ny:$y")
    x = y
    y = z
    println("Valores trocados: \nx: $x \ny: $y")

}