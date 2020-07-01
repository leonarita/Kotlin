package Conteudo

//A data class is one that lets you create objects whose Conteudo.Conteudo.main purpose is to store data.
data class Recipe (val title: String, val isVegetarian: Boolean)
{   var mainIngredient = ""
}

//Each object has a function named equals because its class inherits the function from a class named Any
// Class Any is the mother of all classes: the ultimate superclass of everything.
class MyClass : Any()
{
}

fun main (args: Array<String>)
{
    var x = 1

    when (x)
    {   0 -> println ("x is zero")
        1, 2 -> println ("x is one or two")

        else ->
        {   println ("x is neither 0, 1 nor 2")
            println ("x is some other value")
        }
    }

//  var w = r as Conteudo.Wolf
    println()

    val w1 = Wolf()
    val w2 = w1
    val w3 = Wolf()
    println (w1==w2)
    println (w1==w3)
    println (w1.equals(w2))
    println (w1.equals(w3))

    println()
    println(w1.hashCode())      //Returns a hash code value for the object.
    println(w1.toString())      //Returns a String message that represents the object.

    val r1 = Recipe("Chicken Bhuna", false)
    val r2 = Recipe("Chicken Bhuna", false)
    val r5 = r1.copy(title = "Thai Curry")

    println()
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r1 to String: ${r1.toString()}")
    println("r2 to String: ${r2.toString()}")

    println("\nr1 == r2? ${r1==r2}")
    println("r1 === r2? ${r1===r2}")
    println("r1 == r5? ${r1==r5}\n")

    val r3 = Recipe("Thai Curry", false)
    val r4 = r1.copy (isVegetarian = true)

    println("r3 to String: ${r3.toString()}")
    println("r4 to String: ${r4.toString()}")

    val r = Recipe("Chicken Bhuna", false)

    val title = r.component1()          // == val title = r.title
    val isVegetarian = r.component2()   // == val isVegetarian = r.isVegetarian
    val (t, iV) = r                     // Atribui os atributos de r nas variáveis declaradas, destruindo r

    val ra = Recipe("Thai curry", false)
    ra.mainIngredient = "Chicken"
    val rb = Recipe("Thai curry", false)
    rb.mainIngredient = "Conteudo.Duck"
    println(r1 == r2)
}