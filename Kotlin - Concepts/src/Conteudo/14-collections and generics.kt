package Conteudo

//The element type is defined inside angle brackets <>, which means that it uses generics.
interface MutableList<E> : List<E>, MutableCollection<E>
{   fun add (index: Int, element: E): Unit }

class Duck (nome: String)
{}

class Vetvet <T: Pet>
{   fun treat (t: T)
    {   println ("Treat Conteudo.Pet ${t.name}") }
}

abstract class Pet (var name: String)
class Cat (name: String) : Pet(name)
class Doog (name: String) : Pet(name)
class Fish (name: String) : Pet(name)

//T is a generic type that must be Conteudo.Pet or one of its subtypes
class Contest <T: Pet> (var vet: Vetvet<in T>)
{   val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore (t: T, score: Int = 0)
    {   if (score>=0)   scores.put(t, score)    }

    fun getWinners() : MutableSet<T>
    {   val winners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.max()
        for ((t, score) in scores) if (score==highScore) winners.add(t)
        return winners
    }

    fun quack(ducks: MutableList<Duck>) {}
}

//If you want to be able to use a generic subtype object in a place of a generic supertype, you can do so by prefixing the generic type with out
interface Retailer <out T>
{   fun sell() : T }

class CatRetailer : Retailer<Cat>
{   override fun sell () : Cat
{   println ("Sell Conteudo.Cat")
    return Cat("")
}
}

class DoogRetailer : Retailer<Doog>
{   override fun sell () : Doog
{   println ("Sell Conteudo.Doog")
    return Doog("")
}
}

fun main (args: Array<String>)
{   val x: MutableList<String>
    val duckList: kotlin.collections.MutableList<Duck> = mutableListOf(
        Duck(
            "Donald"
        ), Duck("Daisy"), Duck("Daffy")
    )
    val list = mutableListOf("Fee", "Fi", "Fum")

    val catFuzz= Cat("Fuz Lightyear")
    val catKatsu= Cat("Katsu")
    val fishFinny= Fish("Finny McGraw")

    val catVet = Vetvet<Cat>()
    val fishVet = Vetvet<Fish>()
    val petVet = Vetvet<Pet>()
    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)

    val catContest = Contest<Cat>(catVet)

    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println ("\nConteudo.Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println ("Conteudo.Pet contest winner is ${topPet.name}")

    val fishContest : DoogRetailer = DoogRetailer()
    val doogRetailer : Retailer<Doog> =
        DoogRetailer()
    val catRetailer : Retailer<Cat> =
        CatRetailer()
    val petRetailer : Retailer<Pet> =
        CatRetailer()
    petRetailer.sell()
}