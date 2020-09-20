package Kotlin.Aula09.exercicio3

import kotlin.math.max

//os atributos nome (String), qtdAtual (int) e qtdMinima (int); 
class Estoque(private var nome: String,private var qtdAtual: Int, private var qtdMinima: Int) {

    init {
        this.qtdAtual = max(this.qtdAtual,0)
        this.qtdMinima = max(this.qtdMinima, 0)
    }

    fun mudarNome(nome: String){
        this.nome = nome
    }
    fun mudarQtdMinima(qtdMinima: Int){
        this.qtdMinima = qtdMinima
    }
    fun repor(qtd: Int){
        qtdAtual = qtdAtual + qtd
    }
    fun darBaixa(qtd: Int) {
        qtdAtual = qtdAtual - qtd
    }
    fun mostra(): String{
        return "O produto $nome tem $qtdAtual e seu estoque minimo é $qtdMinima"
    }
    fun precisaRepor(): Boolean{
        return qtdAtual < qtdMinima
    }


}
