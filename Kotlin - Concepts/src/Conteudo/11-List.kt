package Conteudo

//list -> allows duplicate values

fun main (args: Array<String>)
{
    val shopping = listOf("Tea", "Eggs", "Milk")

    if (shopping.size>0)
        println(shopping.get(0))

    for (item in shopping) print ("$item ")

    println()
    if (shopping.contains("Milk"))
        println(shopping.indexOf("Milk"))

    val mShopping = mutableListOf("Tea", "Eggs")
    mShopping.add("Milk")
    mShopping.add(1, "Milk")
    println ("\nmShopping: $mShopping")

    if (mShopping.contains("Milk"))
        mShopping.remove("Milk")
    println ("mShopping: $mShopping")

    if (mShopping.size > 1)
        mShopping.removeAt(1)
    println ("mShopping: $mShopping")

    if (mShopping.size > 0)
        mShopping.set(0, "Coffee")
    println ("mShopping: $mShopping")

    mShopping.sort()
    println ("mShopping: $mShopping")

    mShopping.reverse()
    println ("mShopping: $mShopping")

    mShopping.shuffle()
    println ("mShopping: $mShopping")

    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)
    println ("\ntoAdd: $toAdd")
    println ("mShopping: $mShopping")

    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)
    println ("\ntoRemove: $toRemove")
    println ("mShopping: $mShopping")

    val toRetain = listOf("Milk", "Sugar")
    mShopping.retainAll(toRetain)
    println ("\ntoRetain: $toRetain")
    println ("mShopping: $mShopping")

    mShopping.clear()
    println ("\nmShopping: $mShopping")

    //findar...

    println()
}