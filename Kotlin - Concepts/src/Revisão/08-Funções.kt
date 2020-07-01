package Revisão

fun endereco (rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0) {
    println('\n')
    println("Rua: $rua")
    println("Cidade: $cidade, $rua - $cep, $numero")
}

fun main () {
    endereco(cidade="Campinas", estado = "São Paulo", cep = "13")
    endereco(cep = "13", cidade="Campinas", estado = "São Paulo")

}