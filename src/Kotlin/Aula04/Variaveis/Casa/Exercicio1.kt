package Aula04.Casa

fun main() {

//    1. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
//    Digite a nota 1: 10
//    Digite a nota 2: 5
//    Digite a nota 3: 7
//    Digite a nota 4: 8
//    A média é 7,5

    var nota1: Double
    var nota2: Double
    var nota3: Double
    var nota4: Double
    var media: Double


    println("Qual a nota 1 ?")
    nota1 = readLine()!!.toDouble()

    println("Qual a nota 2 ?")
    nota2 = readLine()!!.toDouble()

    println("Qual a nota 3 ?")
    nota3 = readLine()!!.toDouble()

    println("Qual a nota 4 ?")
    nota4 = readLine()!!.toDouble()

    media = (nota1 + nota2 + nota3 + nota4) / 4
    println("A média é: $media")

}