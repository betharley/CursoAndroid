package Kotlin.Aula07.Parte1

fun main() {

//    1. Definir uma nova classe Cliente contendo as seguintes propriedades:
//    - nome
//    - sobrenome


    var cliente =  Cliente()
    cliente.nome = "BethArley"
    cliente.sobrenome = "Rodrigues"

    println(cliente.nome)

    var titular = Conta(1234, 50.0, cliente)

    titular.deposito(50.0)
    titular.sacar(10.0)


}

