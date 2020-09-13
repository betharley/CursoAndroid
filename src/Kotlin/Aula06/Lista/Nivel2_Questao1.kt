package Aula06.Lista

fun main() {

//    1. Uma empresa de pesquisas precisa tabular os resultados da
//    seguinte enquete feita a um grande quantidade de organizações:
//
//    "Qual o melhor Sistema Operacional para uso em servidores?"
//    As possíveis respostas são:
//    1- Windows Server
//    2- Unix
//    3- Linux
//    4- Netware
//    5- Mac OS
//    6- Outro
//
//    Você foi contratado para desenvolver um programa que leia o
//    resultado da enquete e informe ao final o resultado da mesma.
//    O programa deverá ler os valores até ser informado o valor 0,
//    que encerra a entrada dos dados. Não deverão ser aceitos valores
//    além dos válidos para o programa (0 a 6).
//    Os valores referentes a cada uma das opções devem ser armazenados
//    num vetor. Após os dados terem sido completamente informados,
//    o programa deverá calcular a percentual de cada um dos concorrentes e
//    informar o vencedor da enquete.
//    O formato da saída foi dado pela empresa, e é o seguinte:
//
//    Sistema Operacional     Votos   %
//    -------------------     -----   ---
//    Windows Server           1500   17%
//    Unix                     3500   40%
//    Linux                    3000   34%
//    Netware                   500    5%
//    Mac OS                    150    2%
//    Outro                     150    2%
//    -------------------     -----
//    Total                    8800
//
//
//    O Sistema Operacional mais votado foi o Unix, com 3500 votos,
//    correspondendo a 40% dos votos.

    //var escolhido: Int = 0

    val sistemas = arrayListOf<String>("1- Windows Server", "2- Unix",
            "3- Linux", "4- Netware", "5- Mac OS", "6- Outro"
    )
    val sistemasOper = arrayListOf<String>("Windows Server", "Unix",
            "Linux", "Netware", "Mac OS", "Outro"
    )
    var votos = IntArray(6)


    do {

        for ( indice in sistemas){
            println( indice )
        }

        println("Informe o seu voto: ")
        val escolhido = readLine()!!.toInt()

        if (escolhido < 0 || escolhido > 6) {
            println("Voto invalido")
            continue
        }

        if (escolhido == 1){
            votos[0]++
        } else if (escolhido == 2){
            votos[1]++
        }else if (escolhido == 3){
            votos[2]++
        }else if (escolhido == 4){
            votos[3]++
        }else if (escolhido == 5){
            votos[4]++
        }else if (escolhido == 6){
            votos[5]++
        }


    } while ( escolhido != 0 )

    println("Sistema Operacional     Votos   %")
    println("-------------------     -----   ---")

    votos[0] = 1
    votos[1] = 2
    votos[2] = 1
    votos[3] = 2
    votos[4] = 3
    votos[5] = 2

    var totalVotos: Int = 0
    votos.forEach { elemeto ->
        totalVotos = totalVotos + elemeto
    }
    for ((index, value) in sistemasOper.withIndex()) {
        val porcentagem = (votos[index] * 100) / totalVotos
        println("${sistemasOper[index]}   \t\t\t\t  ${votos[index]}  \t\t $porcentagem%")
    }

}