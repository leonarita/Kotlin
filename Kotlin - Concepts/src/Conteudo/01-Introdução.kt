package Conteudo

//Muitos elementos de kotlin podem ser resolvidos do mesmo modo que se resolve em java (Ex: manipulação de arquivos)
//Elementos facultativos: ponto-e-virgula, declarar tipo de dado

fun main (args: Array<String>)
{
    //val é uma variável que recebe um valor imutável
    print ("Valor 1: ")
    val n1: Int = readLine()!!.toInt()      //readLine() -> função que lê string

    print ("Valor 2: ")
    val n2 = readLine()!!.toInt()

    //var recebe uma variável que pode ser alteada
    var s: Int = n1 + n2
    s += 0
    println ("\n\tVocê digitou $n1 e $n2. A soma vale $s.")

    println (if(n1>n2) "\t\tO valor 1 é maior do que o valor 2" else "\t\tO valor 2 é maior do que o valor 1")
    println("\n")

    var myArray = arrayOf(1, 2, 3)
    //var myArray: Array<Byte> = arrayOf(1, 2, 3)

    var i=0
    while (i!=myArray.size)
    {   println("O ${i+1}° elemento tem valor ${myArray[i]}")
        i++
    }

    //Esses elementos sobrepões os elementos anteriores
    println("\n")
    myArray = arrayOf(4, 5)
    i=0
    for (i in 0..myArray.size-1)
        println("O ${i+1}° elemento tem valor ${myArray[i]}")
}