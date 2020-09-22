package Kotlin.Aula11.Parte2

import java.lang.Exception

fun main() {

    val lista: ArrayList<String>? = null

    lista?.add("Pato")
    lista?.add("Cachorro")
    lista?.add("Gato")

    println(lista?.get(2))


}