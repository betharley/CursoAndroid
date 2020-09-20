package Kotlin.Aula09.exercicio1
//O professor possui um nome e um RD (Registro Docente);

//O professor por ser um Docente tem a obrigatoriedade de dar aulas e fazer a chamada
// dos alunos;   •

class Professor(nome: String, registroDocente: Int): Entidade(nome){

    fun darAulas(){
        println("Professor $nome Ministrando aula...")
    }
    fun fazerChamada(){
        println("Professor $nome realizando chamada da aula...")
    }
}