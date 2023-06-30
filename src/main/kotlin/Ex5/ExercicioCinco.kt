package Ex5

fun main() {

    ExercicioCinco().fazerListaDeCompras()

}

class ExercicioCinco {

    fun fazerListaDeCompras() {
        println("Informe a quantidade de itens que estarão na lista: ")
        val qtd = readln().toInt()
        var listaCompras = arrayOf<String>()

        for (produto in 1..qtd) {
            println("Insira o item")
            listaCompras = listaCompras.plus(readln())
        }
        println("-----LISTA DE COMPRAS:----")
        for (i in listaCompras) {
            println(i)
        }
    }
}