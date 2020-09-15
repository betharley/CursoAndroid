package Kotlin.Aula07.Exercicio3

class Prova() {
    var dificuldade:Int = 20
    var energiaNecessaria: Int = 10

    //dificuldade  - energiaNecessaria

    fun realizarProva(atleta: Atleta): Boolean{
        if ( atleta.nivel >= dificuldade){
            atleta.energia - atleta.energia - this.energiaNecessaria
            println("${atleta.nome} pode realizar a Prova")
            return true
        }
        println("${atleta.nome} não pode realizar a Prova")
        return false
    }
}