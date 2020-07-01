package Conteudo/*
import java.io.File
import javax.sound.sampled.AudioSystem
import kotlinx.coroutines.*

suspend fun playBeats2 (beats: String, file: String)
{   val parts = beats.split("x")
    var count = 0

    for (part in parts)
    {   count += part.length + 1
        if (part=="")
            Conteudo.playSound (file)
        else
        {   delay (100 * (part.length + 1L))
            if (count < beats.length)   Conteudo.playSound (file)
        }
    }
}

fun playSound2 (file: String)
{   val clip = AudioSystem.getClip()
    val audioInputStream = AudioSystem.getAudioInputStream (File (file))
}

suspend fun Conteudo.Conteudo.main (args: Array<String>)
{   runBlocking
    {   launch {    playBeats2("x-x-x-x-x-x-", "toms.aiff") }
        playBeats2("x-----x-----", "crash_cymbal.aiff")
    }
}
*/