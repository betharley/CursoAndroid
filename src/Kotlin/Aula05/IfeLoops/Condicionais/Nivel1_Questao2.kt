package Aula05.Condicionais

fun main() {
//    2. Faça um Programa que peça um número inteiro e determine se
//    ele é par ou ímpar. Dica: utilize o operador módulo (resto da divisão).

    println("Digite um numero: ")
    var numero = readLine()!!.toInt()

    if( numero % 2 == 0)
        println("Par")
    else
        println("Impar")



}