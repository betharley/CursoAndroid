package Aula06.Lista

fun main() {
//    2. Faça um Programa para um caixa eletrônico.
//    O programa deverá perguntar ao usuário a valor do saque e depois
//    informar quantas notas de cada valor serão fornecidas.
//    As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
//    O valor mínimo é de 10 reais e o máximo de 600 reais.
//    O programa não deve se preocupar com a quantidade de notas
//    existentes na máquina.

    val cedulas = intArrayOf(1, 5, 10, 50, 100)
    val quantidades = IntArray(5)
    var quantidade = 0

    println("Qual é o valor do saque ?")
    var saque = 586 //readLine()!!.toInt()

    if (saque >= 10 && saque <= 600) {

        for (nota in cedulas.size-1 downTo 0 step 1)   {
            if (  saque >= cedulas[nota] ) {
                quantidade = saque / cedulas[nota]

                println("Notas de ${cedulas[nota]}: " + quantidade)
                saque = saque - (cedulas[nota] * quantidade)
            }
        }

    } else {
        println("Saque indisponivel")
    }


}