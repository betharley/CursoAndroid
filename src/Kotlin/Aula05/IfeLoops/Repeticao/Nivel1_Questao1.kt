package Aula05.Repeticao

fun main() {

    //1. Faça um programa que leia 5 números e
    // informe o maior número.
    var maior = 0
    var contador = 1

    do {
        println("Digite um número: ")
        val numero = readLine()!!.toInt()

        if (numero > maior) {
            maior = numero
        }
        contador++
    }
    while(contador <= 5)
    print("O número maior é $maior")


}