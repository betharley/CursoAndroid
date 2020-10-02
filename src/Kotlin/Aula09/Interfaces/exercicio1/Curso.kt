package Kotlin.Aula09.Interfaces.exercicio1
//O curso possui um nome, uma lista de aulas, uma lista de alunos e um professor responsável;

class Curso(nome: String, var professor: String): Entidade(nome){
    var listaAulas: ArrayList<Aula> = ArrayList<Aula>()
    var listaAlunos: ArrayList<Aluno> = ArrayList<Aluno>()


}