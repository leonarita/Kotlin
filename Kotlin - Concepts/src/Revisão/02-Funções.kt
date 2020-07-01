package Revisão

//Quando não existe um tipo declarado para o retorno da função, considera-se do tipo Unit
fun calculaBonus (a: Int, b: Int, c: Int) {
    println("O bônus é: ${a + b * c * 2}")
}

fun hello1 (nome: String) : String {
    return "Olá, $nome"
}

fun hello2 (nome: String) = "Olá, $nome"

fun soma (a: Int, b: Int) = a + b

fun main () {

    println('\n')
    calculaBonus(1, 2, 3)
    println(hello1("Leo"))
    println(hello2("Leo"))
    println(soma(2, 3))

/*
    var -> mutável
    val -> imutável
*/
}