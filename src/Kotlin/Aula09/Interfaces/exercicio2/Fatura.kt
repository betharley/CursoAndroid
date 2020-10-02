package Kotlin.Aula09.Interfaces.exercicio2

class Fatura {
    var listaItens: ArrayList<Item> = ArrayList<Item>()

   fun getTotalFatura(): Double {
       var total = 0.0
       listaItens.forEach { item ->
           total = total + item.qntComprada * item.preco
       }
       return total
   }

}