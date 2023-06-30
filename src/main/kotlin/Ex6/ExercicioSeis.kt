package Ex6

fun main() {

    ExercicioSeis().coletarInfos()

}

class ExercicioSeis {
    var musicasArtist = arrayOf<String>()
    var cont = 0

    fun coletarInfos() {
        println("Informe o nome da Banda: ")
        val banda = readln()

        for (msc in 1..3) {
            println("Digite uma Música")
            musicasArtist = musicasArtist.plus(readln())
        }

        println("BANDA: $banda")
        for (i in musicasArtist) {
            println("Musica " + (++cont) + ": " + i)
        }

    }

}