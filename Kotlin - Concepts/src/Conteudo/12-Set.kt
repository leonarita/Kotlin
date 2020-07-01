package Conteudo

//set -> doen't allow duplicate values

fun main (args: Array<String>)
{
    println()
    val friendSet = setOf("Jim", "Sue", "Sue", "Nick", "Nick")
    val isFredGoing = friendSet.contains("Fred")
    for (item in friendSet) print("$item ")

    val a = "Sue"
    val b = a
    val set1 = setOf(a, b)

    val c = Cat("Thai Curry")
    val d = Cat("Thai Curry")
    val set2 = setOf(c, d)

    println ("\n\n\tset1: $set1 \n\tset2: $set2")

    val mFriendSet = mutableSetOf("Jim", "Sue")
    mFriendSet.add("Nick")
    mFriendSet.remove("Nick")

    val toAdd = setOf("Joe", "Mia")
    mFriendSet.addAll(toAdd)
    mFriendSet.clear()
    val friendSetCopy = mFriendSet.toSet()
    val friendList = mFriendSet.toList()

    var mShopping = mutableListOf("Tea", "Eggs", "Milk")
    println ("\nmShopping original: $mShopping")
    val extraShopping = listOf("Cookies", "Sugar", "Eggs")
    mShopping.addAll(extraShopping)
    println ("mShopping items added: $mShopping")
    if (mShopping.contains("Tea"))  mShopping.set(mShopping.indexOf("Tea"), "Coffee")
    mShopping.sort()
    println ("mShopping sorted: $mShopping")
    mShopping.reverse()
    println ("mShopping reversed: $mShopping")

    if (mShopping.size > mShopping.toSet().size)    {   println ("\t\t\tmShopping has duplicated values")     }

    val mShoppingSet = mShopping.toMutableSet()
    println ("\n\n\tmShoppingSet: $mShoppingSet")
    val moreShopping = setOf ("Chives", "Spinach", "Milk")
    mShoppingSet.addAll(moreShopping)
    println ("\tmoreShopping items added: $moreShopping")
    mShopping = mShoppingSet.toMutableList()
    println ("\tmShopping new version: $mShopping")
}