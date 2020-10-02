package Kotlin.Aula10.Equals.Parte1
//FUNCIONARIOS
fun main() {
    var funcionarios: ArrayList<Funcionario> = ArrayList<Funcionario>()

    funcionarios.add( Funcionario("Carla", 121) )
    funcionarios.add( Funcionario("Rosi", 122) )
    funcionarios.add( Funcionario("Josi", 123) )
    funcionarios.add( Funcionario("Bia", 124) )

    var funcionario: Funcionario = Funcionario("Maria", 121)

    println( funcionarios.contains( funcionario ) )


}