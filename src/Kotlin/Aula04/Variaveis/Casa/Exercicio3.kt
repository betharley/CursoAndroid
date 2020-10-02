package Aula04.Casa

fun main() {
//    3. Tendo como dado de entrada a altura (h) de uma pessoa,
//    construa um algoritmo que calcule seu peso ideal,
//    utilizando as seguintes fórmulas:
//    Para homens: (72.7 * h) - 58 Para mulheres: (62.1 * h) - 44.7
//    Exemplo:
//    Digite a altura: 1.73
//    Para homens: 67,77
//    Para mulheres: 62,73

    var altura: Double
    var homens: Double
    var mulheres: Double


    println("Digite a altura: ")
    altura = readLine()!!.toDouble()

    homens = (72.7 * altura) - 58
    mulheres = (62.1 * altura) - 44.7

    println("Para homens___: $homens")
    println("Para mulheres_: $mulheres")

}