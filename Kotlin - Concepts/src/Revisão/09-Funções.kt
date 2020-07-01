package Revisão

fun media3 (vararg notas: Float) {

    if (notas.isNotEmpty()) {
        var soma = 0f               //Float pode atribuir terminando com f, mas Double não

        for (nota in notas)
            soma += nota

        println("A média é ${soma/notas.size}")
    }
}

fun <T> media (vararg valores: T) {     //recebe parâmetros de todos os tipos
    println()
    for (valor in valores)
        print("$valor ")
}

fun main () {
    media (10f, 8f)
    media (1f, 5f, 2f, 7f)
    media (1, 4f, "", true, "", "C")
}