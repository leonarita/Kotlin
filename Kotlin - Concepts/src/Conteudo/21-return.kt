package Conteudo

fun main (args: Array<String>)
{
    var x=0
    var y=0

    myloop@ while (x<20)
    {   while (y<20)
        {   x++
            break@myloop
        }
    }
    println ("Exit: x=$x and y=$y")
    myFyn()
    myFyn2()
    myFyn3()
}

fun myFyn ()
{   listOf("A", "B", "C", "D").forEach myLoop@
    {   if (it=="C")   return@myLoop
        println(it)
    }
    println("Finished myFun()")
}

fun myFyn2 ()
{   listOf("A", "B", "C", "D").forEach()
{   if (it=="C")   return@forEach
    println(it)
}
    println("Finished myFun2()")
}

fun myFyn3 ()
{   listOf("A", "B", "C", "D").forEach()
{   if (it=="C")   return
    println(it)
}
    println("Finished myFun3()")
}