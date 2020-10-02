package Kotlin.Aula10.Equals.Parte1
//COCA
fun main() {
    var coca1 = Coca(6, 2.56)
    var coca2 = Coca(6, 2.89)

    println(coca1.equals(coca2))
    println(coca1)
}