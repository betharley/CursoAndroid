package Kotlin.Aula07.Futebol

fun main(){
    var jogador1 = JogadorDeFutebol("Beth")
    var jogador2 = JogadorDeFutebol("Josi")

    var treinamento = SessaoDeTreinamento()

    treinamento.treinarA( jogador1 )
    treinamento.treinarA( jogador1 )

    treinamento.treinarA( jogador2 )


}