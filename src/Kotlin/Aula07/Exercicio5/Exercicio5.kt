package Kotlin.Aula07.Exercicio5

fun main() {
//    5. Definir um arquivo chamado Exercicio5 e criar a função main.
//    Dentro da  função main, criar um carro, criar um cliente e registrar
//    a venda desse veículo a  esse cliente pela Concessionária.

    var veiculo = Veiculo("Fiat","Palio", 2019, 2500.2)
    var cliente = Cliente("BethArley", "Rodrigues", "6299995599")

    var venda = Venda(cliente, veiculo, 25000.0)
    var venda2 = Venda(cliente, veiculo, 50000.0)

    var concessionaria = Concessionaria()
    concessionaria.registrarVenda(veiculo, cliente, venda.valor)
    concessionaria.registrarVenda(veiculo, cliente, venda2.valor)

//    var historico = concessionaria.historico()
//    historico.removeAt(1)
//
//    historico.forEach { elemento ->
//        println("-----------------------------//------------------------------")
//        println("${elemento.cliente.nome} ${elemento.veiculo.marca} ${elemento.veiculo.modelo} ${elemento.valor}")
//    }


}