package Kotlin.Aula11.Collections.Parte1

fun main() {
    var pessoa1 = Pessoa("Rosi", Estado("SP", "São Paulo"))
    var pessoa2 = Pessoa("Carla", Estado("RJ", "Rio de Janeiro"))
    var pessoa3 = Pessoa("Marta", Estado("SP", "São Paulo"))
    var pessoa4 = Pessoa("Carlos", Estado("MG", "Minas Gerais"))
    var pessoa5 = Pessoa("Felipe", Estado("SP", "São Paulo"))
    var pessoa6 = Pessoa("Lucas", Estado("MG", "Minas Gerais"))
    var pessoa7 = Pessoa("Ione", Estado("DF", "Brasilia"))
    var pessoa8 = Pessoa("Sandra", Estado("DF", "Brasilia"))
    var pessoa9 = Pessoa("Gabi", Estado("DF", "Brasilia"))


    var pessoas = listOf<Pessoa>(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7, pessoa8, pessoa9)

    var agrupados = mutableMapOf<String, MutableList<Pessoa> >()

    pessoas.forEach { element ->
        if( !agrupados.containsKey( element.estado.sigla) ){
            agrupados[element.estado.sigla] = mutableListOf()
        }
        agrupados[element.estado.sigla]?.add( element )
    }

    agrupados.forEach{
        println(it.value)
    }
}