package Ex8

fun main() {
    ExercicioOito().receiveInfos()
}
class ExercicioOito {
    var nameStudents = arrayOf<String>()
    var gradesStudents = arrayOf<Double>()

    fun receiveInfos(){

        print("Informe a quantidade de alunos na classe: ")
        val qtStudents = readln().toInt()

        for (i in 1 .. qtStudents){
            println("---------------------------")
            print("Informe o nome do Aluno: ")
            nameStudents = nameStudents.plus(readln())

                print("Informe a nota: ")
                val n1 = readln().toDouble()
                print("Informe a nota: ")
                val n2 = readln().toDouble()
                print("Informe a nota: ")
                val n3 = readln().toDouble()

                val sum = n1 + n2 + n3
                val arithmeticM = sum / 3
                gradesStudents = gradesStudents.plus(arithmeticM)
            }
        showInfos(nameStudents, gradesStudents)
    }

    fun showInfos(nameStudents: Array<String>, gradesStudents: Array<Double>){
        var cont = 0
        for (i in nameStudents){
            println("----------------")
            println("$i | ${gradesStudents[cont]}")
            ++cont
        }
    }

}