package login

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter
import javax.swing.JOptionPane
import kotlin.test.expect


fun leitor (file: String) {

    val buffRead = BufferedReader(FileReader(file))
    
    var linha: String = ""

    try {
        while (true) {
            linha = buffRead.readLine();

            if (linha != null) {
                print("\n${linha} - ")
                linha = buffRead.readLine();
                print("${linha} - ")
                linha = buffRead.readLine();
                print("${linha}")
            } else
                break;
        }
        buffRead.close();
    }
    catch(erro: Exception) {
        print("")
    }
    finally {
        print("\n\n\nProssiga...")
    }
}

fun escritor (file: String, user: User) {

    val buffWrite = BufferedWriter(FileWriter(file, true))
    buffWrite.append(user.nome + "\n");
    buffWrite.append(user.idade.toString() + "\n");
    buffWrite.append(user.senha + "\n");
    buffWrite.close();
}