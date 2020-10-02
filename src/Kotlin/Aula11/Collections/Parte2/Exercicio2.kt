package Kotlin.Aula11.Collections.Parte2

fun main() {
    //João → Juan, Fissura, Maromba
    //Miguel → Night Watch, Bruce Wayne, Tampinha
    //Maria → Wonder Woman, Mary, Marilene
    //Lucas → Lukinha, Jorge, George

    var lista = mutableMapOf<String, MutableList<String> >()
    var lista1 = listOf("Juan", "Fissura", "Juan")
    var lista2 = listOf("Night Watch", "Bruce Wayne", "Tampinha")
    var lista3 = listOf("Wonder Woman", "Mary", "Marilene")
    var lista4 = listOf("Lukinha", "Jorge", "George")

   lista.put("João", lista1 as MutableList<String>)
   lista.put("Miguel", lista2 as MutableList<String>)
   lista.put("Maria", lista3 as MutableList<String>)
   lista.put("Lucas", lista4 as MutableList<String>)


    lista.forEach{
        println(it.key + " " + it.value)
    }

}


