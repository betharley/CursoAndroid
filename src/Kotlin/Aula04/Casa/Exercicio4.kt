package Aula04.Casa

fun main() {
//    4. João Papo-de-Pescador, homem de bem, comprou um microcomputador
//    para controlar o rendimento diário de seu trabalho.
//    Toda vez que ele traz um peso de peixes maior que o estabelecido
//    pelo regulamento de pesca do estado de São Paulo (50 quilos)
//    deve pagar uma multa de R$ 4,00 por quilo excedente.
//    João precisa que você faça um programa que leia a variável
//    peso (peso de peixes) e calcule o excesso. Gravar na variável
//    excesso a quantidade de quilos além do limite e na variável
//    multa o valor da multa que João deverá pagar.
//    Imprima os dados do programa com as mensagens adequadas.
//    Exemplo:
//    Digite o peso dos peixes: 75
//    Excedeu 25Kg
//    O Valor a ser pago é de R$ 100,00


    val pesoRegulamento: Int = 50
    val multaRegulamento: Int = 4
    var peso: Double
    var excesso: Double = 0.0
    var multa: Double = 0.0

    println("Digite o peso dos peixes: ")
    peso = readLine()!!.toDouble()

    excesso = peso - pesoRegulamento
    multa = excesso * multaRegulamento

    println("Excedeu $excesso")
    println("O Valor a ser pago é de R$ $multa")

}