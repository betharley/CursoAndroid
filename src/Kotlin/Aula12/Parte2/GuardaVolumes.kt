package Kotlin.Aula12.Parte2

class GuardaVolumes {
    var contador: Int = 0
    var mapa = mutableMapOf<Int, MutableList<Peca> >()

    fun guardarPecas(listaDePeca: MutableList<Peca> ): Int{
        contador++
        mapa.put(contador, listaDePeca)

        return contador
    }

    fun mostrarPecas(): Int{
        mapa.forEach {
            println(it)
            //print(it.key)
            //print(it.value)
            //println("\n")
        }
        return 0
    }

    fun mostrarPecas(numero: Int){
        mapa.forEach{
            if ( it.equals(numero)){
                println( it )
            }
        }
    }

    fun devolverPecas(numero: Int){
        mapa.forEach{
            if ( it.key.equals( numero )){
                mapa.remove( numero )
            }
        }
    }

}