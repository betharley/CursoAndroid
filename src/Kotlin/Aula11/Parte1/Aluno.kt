package Kotlin.Aula11.Parte1

class Aluno(var nome: String, var numero: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (numero != other.numero) return false

        return true
    }

    override fun hashCode(): Int {
        return numero
    }
}