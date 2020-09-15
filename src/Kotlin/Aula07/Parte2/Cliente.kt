package Kotlin.Aula07.Parte2

class Cliente(nome: String, sobrenome: String, numero: Int){
    var conta: Conta = Conta(numero, 50.0, this)


}