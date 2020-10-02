package Kotlin.Aula10.Equals.Parte2

class CalculoMatematico {

    fun divisao(num1: Int, num2: Int): Int{
        var resultado = 0
        try {
            resultado = num1 / num2
        }catch (erro: ArithmeticException){
            println("A operação não pode ser realizada")
            return 0
        }catch (ex: Exception){
            println(ex.message)
        }
        return resultado
    }

    fun divisao2(num1: Int, num2: Int): Int{
        if ( num2 == 0){
            throw ArithmeticException("Texto")
        }
        return 0
    }
}