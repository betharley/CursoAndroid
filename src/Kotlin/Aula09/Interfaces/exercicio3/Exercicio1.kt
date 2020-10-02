package Kotlin.Aula09.Interfaces.exercicio3

fun main() {

    var fatura = Estoque("Caneta", -2, 11)

    println( fatura.mostra() )
    println( fatura.precisaRepor() )
    println( "------------//--------------" )
    fatura.mudarNome("Canetas")

    fatura.mudarQtdMinima(10)
    fatura.repor(50)
    fatura.darBaixa(-40)
    println( fatura.mostra() )
    println( fatura.precisaRepor() )

}