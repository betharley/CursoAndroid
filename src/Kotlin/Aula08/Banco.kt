package Kotlin.Aula08

class Banco: Imprimivel {
    var lista: ArrayList<ContaBancaria> = ArrayList<ContaBancaria>()
    //métodos inserir, remover e procurarConta.

    fun inseerir(conta: ContaBancaria){
        lista.add( conta )
    }
    fun remover( conta: ContaBancaria ){
        lista.removeAt( conta.conta )
    }

    fun procurarConta(numero: Int): ContaBancaria? {

        lista.forEach { conta ->
            if ( conta.conta.equals(numero) ){
                return conta
            }
        }
        return null
    }

    override fun mostrarDados() {
        lista.forEach { elemento ->
            println("Numero: ${elemento.conta}, Saldo: ${elemento.saldo}")
        }
    }

    public fun retornarLista(): ArrayList<ContaBancaria>{
        return lista
    }

}