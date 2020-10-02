package Kotlin.Aula08.Heranca

class Poupanca(conta: Int, saldo: Double): ContaBancaria(conta, saldo) {
    var limite: Int = 1200

    override fun sacar(valor: Double):Boolean {
        if( valor <= (saldo + limite)  ){
            saldo = saldo - valor
            println("Saque realizado. Seu novo saldo é : $saldo")
            return true
        }else{
          println("Saldo insuficiente. Seu saldo é : $saldo")
            return false
        }
    }

    override fun depositar(valor: Double): Boolean {
        saldo += (valor - limite)
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite: $limite")
    }
}