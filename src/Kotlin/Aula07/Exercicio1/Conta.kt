package Kotlin.Aula07.Exercicio1

class Conta(numero: Int, var saldo: Double, cliente: Cliente) {
    //inicializando número da conta, saldo e titular


    fun depositar(valor: Double){
        this.saldo = this.saldo + valor
        println("Deposito, seu saldo atual é: ${this.saldo}")
    }
    fun sacar(valor: Double){
        if ( valor <= this.saldo){
            this.saldo = this.saldo - valor
            println("Retirada, seu saldo atual é: ${this.saldo}")
        }else{
            println("Saldo insuficiente para esse saque.")
        }

    }
}