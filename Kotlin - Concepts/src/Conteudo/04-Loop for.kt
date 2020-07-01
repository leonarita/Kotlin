package Conteudo

fun main (args: Array<String>)
{
    println("")
    for (x in 0..20)        print ("${x} ")

    println ("")
    for (x in 0 until 20)   print ("${x} ")

    println ("")
    for (x in 20 downTo 0)   print ("${x} ")

    println ("")
    for (x in 0..20 step 2)   print ("${x} ")

    println ("\n")
    val ar = arrayOf(1, 2, 3, 4, 5)
    for (x in ar)   println ("\t${x} está contido no vetor")

    println ("")
    for ((index, item) in ar.withIndex())
        println ("\tIndex ${index} tem item ${item}")

    println ("")
}