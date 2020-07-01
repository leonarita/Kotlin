package Conteudo

class MyWolf
{   var w: Wolf? = Wolf()

    fun MyFunction()
    {
        w?.eat()       // == if (w!=null)   w.eat()
    }
}

fun main (args: Array<String>)
{   var w = Wolf()
    w = Wolf()      //troca a referência
//  w = null        //remove a referência, mas o kotlin não aceita atribuir null

    //A nullable type is one that allows null values
    var w1: Wolf? =
        Wolf()      //it can hold references to Wold object and null
    w1 = null
    w1 = Wolf()

    if (w1 != null)
        w1.eat()

    println(w?.hunger)
    println (if (w!=null) w.hunger else -1)

    var str : String? = "Pizza"
    str = null
    println(str)

    var myArray: Array<String?> = arrayOf ("Hi", "Hello", null)
    for (item in myArray)
    {   item?.let {  println (it)   } }

    var myWolf: MyWolf? = MyWolf()
    println (myWolf?.w?.hunger)
    myWolf?.w?.hunger = 2

    if (w!=null)
        println(w.hunger)

    w?.let { println (it.hunger) }

    var x = w?.hunger   //If w is null, set x to null, otherwise set x to the value of w’s hunger property

    var alpha = getAlphaWolf()
    alpha?.eat()
    getAlphaWolf()?.let { it.eat() }

    //Elvis operator : If this value is not null, the Elvis operator returns it.
    // If the value on the left is ]null, however, the Elvis operator returns the value on its right instead
    w?.hunger ?: -1
    println (if (w?.hunger != null) w.hunger else -1)

    //not-null assertion operator (!!)
     var a = w!!.hunger

}

fun printInt(x: Int?) { println(x) }
fun atNull () : Long? { return null }
fun getAlphaWolf() : Wolf? { return Wolf()
}