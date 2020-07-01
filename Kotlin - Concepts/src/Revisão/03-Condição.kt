package Revisão

// if else
//when

fun operacao (a: Int, b: Int, c: String) : Int {

    when {
        a>0 && b>0 -> {
            println("Variáveis maiores do que 0")
        }
    }

    when {
        a in 1..9 && b>0 -> {
            println("Século")
        }
    }

    when (c) {
        "Soma"      -> return a + b
        "Subtração" -> return a - b

        else -> {
            println("Operação inválida!")
            return 0
        }
    }

}

fun main () {
    operacao(10, 10, "Soma")
    operacao(10, 10, "Subtração")
}