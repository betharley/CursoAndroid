package Aula05.Condicionais

fun main() {

//    2. Faça um Programa para um caixa eletrônico.
//    O programa deverá perguntar ao usuário a valor do saque e depois
//    informar quantas notas de cada valor serão fornecidas.
//    As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
//    O valor mínimo é de 10 reais e o máximo de 600 reais.
//    O programa não deve se preocupar com a quantidade de notas
//    existentes na máquina.
//
//    Exemplo 1: Para sacar a quantia de 256 reais, o programa
//    fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma
//    nota de 1;
//
//    Exemplo 2: Para sacar a quantia de 399 reais, o programa
//    fornece três notas de 100, uma nota de 50, quatro notas de 10,
//    uma nota de 5 e quatro notas de 1.
//
//    Quanto você quer sacar? 425
//    4 notas de 100
//    2 notas de 10
//    1 notas de 5

    val notas = intArrayOf(1,5,10,50,100)
    var quantidade = 0

    println("Qual é o valor do saque ?")
    var valor = 486 //readLine()!!.toInt()

    if ( valor >= 10 && valor <= 600 ){

        if ( valor >= 100 ){
            quantidade = valor / 100
            println("Notas de 100: "+ quantidade)
            valor = valor - (100 * quantidade)
        }
        if ( valor >= 50 ){
            quantidade = valor / 50
            println("Notas de 50: "+ quantidade)
            valor = valor - (50 * quantidade)
        }
        if ( valor >= 10 ){
            quantidade = valor / 10
            println("Notas de 10: "+ quantidade)
            valor = valor - (10 * quantidade)
        }
        if ( valor >= 5 ){
            quantidade = valor / 5
            println("Notas de 5: "+ quantidade)
            valor = valor - (5 * quantidade)
        }
        if ( valor >= 1 ){
            quantidade = valor / 1
            println("Notas de 1: "+ quantidade)
            valor = valor - (1 * quantidade)
        }
    }else{
        println("Saque indisponivel")
    }


}
