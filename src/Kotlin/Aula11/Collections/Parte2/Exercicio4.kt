package Kotlin.Aula11.Collections.Parte2

fun main() {
    //Na classe Main, criar um cenário em que alguém guarda duas peças,
    //recebe o código e depois retira suas peças

    var peca1 = Peca("Java", "SE")
    var peca2 = Peca("Kotlin", "Android")

    var guardaVolumes = GuardaVolumes()

    var listaDePecas = ArrayList<Peca>()
    listaDePecas.add( peca1 )
    listaDePecas.add( peca2 )

    guardaVolumes.guardarPecas(listaDePecas)

}