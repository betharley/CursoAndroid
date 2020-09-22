package Kotlin.Aula11.Parte1
//ALUNO
fun main() {

    var alunos = ArrayList<Aluno>()

    alunos.add( Aluno("Beth", 123 ) )
    alunos.add( Aluno("Ana", 124 ) )
    alunos.add( Aluno("Carla", 125 ) )
    alunos.add( Aluno("Marta", 126 ) )

    var aluno: Aluno = Aluno("Beatriz", 123)

    println( "Contem o aluno: ${alunos.contains( aluno )}")




}