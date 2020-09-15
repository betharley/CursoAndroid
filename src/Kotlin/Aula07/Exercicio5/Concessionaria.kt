package Kotlin.Aula07.Exercicio5

import java.util.ArrayList

class Concessionaria {
    val historico = ArrayList<Historico>()


    fun registrarVenda(veiculo: Veiculo,  cliente: Cliente, valor: Double){
        println("O Cliente ${cliente.nome} comprou o carro da marca ${veiculo.marca} e modelo ${veiculo.modelo} pelo valor de: $valor")

        var objeto = Historico(cliente, veiculo, valor)
        historico.add( objeto )
    }

    fun historico(): ArrayList<Historico>{
        return historico
    }
}