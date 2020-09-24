package Kotlin.Aula12.Parte2

class Prova {
    var soma: Int = 0

    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>){
        conjuntoDeInteiros.forEach {
            soma += it
        }

        println("A soma é ${soma}")
    }
}