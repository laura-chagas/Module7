package Ex5

fun main() {
   ExercicioCinco().receiveUserName()

}
class ExercicioCinco {

    fun receiveUserName(){
        print("Informe seu nome: ")
        val userName = readln()

        print(showMsg(userName))

    }

    fun showMsg(userName: String): String{

        return "Welcome $userName!"

    }
}