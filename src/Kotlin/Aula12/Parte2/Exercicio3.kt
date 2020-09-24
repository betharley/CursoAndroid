package Kotlin.Aula12.Parte2


fun main() {
    var listaSet = setOf<Int>(1,5,5,6,7,8,8,8)

    var prova = Prova()

    println( listaSet )

    prova.somaTotal(listaSet as MutableSet<Int>)


}