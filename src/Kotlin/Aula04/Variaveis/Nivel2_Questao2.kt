package Aula04.Variaveis

fun main() {
//    2. Faça um Programa que pergunte quanto você ganha por hora e o número de
//    horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
//    sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
//    5% para o sindicato, faça um programa que nos dê:
//    salário bruto.
//    quanto pagou ao INSS.
//    quanto pagou ao sindicato.
//    o salário líquido.
//    calcule os descontos e o salário líquido, conforme a tabela abaixo:
//    + Salário Bruto : R$
//    - IR (11%) : R$
//    - INSS (8%) : R$
//    - Sindicato ( 5%) : R$
//    = Salário Líquido :


    print("Informe valor hora: ")
    val valorHora= readLine()!!.toDouble()

    print ("Informe quantidade de hora mês")
    val numeroDeHorasMes= readLine()!!.toDouble()


    val salarioBruto= (valorHora * numeroDeHorasMes)
    val descontoIR= (salarioBruto * 0.11)
    val descontoINSS= (salarioBruto * 0.08)
    val descontoSindicato= (salarioBruto * 0.05)
    val totalDescontos= (descontoIR + descontoINSS + descontoSindicato)
    val salarioLiquido= (salarioBruto - totalDescontos)


    println("+ Salário Bruto : R$ $salarioBruto")
    println("- IR (11%) : R$ $descontoIR")
    println("- INSS (8%) : R$ $descontoINSS")
    println("- Sindicato (5%) : R$ $descontoSindicato")
    println("= Salário Líquido : R$ $salarioLiquido")


}