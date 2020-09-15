package Kotlin.Aula07.Parte1

class Conta(conta: Int, var saldo: Double, cliente: Cliente) {

    fun deposito(valor: Double){
        this.saldo = this.saldo + valor
        println("Você realizou um deposito")
        println("O nome saldo é ${this.saldo}")
    }

    fun sacar(valor: Double){
        if ( valor <= this.saldo ){
            this.saldo = this.saldo - valor
            println("Você realizou um saque")
            println("Seu saldo atual é ${this.saldo}")
        }else{
            println("Saldo Insuficiente...")
        }

    }
}
