package Kotlin.Aula07.Parte2

class JogadorDeFutebol {
    var nome: String = ""
    var energia: Int = 0
    var alegria: Int = 0
    var gols: Int = 0
    var experiência: Int = 0

    fun fazerGol(ponto: Int){
        this.energia = this.energia - 5
        this.alegria = this.alegria - 10
        this.gols = this.gols + 1
        println("GOOOOL")
    }


}