package Kotlin.Aula07.Futebol

class JogadorDeFutebol(var nome: String) {
    var energia: Int = 100
    var alegria: Int = 100
    var gols: Int = 0
    var experiência: Int = 100

    fun fazerGol(){
        this.energia = this.energia - 5
        this.alegria = this.alegria - 10
        this.gols = this.gols + 1
        println("GOOOOL")
    }

    fun correr(){
        this.energia = this.energia - 10
        println("Cansei")
    }


}