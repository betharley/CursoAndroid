package Kotlin.Aula09.Interfaces.exercicio1
//O aluno possui um RA (Registro Acadêmico), nome, sobrenome

//O aluno pode assistir as aulas e fazer as lições de casa;   •

class Aluno(registroAcademico: Int, nome: String, sobrenome: String): Entidade(nome) {

    fun assistirAula(){
        println("Aluno $nome assistindo aula...")
    }

    fun fazerLicao(){
        println("Aluno $nome fazendo lição de casa...")
    }
}