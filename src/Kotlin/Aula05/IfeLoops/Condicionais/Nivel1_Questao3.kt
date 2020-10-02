package Aula05.Condicionais

fun main() {
    /*
   3. Faça um programa para a leitura de duas notas parciais de um aluno. O
        programa deve calcular a média alcançada por aluno e apresentar:
        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        A mensagem "Reprovado", se a média for menor do que sete;
        A mensagem "Aprovado com Distinção", se a média for igual a dez.
    */

    println("Digite a primeria nota")
    val nota1 =  readLine()!!.toDouble()

    println("Digite a segunda nota")
    val nota2 =  readLine()!!.toDouble()

    var media = (nota1 + nota2) / 2

    println("A média das notas é: $media")

    if(media >= 7)
        println("Aprovado")
    else if( media < 7)
        println("Reprovado")
    else if( media == 10.0 )
        println("Aprovado com Distinção")



}