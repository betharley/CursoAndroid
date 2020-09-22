package Kotlin.Aula11.Parte1

class Funcionario(var nome: String, var registro: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Funcionario

        if (registro != other.registro) return false

        return true
    }

    override fun hashCode(): Int {
        return registro
    }
}