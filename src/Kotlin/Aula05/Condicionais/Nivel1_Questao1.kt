package Aula05.Condicionais

fun main() {

//1. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//   Conforme a letra escrever:
//   F - Feminino, M - Masculino, Sexo Inválido.


    println("Digite F para Feminino ou M para Masculino.")
    var sexo = readLine()!!.toUpperCase()

    if  (sexo.equals("F")) {
        println("Feminino")
    } else if (sexo.equals("M")) {
        println("Masculino")
    } else {
        println("Sexo inválido")
    }

}