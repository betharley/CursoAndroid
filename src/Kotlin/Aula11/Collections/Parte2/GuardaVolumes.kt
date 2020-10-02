package Kotlin.Aula11.Collections.Parte2

class GuardaVolumes {
    var contador: Int = 0
    var mapa = mutableMapOf<Int, ArrayList<Peca> >()

    fun guardarPecas(listaDePeca: ArrayList<Peca> ): Int{
        contador++
        mapa.put(contador, listaDePeca)
        println("Tamanho do Array: ${mapa.size}")
        return contador
    }

    fun mostrarPecas(): Int{
        mapa.forEach {
            println("${it.key}, ${it.value}")
            //print(it.key)
            //print(it.value)
            //println("\n")
        }
        return 0
    }

    fun mostrarPecas(numero: Int){
        mapa.forEach{
            if ( it.equals(numero)){
                println( "${it}, ${it.value}" )
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