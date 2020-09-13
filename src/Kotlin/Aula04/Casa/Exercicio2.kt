package Aula04.Casa

fun main() {
//    2. Faça um Programa que pergunte quanto você ganha por
//    hora e o número de horas trabalhadas no mês.
//    Calcule e mostre o total do seu salário no referido mês.
//    Exemplo:
//    Quanto vale sua hora? 15
//    Quantas horas você trabalhou? 200
//      Você receberá R$ 3000,00


    var valorHora: Double
    var qntHoras: Int
    var salarioMes: Double

    println("Quanto vale sua hora? ")
    valorHora = readLine()!!.toDouble()

    println("Quantas horas você trabalhou? ")
    qntHoras = readLine()!!.toInt()

    salarioMes = valorHora * qntHoras

    println("Você receberá R$ $salarioMes")
}