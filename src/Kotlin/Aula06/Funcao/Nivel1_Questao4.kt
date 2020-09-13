package Aula06.Funcao

import kotlin.random.Random

fun main() {
//    4. Jogo de Craps. Faça um programa de implemente um jogo de Craps.
//    O jogador lança um par de dados, obtendo um valor entre 2 e 12.
//    Se, na primeira jogada, você tirar 7 ou 11, você um "natural" e ganhou.
//    Se você tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "craps"
//    e você perdeu. Se, na primeira jogada, você fez um 4, 5, 6, 8, 9 ou 10,
//    este é seu "Ponto". Seu objetivo agora é continuar jogando os dados
//    até tirar este número novamente. Você perde, no entanto, se tirar um 7
//    antes de tirar este Ponto novamente. Exemplo:
//
//
//    a.
//    Rolar dados? (s ou n)
//    Você tirou 7!    Parabéns você ganhou!
//
//    b.
//    Rolar dados? (s ou n)
//    Você tirou 8! Aperte enter para tentar novamente
//
//    Você tirou 7! Você perdeu

//    Dica: Para obter valores aleatórios use
//    Random.nextInt(DE, ATE)

    var craps = arrayOf(2,3,4,5,6,7,8,9,10,11,12)

    var continuar: String = ""
    var sorteado: Int = 0
    var contador: Int = 1
    val pontosFeitos = arrayOf(4, 5, 6, 8, 9, 10)
    var ponto: Int = -1

    do {
        println("Rola dados ? (s ou n)")
        continuar = readLine()!!.toString()

        if ( !continuar.equals("s") ){
            break
        }
        sorteado = Random.nextInt(2, craps.size)
        println("Numero sorteado: $sorteado")

        if ( contador == 1 ){
            if ( sorteado == 7 || sorteado == 11){
                println("Você tirou $sorteado!  (Natural)  Parabéns você ganhou!")
                break
            }

            if ( sorteado == 2 || sorteado == 3 || sorteado == 12){
                println("Você tirou $sorteado!    Você perdeu!")
                break
            }
            for ( indice in pontosFeitos){
                if ( sorteado == indice){
                    ponto = sorteado
                }
            }

        }

        if ( ponto == sorteado && contador > 1){
            println("Você tirou $sorteado!    Parabéns você ganhou!!!")
            break
        }
        if ( sorteado == 7 ){
            println("Você tirou $sorteado!    Você perdeu!")
            break
        }

        contador++

    }while (sorteado != 0)

}


