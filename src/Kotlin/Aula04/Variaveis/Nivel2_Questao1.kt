package Aula04.Variaveis

fun main() {
//    1. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
//    mostre a temperatura em graus Celsius.
//    C = 5 * ((F-32) / 9)

    print("Informe a temperatura ")
    var Fahrenheit = readLine()!!.toDouble()
    var Celsius = 5 * ((Fahrenheit - 32) / 9)
    print(Celsius)

}