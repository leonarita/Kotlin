package Conteudo

data class TypeRecipe (val title: String, val mainIngredient: String, val isVegetarian: Boolean = false, val difficulty: String = "Easy")   {}

class Mushroom (val size: Int, val isMagic: Boolean)
{   //construtor secundário -> ninguém vê essa ação!
    constructor (isMagic_param: Boolean) : this (0, isMagic_param)  {}
}

fun findRecipes (title: String="", ingredient: String="", isVegetarian: Boolean = false, difficulty: String = "") : Array<TypeRecipe>
{   return arrayOf(TypeRecipe(title, ingredient, isVegetarian, difficulty))}

//These are overloaded functions
fun addNumber (a: Int, b: Int): Int     {   return a+b }
fun addNumber (a: Double, b: Double): Double    {   return a+b }

fun main (args: Array<String>)
{   //Chama o construtor primário
    val r1 = TypeRecipe("Chicken Bhuna", "Chicken")
    val r2 = TypeRecipe("Chicken Bhuna", "Chicken")
    val r3 = r1.copy(title = "Thai Curry")

    println()
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r1 to String: ${r1.toString()}")
    println("r2 to String: ${r2.toString()}")

    println("\nr1 == r2? ${r1==r2}")
    println("r1 === r2? ${r1===r2}")
    println("r1 == r3? ${r1==r3}\n")

    val m1 = Mushroom(6, false)    //Construtor primário
    val m2 = Mushroom(true)        //Construtor secundário

    println ("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")
    println ("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println (addNumber(2, 5))
    println (addNumber(1.6, 7.3))
}