package Ex9

fun main() {
    ExercicioNove().receiveTemperature()
}

class ExercicioNove {

    fun receiveTemperature() {
        print("Temperatura em Celcius [Cº]")
        val temperatureC = readln().toDouble()
        showTemperatureF(temperatureC)
    }

    fun showTemperatureF(temperatureC: Double) {
        val tempF = (9 * temperatureC + 160) / 5
        println("A temperatura $temperatureC em Fahrenheit é $tempF")
    }
}