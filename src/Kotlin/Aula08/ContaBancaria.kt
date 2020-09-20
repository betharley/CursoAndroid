package Kotlin.Aula08

abstract class ContaBancaria(val conta: Int, var saldo: Double): Imprimivel {

    abstract fun sacar(quantia: Double): Boolean
    abstract fun depositar(quantia: Double): Boolean

    override fun mostrarDados() {
        println("Numero da Conta: $conta")
        println("Saldo: ${this.saldo}")
    }

    fun tranferir( valor: Double, destino: ContaBancaria){
        val saldoContaOrigem = saldo
        if ( !sacar(valor) || !destino.depositar(valor) ){
            saldo = saldoContaOrigem
        }
        sacar( valor )
        destino.depositar( valor )
    }
}
