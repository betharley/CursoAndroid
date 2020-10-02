package Kotlin.Aula08.Heranca

import java.lang.NullPointerException
import java.util.*

fun main() {

    var corrente: Corrente = Corrente(123, 100.0)
    var poupanca: Poupanca = Poupanca(321, 200.0)

    corrente.sacar(50.0)
    corrente.depositar(100.0)

    poupanca.sacar(210.0)
    poupanca.depositar(200.0)

    var relatorio = Relatorio()

    //relatorio.gerarRelatório( corrente )
    relatorio.gerarRelatório( poupanca )

    var banco = Banco();

    do{
        println("Escolha uma opção do Menu:")
        println("1 - Criar uma Conta")
        println("2 - Selecionar Conta")
        println("3 - Remover conta")
        println("4 - Gerar relatório")
        println("5 - Finalizar")

        println("Digite a opção: ")
        var opcao = readLine()!!.toInt()

        when(opcao){
            1 -> criarConta()
            2 -> selecionarConta()
            3 -> removerConta()
            4 -> gerarRelatorio()
            5 -> break
        }

    }while (opcao!=5)


}
fun criarConta(){
    var opcao = 0
    do {
        println("Escolha o tipo de conta a ser criada")
        println("1 - Conta Poupança")
        println("2 - Conta Corrente")
        println("0 - Para sair do Sistema")

        println("Digite a opção da conta: ")
        opcao = readLine()!!.toInt()
        println("Opção escolhida: $opcao")


        if( opcao.equals(1) || opcao.equals(2)){
            var numeroConta = Random().nextInt()
            var saldoConta = 0.0
            //var conta = null

            if ( opcao.equals(1)){
                var conta = Poupanca(numeroConta, saldoConta)
            }
            else{
                var conta = Corrente(numeroConta, saldoConta)
            }
            println("Conta criada com Sucesso...")
        }else{
            println("Opção de conta invalidade, tente 1 ou 2...")
        }

        if (opcao==0 || opcao == 1 || opcao==2)
            break

    }while ( opcao != 1 || opcao != 2 )

}

fun selecionarConta(){
    var banco = Banco()
    var encontrou = false
    var minhaLista = banco.retornarLista()
    do {
        println("Digite o numero da conta: ")
        println("Para finalizar digite 0")
        var numero = readLine()!!.toInt()

        for (conta in minhaLista) {
            if (conta.conta == numero){
                menuDaConta(conta)
                encontrou = true
            }
        }

        if ( !encontrou )
            println("Conta inexistente...")


    }while (numero != 0)

}
fun removerConta(){

    var banco = Banco()
    var minhaLista = banco.retornarLista()

    println("Digite o numero da Conta: ")
    var numeroConta = readLine()!!.toInt()


    println("Escolha uma opção abaixo")
    println("1 - Remover conta")
    println("0 - Para finalizar")

    if ( numeroConta==0)
        return

        for (conta in minhaLista) {
            if (conta.conta == numeroConta){
                minhaLista.removeAt( numeroConta )
            }
        }

}

fun gerarRelatorio(){
    var banco = Banco()
    var minhaLista = banco.retornarLista()

    println("-------------||||--------------")
    for ( conta in minhaLista){
        println("A conta ${conta.conta}, tem saldo ${conta.saldo}.")
    }

}


fun menuDaConta(conta: ContaBancaria){
    var opcao = 0

    do {

        println("1 - Depositar")
        println("2 - Sacar")
        println("3 - Transferir")
        println("4 - Gerar Relátorio")
        println("5 - Retornar ao menu anterior")

        println("Digite uma opçao: ")
        opcao = readLine()!!.toInt()

        when( opcao ){
            1 -> {
                println("Digite o valor do Deposito: ")
                var valor = readLine()!!.toDouble()
                conta.depositar( valor )
            }
            2 -> {
                println("Digite o valor do Saque: ")
                var valor = readLine()!!.toDouble()
                conta.sacar( valor )
            }
            3 -> {
                println("<<<<<<<<<Dados da Conta>>>>>>>")
                conta.mostrarDados()
                //println("O numero da conta ${conta.conta} e o seu saldo é ${conta.saldo}")
            }
            4 -> {
                println("Digite o valor da transferencia: ")
                var valor = readLine()!!.toDouble()

                println("Digite o numero da conta de destino: ")
                var numeroConta = readLine()!!.toInt()
                var conta2 = buscarConta(numeroConta)
                if (  conta2 != null){
                    conta.tranferir( valor,  conta2)
                }else{
                    println("Conta não encontrada para realizar a transferencia")
                }


            }
            5 -> break

        }

    }while (opcao != 5)
}

fun buscarConta(numeroConta: Int): ContaBancaria? {
    var lista = Banco().retornarLista()

    for ( conta in  lista){
        if (conta.conta == numeroConta){
            return conta
        }
    }
    return null

}