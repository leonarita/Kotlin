package Revisão

//while
//do while
//for

fun main () {

    val str = "Leonardo"

    println('\n')
    for (c in str) {
        print("$c ")
    }

    println('\n')
    for (i in 0..100 step 5) {
        if (i != 80)
            print("$i ")
    }

    println('\n')
    for (j in 100 downTo 0) {
        print("$j ")
    }
}