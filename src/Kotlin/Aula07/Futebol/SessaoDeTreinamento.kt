package Kotlin.Aula07.Futebol

class SessaoDeTreinamento{
    var experiência: Int = 50

    fun treinarA(jogador: JogadorDeFutebol){
        println("--------------------//-------------------")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("${jogador.nome}: ${jogador.alegria} ${jogador.energia} ${jogador.gols}")
        jogador.experiência = jogador.experiência + this.experiência
    }

}