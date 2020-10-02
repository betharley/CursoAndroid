package Aula06.Funcao

fun main() {
//    3. Faça um programa com uma função chamada somaImposto. A função possui
//    dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas
//    expressa em porcentagem e custo, que é o custo de um item antes do imposto. A
//    função “altera” o valor de custo para incluir o imposto sobre vendas.

    var result = somaImposto(10, 1000.0F)
    println("O valor é: $result")
}
fun somaImposto(porcentagem: Int, custo: Float): Float{
    var resultado = custo - ( custo * porcentagem/100)
    return resultado
}

