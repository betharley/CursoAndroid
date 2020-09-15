package Kotlin.Aula07.Parte2

class Conta(numero: Int, var saldo: Double, cliente: Cliente) {
    //inicializando número da conta, saldo e titular


    fun depositar(valor: Double){
        this.saldo = this.saldo + valor
        println("Deposito, seu saldo atual é: ${this.saldo}")
    }
    fun sacar(valor: Double){
        this.saldo = this.saldo - valor
        println("Retirada, seu saldo atual é: ${this.saldo}")
    }
}