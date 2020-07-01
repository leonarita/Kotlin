package Conteudo

fun main(args: Array<String>)
{
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = (Math.random() * arraySize1).toInt()
    val rand2 = (Math.random() * arraySize2).toInt()
    val rand3 = (Math.random() * arraySize3).toInt()

    val phrase = "\n\n\t${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)

    var array = arrayOf (1, 2, 3)
    var nullArray: Array<String?> = arrayOfNulls(2)
    val size = array.size
    array.reverse()
    val isIn = array.contains(1)    //se sim, devolve true
    val sum = array.sum()
    val average = array.average()   //Calcula a média e devolve double
    array.max()
    array.min()
    array.sort()
    array[0]=6
}