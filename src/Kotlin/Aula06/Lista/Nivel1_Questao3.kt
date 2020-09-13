package Aula06.Lista

fun main() {

    //3. Faça um Programa que peça a altura de 5 pessoas, armazene cada informação
    //num array. Imprima a altura na ordem inversa a ordem lida.

    //var alturas = arrayOfNulls<Double>(5)
    var alturas = DoubleArray(5)
    //var teste = DoubleArray(10)

    for ( posicao in  0..4 ){
        println("Digite uma altura ?")
        alturas[posicao] = readLine()!!.toDouble()
    }

    alturas.reverse()

    alturas.forEach { elemente ->
        println( elemente )
    }

    //alturas.forEach(::println)

}