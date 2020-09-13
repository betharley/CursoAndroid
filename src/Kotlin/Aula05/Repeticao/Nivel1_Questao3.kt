package Aula05.Repeticao

fun main() {

//    3. Faça um programa que receba dois números inteiros e gere os números inteiros
//    que estão no intervalo compreendido por eles.

    print("Digite o 1º número inteiro:")
    val numero1 = readLine()!!.toInt()

    print("Digite o 2º número inteiro:")
    val numero2 = readLine()!!.toInt()

    when {
        numero1 > numero2 -> {
            for (contador in numero1 downTo numero2)
                println(contador)
        }
        numero1 < numero2 -> {
            for (contador in numero1 until numero2+1)
                println(contador)
        }
        else -> {
            println("Não há intervalo entre os números")
        }
    }



}