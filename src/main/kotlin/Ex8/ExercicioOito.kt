package Ex8

fun main() {
    ExercicioOito().receiveName()
}

class ExercicioOito {

    fun receiveName() {
        print("Informe seu nome completo: ")
        val userName = readln()
        showName(userName)
    }

    fun showName(userName: String) {

        val newUserName = userName.split(" ")
        for (i in newUserName) {
            println(i)
        }
    }
}