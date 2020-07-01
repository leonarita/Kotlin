package Conteudo

//Extensions
fun Double.toDollar() : String {    return "$$this" }

fun main (args: Array<String>)
{   var dbl = 45.25
    println (dbl.toDollar())

/*  val test = "This is a test"
    println(test.halfLength) //prints 7.0
*/
    val mList = valuesToList(1, 2, 3, 4, 5)
    println ("\nmList: $mList")

    val myArray = arrayOf(1, 2, 3, 4, 5)
    val mList2 = valuesToList(*myArray)
    val mList3 = valuesToList(0, *myArray, 6, 7)
    println ("mList2: $mList2")
    println ("mList3: $mList3")

    //This creates a Conteudo.Dog and called its bark() function, passing the function a value of 6 -> because use infix
    Dogs() bark 6
}

//vararg -> multiple arguments of the same type
fun <T> valuesToList (vararg vals: T) : kotlin.collections.MutableList<T>
{   val list: kotlin.collections.MutableList<T> = mutableListOf()
    for (i in vals) list.add(i)
    return list
}

//infix -> you can call the function without using the dot notation.
class Dogs
{   infix fun bark (x: Int)
    {   println ("\t\tI'm $x years")
    }
}

//Higher order functions can sometimes be slightly slower to run, but a lot of the
//time, you can improve their performance by prefixing the function with inline
inline fun converts (x: Double, converter: (Double) -> Double): Double
{   val result = converter(x)
    println ("$x is converted to $result")
    return result
}