package Kotlin.Aula11.Collections.Parte2

fun main() {
    var lista = mutableListOf<Int>(8)
    //: 1, 5, 5, 6, 7, 8, 8, 8. 
    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)

    var listaSet = setOf(1,5,5,6,7,8,8,8)
    println("MutableListOf")

    lista.forEach {
        print(it)
    }
    println("\n\nSetOf")
    listaSet.forEach {
        print(it)
    }

}