package Conteudo

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

class AnimalException : Exception() { }

fun main (args: Array<String>)
{
    myFunction("2")

    try
    {
        setWorkRatePercentagem(110)
    }
    catch (e: IllegalArgumentException)
    {   println ("\n\n\t\tError in percentage") }
}

fun setWorkRatePercentagem (x: Int)
{   if (x !in 1..100)
        throw IllegalArgumentException ("Percentage not in range 1..100: $x")
}

fun myFunction (str: String)
{
    try
    {   val x= str.toInt()
        println (x)
    }
    catch (e: NumberFormatException)
    {   println ("Bummer")  }
    finally
    {   //turnOvenOff()
        println("Saindo do bloco try-catch")
    }

    println ("\tConteudo.myFunction has ended")
}