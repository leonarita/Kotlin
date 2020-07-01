package Conteudo

class Outer
{   val x = "This is in the Conteudo.Outer function"
    val myInner = Inner()

    //a classe nested não acessa aos atributos/métodos da classe Conteudo.Outer
    class Nested
    {   val y = "This is in the Nested function"
        fun myFun() = "This is the Nested function"
    }

    //por causa do inner, a classe Inner pode acessar aos atributos/métodos da classe Conteudo.Outer
    inner class Inner
    {   val y = "This is in the Inner function"
        fun myFun() = "This is the Inner function"
        fun getX() = "The value of x is $x"
    }
}

fun main (args: Array<String>)
{   val nested = Outer.Nested()
    println (nested.y)
    println (nested.myFun())

    val inner = Outer().Inner()
    println (inner.y)
    println (inner.myFun())
    println (inner.getX())

    val inner2 = Outer().myInner
}