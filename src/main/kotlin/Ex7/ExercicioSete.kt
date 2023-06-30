package Ex7

fun main() {

    ExercicioSete().calcularMediaAlunos()
}

class ExercicioSete {
    var notas = arrayOf<Int>()
    var cont: Int = 0

    fun calcularMediaAlunos() {

        println("Informe a quantidade de alunos na turma: ")
        val qtdAlunos = readln().toInt()

        while (cont < qtdAlunos) {
            println("Insira a nota do " + (cont + 1) + "º aluno")
            notas = notas.plus(readln().toInt())
            ++cont
        }

        val soma = notas.sum()
        val mediaAlunos = soma / qtdAlunos

        println("A Soma das notas informadas é: $soma\nA média da turma é $mediaAlunos")
    }

}