package Conteudo

//map -> allows duplicate values, but not duplicate keys
//A Map is immutable, so you can’t add or remove key/value pairs, or update the value held against a specific key

data class Recipe1 (val name: String)

fun main (args: Array<String>)
{
    val r1 = Recipe1("Chicken Soup")
    val r2 = Recipe1("Quinoa salad")
    val r3 = Recipe1("Thai Curry")
    val r4 = Recipe1("Jambalaya")
    val r5 = Recipe1("Sausage Rolls")
    val recipeMap = mapOf ("Conteudo.Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)

    val recipeToCheck = Recipe1("Chicken Soup")
    if (recipeMap.containsValue(recipeToCheck)) {   println ("Here has Chicken Soup!")  }
    if (recipeMap.containsKey("Conteudo.Recipe1"))
    {   val rec = recipeMap.getValue("Conteudo.Recipe1")
        println ("Here has $rec")
    }

    for ((key, value) in recipeMap)     println("Key is $key, value is $value")

    val mRecipeMap = mutableMapOf("Conteudo.Recipe1" to r1, "Recipe2" to r2)
    mRecipeMap.set("Recipe3", r3)

    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)

    val recipeMapCopy = mRecipeMap.toMap()
    val RecipeList = mRecipeMap.toList()

    if (mRecipeMap.size > mRecipeMap.values.toSet().size)   println("mRecipeMap contains duplicates values")
    mRecipeMap.values.toSet()
    mRecipeMap.remove("Recipe2")

    val recipeToRemove = Recipe1("Quinoa Salad")
    mRecipeMap.remove("Recipe2", recipeToRemove)
    mRecipeMap.clear()
}