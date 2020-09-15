package Kotlin.Aula07.Atleta

fun main(){
    var prova: Prova = Prova()

    var atleta1 = Atleta("Beth", 10, 100)
    var atleta2 = Atleta("Josi", 150, 100)

    prova.realizarProva(atleta1)
    prova.realizarProva(atleta2)

}