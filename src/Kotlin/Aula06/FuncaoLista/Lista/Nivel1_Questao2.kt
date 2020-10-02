package Aula06.Lista

fun main() {
//    2. Faça um Programa que leia um vetor de 10 números e mostre-os
//    na ordem inversa.
    val numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)

    numeros.reverse()

    for ( numero in numeros){
        println( numero )
    }

}