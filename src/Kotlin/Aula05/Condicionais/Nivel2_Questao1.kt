package Aula05.Condicionais

fun main() {
    //    2. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
//    usuário a valor do saque e depois informar quantas notas de cada valor serão
//            fornecidas.
//    As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor
//    mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
//    com a quantidade de notas existentes na máquina.
//    Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de
//    100, uma nota de 50, uma nota de 5 e uma nota de 1;
//    Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de
//    100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
//    Quanto você quer sacar? 425
//    4 notas de 100
//    2 notas de 10
//    1 notas de 5

    //println("Qual o valor do saque ? ")
    var valor = readLine()!!.toDouble()
    var notas = 0

    if ( valor < 10.0 || valor > 600.0){
        println("Saque invalido. \nO valor minimo para sacar é de 10 e o valor máximo para sacar 600")
    }else{
        notas = (valor / 100).toInt()
        if( notas > 0 )
            println("$notas notas de 100")

        valor = valor - (notas * 100)

        notas = (valor / 10).toInt()

        if( notas > 0.0 )
            println("$notas notas de 10")

        valor = valor - (notas * 10)

        notas = (valor / 5).toInt()

        if( notas > 0.0 )
            println("$notas notas de 5")

    }

}
