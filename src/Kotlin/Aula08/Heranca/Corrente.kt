package Kotlin.Aula08.Heranca

class Corrente(conta: Int, saldo: Double): ContaBancaria(conta, saldo), Imprimivel {
    var taxaDeOperação: Int = 2

    override fun sacar(valor: Double): Boolean {
        if ( valor < saldo + taxaDeOperação ){
            saldo -= (valor + taxaDeOperação)
            println("Saque realizado. Seu novo saldo é : $saldo")
            return true
        }else{
            println("Saque insuficiente. Seu saldo é : $saldo, você tentou sacar $valor")
            return false
        }
    }

    override fun depositar(valor: Double): Boolean {
        if( (saldo + valor) >= taxaDeOperação ){
            saldo = (valor - taxaDeOperação)
            return true
        }else{
            return false
        }
    }

//    override fun mostrarDados() {
//        super.mostrarDados()
//        println("Taxa: $taxaDeOperação")
//    }


}