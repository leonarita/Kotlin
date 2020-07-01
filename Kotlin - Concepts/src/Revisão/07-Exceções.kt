package Revisão

import java.lang.NumberFormatException

fun main () {

    try {
        println ("1".toInt())
    }
    catch (e: NumberFormatException) {
        println("Esse valor não é um número")
    }
    catch (e: Exception) {
        println("Algo de errado aconteceu")
    }
    finally {
        println("Prosseguindo...")
    }

    try {
        return
    } catch (e: Exception){
        println("Exception")
    } finally {
        println("Finally")
    }

    println("OK?")
}