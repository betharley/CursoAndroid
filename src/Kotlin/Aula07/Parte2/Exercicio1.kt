package Kotlin.Aula07.Parte2

import Kotlin.Aula07.Parte1.Cliente

class Exercicio1 {
    fun main(){

        var cliente1 = Cliente("Ana", "Santos", 123)
        var cliente2 = Cliente("Beatriz", "Silva", 123)

        cliente1.conta.depositar(50.0)
        cliente1.conta.sacar(10.0)

        cliente2.conta.depositar(100.0)
        cliente2.conta.sacar(20.0)
    }
}