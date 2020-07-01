package Conteudo

fun main (args: Array<String>)
{
    printSoma(10, 20)

    val r = max(10, 20)
    println (r)

    val options = arrayOf("Rock", "Paper", "Scissors")
    println ("\n\t${getGameChoice(options)}\n\n")

    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun printSoma (a: Int, b: Int): Unit        //Unit -> não retorna nada
{   val result = a + b
    println (result)
    return
}

//fun Conteudo.max (a: Int, b: Int) : Int = if (a>b) a else b
fun max (a: Int, b: Int) = if (a>b) a else b

fun getGameChoice (op: Array<String>) = op[(Math.random() * op.size).toInt()]

fun getUserChoice (op: Array<String>) : String
{   var isValidChoice = false
    var userChoice = ""

    while (!isValidChoice)
    {   print ("Please enter one of the following:")
        for (it in op)  print(" $it")
        println(".")
        val userInput = readLine()
        if (userInput!=null && userInput in op)
        {   isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("You must enter a valid choice")
    }
    return userChoice
}

fun printResult (userChoice: String, gameChoice: String)
{   val result: String

    if (userChoice==gameChoice)
        result = "Tie!"
    else if ((userChoice=="Rock" && gameChoice=="Scissors") || (userChoice=="Paper" && gameChoice=="Rock") || (userChoice=="Scissors" && gameChoice=="Paper"))
        result = "You win!"
    else
        result = "You lose!"

    print ("\t\t\tYou choose $userChoice. \n\t\t\tI choose $gameChoice. \n\t\t\t$result \n\n")
}