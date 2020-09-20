package Kotlin.Aula09.exercicio2

fun main() {

    var fatura = Fatura()

    var item1 = Item(12, "Notebook", -1, 2000.0)
    var item2 = Item(12, "Notebook", 2, 2000.0)
    fatura.listaItens.add( item1 )
    fatura.listaItens.add( item2 )

    var item1Lista = fatura.getTotalFatura()
    println(item1Lista)

}



