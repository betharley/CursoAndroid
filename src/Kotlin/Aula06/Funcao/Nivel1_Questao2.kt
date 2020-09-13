package Aula06.Funcao

fun main() {
//    2. Faça um programa, com uma função que necessite de um argumento. A função
//    retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
//    argumento for zero ou negativo.

    //var resultado = validar(0)
    println("Resultado: ${validar(5)}")

}

fun validar(numero: Int): String{
    if( numero > 0 ) {
        return "P"
    }else{
        return "N"
    }
}


