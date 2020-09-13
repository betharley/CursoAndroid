package Aula05.Condicionais

fun main() {
//    3. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
//    perguntas são:
//    "Telefonou para a vítima?"
//    "Esteve no local do crime?"
//    "Mora perto da vítima?"
//    "Devia para a vítima?"
//    "Já trabalhou com a vítima?"
//    O programa deve no final emitir uma classificação sobre a participação da pessoa
//    no crime. Se a pessoa responder positivamente a 2 questões ela deve ser
//    classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
//    Caso contrário, ele será classificado como "Inocente".
//    Use “S” para sim e “N” para não.

    var quantidade = 0

    println("Telefonou para a vítima?")
    var telefonou = readLine()!!.toString().toUpperCase()

    println("Esteve no local do crime?")
    var localCrime = readLine()!!.toString().toUpperCase()

    println("Mora perto da vítima?")
    var moraVitima = readLine()!!.toString().toUpperCase()

    println("Devia para a vítima?")
    var deviaVitima = readLine()!!.toString().toUpperCase()

    println("Já trabalhou com a vítima?")
    var trabalhou = readLine()!!.toString().toUpperCase()

    if( telefonou.equals("S"))
        quantidade++

    if( localCrime.equals("S"))
        quantidade++

    if( moraVitima.equals("S"))
        quantidade++

    if( deviaVitima.equals("S"))
        quantidade++

    if( trabalhou.equals("S"))
        quantidade++

    if( quantidade == 2 )
        println("Suspeito")
    else
    if( quantidade == 3 || quantidade == 4)
        println("Cúmplice")
    else
    if( quantidade == 5 )
        println("Assassino")
    else
        println("Inocente")

}
