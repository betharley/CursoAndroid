package Kotlin.Aula09.exercicio2

//• o número do item faturado;   •
//a descrição do item;   •
//a quantidade comprada do item  •
//o preço unitário do item.  
//(numero: Int, descricao: String, qntComprada1: Int, preco: Double)
class Item{
    var numero: Int = 0
    var descricao: String = ""
    var qntComprada: Int = 0
    var preco: Double = 0.0

    constructor(numero: Int, descricao: String, qntComprada: Int, preco: Double){
        this.qntComprada = numero
        this.descricao = descricao
        this.qntComprada = qntComprada
        this.preco = preco

        if( qntComprada < 0)
            this.qntComprada = 0
        if( preco < 0)
            this.preco = 0.0

//        this.preco = max( this.preco, 0.0)
//        this.qntComprada = max( this.qntComprada, 0)
    }

}