package Ex7

fun main() {
    ExercicioSete().receiveQtdClass()
}

class ExercicioSete {
    var qtStudents = 0
    var qtClass = 0
    var cont = 0
    var m = 0
    fun receiveQtdClass() {
        print("Digite a quantidade de turmas: ")
        qtClass = readln().toInt()

        for (i in 1..qtClass) {
            print("Quantos alunos tem nessa turma: $i")
            qtStudents = readln().toInt()

            for (j in 1..qtStudents) {
                print("Digite a media do aluno $j")
                m += readln().toInt()
                cont++
            }

            val mClass = (m / cont)
            println("Media: $mClass | Turma: $i")
        }

    }
}

