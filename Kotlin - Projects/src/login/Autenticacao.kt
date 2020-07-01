package login

import java.io.BufferedReader
import java.io.FileReader

fun autenticar (file: String, user: User) : String {

    val buffRead = BufferedReader(FileReader(file))

    try {
        while (true) {

            var cad = buffRead.readLine()
            if (user.nome == cad) {
                var idade: Int = buffRead.readLine().toInt()

                if (user.senha == buffRead.readLine()) {
                    return "Login realizado com sucesso! \n\t${user.nome}, cuja idade é ${idade}, pode prosseguir!"
                }
            }
            else if (cad.isNullOrEmpty()) {
                break;
            }
            else {
                buffRead.readLine()
                buffRead.readLine()
            }
        }
    }
    catch(erro: Exception) {
        print("")
    }
    finally {
        buffRead.close();
    }

    return "Cadastro não autorizado"
}