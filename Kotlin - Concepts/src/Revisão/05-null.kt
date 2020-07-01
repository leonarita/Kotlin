package Revisão

fun main () {

    //O ? permite que uma variável acesse o valor null
    var test: Int ?= null

    //Operador elvis ?:
    val op: Int ?= test ?: 100  //Se test for null, atribua 100 a op, se não for, atribua o valor de test

    println(op)

    var str: String ?= null
    println(str?.length)

    //O !! permite que o código execute mesmo com possível erros de NullPointerException
    println(str!!.length)

}