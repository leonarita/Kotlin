package Revisão

fun meuNome (nome: String) {
    println("Olá $nome!")
}

fun meuNomeIdade (nome: String, idade: Short) {
    println("Olá $nome! tenho $idade anos")
}

fun letraIndice (nome: String, indice: Int) : Char {
    return nome[indice]
}

fun main () {
    meuNome("Leonardo")
    meuNomeIdade("Leonardo", 20)
    letraIndice("Leonardo", 0)

    "abc".toInt()
}
