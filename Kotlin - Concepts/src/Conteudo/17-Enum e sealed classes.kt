package Conteudo

import java.lang.Exception

//   1- import     2- public, private, protected, internal     3- Interoperability     4- break and continue

enum class BandMember { JERRY, BOBBY, PHIL }

enum class BandMember2 (val instrument: String)
{   JERRY ("lead guitar"), BOBBY ("rhythm guitar"), PHIL ("bass");  //ponto e vírgula aqui é obrigatório
    fun sings() = "occasionally"
}

enum class BandMember3 (val instrument: String)
{   JERRY ("lead guitar") { override fun sings() = "plaintively" },
    BOBBY ("rhythm guitar") { override fun sings() = "hoarsely"},
    PHIL ("bass");                                                      //ponto e vírgula aqui é obrigatório

    open fun sings() = "occasionally"
}

//A sealed class is like a souped-up version of an enum class. It lets you restrict your class hierarchy to a
//specific set of subtypes, each one of which can define its own properties and functions.
sealed class MessageType
class MessageSuccess (var msg: String) : MessageType()
class MessageFailure (var msg: String, var e: Exception) : MessageType()

fun main (args: Array<String>)
{   var selectedBandMember: BandMember3 = BandMember3.BOBBY
    println()
    println (selectedBandMember.instrument)
    println (selectedBandMember.sings())

    val messageSuccess = MessageSuccess("Yay!")
    val messageSuccess2 = MessageSuccess("It worked!")
    val messageFailure = MessageFailure("Boo!", Exception("Gone wrong."))
    var myMessageType: MessageType = MessageFailure(
        "Boo!",
        Exception("Gone wrong.")
    )   //Conteudo.MessageFailure is a subtype of Conteudo.MessageType

    val myMessage = when (myMessageType)
    {   is MessageSuccess -> myMessageType.msg
        is MessageFailure -> myMessageType.msg + " " + myMessageType.e
    }
    println ("\n\t\t $myMessage")
}