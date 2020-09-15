package Kotlin.Aula07.Exercicio4

fun main(){
    var ferrari = Carro(20, 50)
    var gol = Carro(5, 30)

    ferrari.adicionarGasolina( 50 )
    ferrari.andar( 75 )
    ferrari.obterGasolina()

    gol.adicionarGasolina( 50 )
    gol.andar( 100 )
    gol.obterGasolina()


}