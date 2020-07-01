package Conteudo

class Ducks
{   object DuckFactory  {   fun create() : Ducks = Ducks() }
}

object DuckManager
{   val allDucks = mutableListOf<Ducks>()

    fun herdDucks()
    {}
}

class Duck2
{   //A companion object is like a class object, except that you can omit the object’s name.

    companion object    {   fun create() : Duck2 = Duck2() }
}

fun main (args: Array<String>)
{
    DuckManager.herdDucks()
    val newDuck = Ducks.DuckFactory.create()

    val newDuck1 = Duck2.create()
    val x = Duck2

    val startingPoint = object
    {   val x = 0
        val y = 0
    }
    println("starting point is ${startingPoint.x}, ${startingPoint.y}")

/*
    window.addMouseListener (object: MouseAdapter()
    {   override fun mouseClicked (e: MouseEvent)   {}
        override fun mouseReleased (e: MouseEvent)   {}
    }
    )
*/
}