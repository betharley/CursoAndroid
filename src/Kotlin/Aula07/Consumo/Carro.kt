package Kotlin.Aula07.Consumo

class Carro(consumo: Int, var tanque: Int) {
    var combustível: Int = 0

//    Um veículo tem um certo consumo de combustível (medidos em km / litro)
//    e uma certa quantidade de combustível no tanque.
//    O consumo é especificado no construtor e o nível de combustível
//    inicial é 0.

    fun andar(distancia: Int){
        this.tanque = this.tanque - distancia
        println("Anda ${100} quilômetros")
    }
    fun obterGasolina(): Int{
        println("Quantidade de gasoline ${this.tanque}")
        return this.combustível
    }

    fun adicionarGasolina(quantidade: Int){
        this.tanque += quantidade
        println("Abasteceu com $quantidade de combustivel!")
    }

}