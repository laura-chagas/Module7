package Ex2

fun main() {
    ExercicioDois().showUsername(ExercicioDois().receiveUsername())
}

class ExercicioDois {

    fun receiveUsername(): String {
        print("Nome de usuário: ")
        val userName = readln()
        return userName
    }

    fun showUsername(userName: String) {
        println("Meu nome é $userName")
    }

}