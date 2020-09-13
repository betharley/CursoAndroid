package Aula05.Repeticao

fun main() {

//    4. Faça um programa que leia e valide as seguintes informações:
//    Nome: maior que 3 caracteres;
//    Idade: entre 0 e 150;
//    Salário: maior que zero;
//    Sexo: 'f' ou 'm';
//    Estado Civil: 's', 'c', 'v', 'd';

    println("Qual é o seu nome ?")
    var nome = readLine()!!.toString()

    println("Qual é a sua idade ?")
    var idade = readLine()!!.toInt()

    println("Qual é o seu Salário ?")
    var salario = readLine()!!.toDouble()

    println("Qual é o seu Sexo, informe F ou M ?")
    var sexo = readLine()!!.toString()

    println("Qual é o seu Estado Civel, informe S, C, V ou D")
    var estadoCivil = readLine()!!.toString().toUpperCase()

    if( nome.length > 3 )
        println("Informe seu nome com no minimo 3 letras")
    if( idade < 0 || idade > 150 )

        println("Informe a sua idade entre os valores 0 e 150")
    if( salario > 0 )
        println("Informe o seu salário sendo maior que zero")

    if( !sexo.equals("M") || !sexo.equals("F") )

        println("Informe o seu Sexo sendo F ou M")

    if( !estadoCivil.equals("S") || !estadoCivil.equals("C") || !estadoCivil.equals("V") || !estadoCivil.equals("D"))
        println("Informe o seu Estado Civel sendo S, C, V ou D")




}