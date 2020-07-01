package login

fun main () {

    val file = "./src/login/file.txt"
    var op: Int
    var user: User = User("", 0, "")

    var log: Boolean = false
    var m: String = "Login"
    var nome: String = ""

    do {

        if (log) {
            print("\n\n\n\t\t\tBem vindo, ${nome}")
        }

        print("\n\nConsidere as seguintes opções: \n\t1-Cadastrar \n\t2-Visualizar cadastros\n\t3-${m} \n\t0-Sair")
        print("\n\nInforme a opção desejada: ")
        op = readLine()!!.toInt()

        if (op==0) {
            break;
        }
        else if (op==1) {
            print("\n\nInforme seu nome: ")
            user.nome = readLine().toString()
            print("Informe sua idade: ")
            user.idade = readLine()!!.toInt()
            print("Informe sua senha: ")
            user.senha = readLine().toString()

            if (user.nome.isNullOrEmpty() ||  user.senha.isNullOrEmpty()) {
                print("\n\nCredenciais inválidas!")
                continue
            }

            escritor(file, user)
        }
        else if (op==2) {
            print("\n\n")
            leitor(file)
        }
        else if (op==3) {

            if (!log) {
                print("\n\nUser: ")
                user.nome = readLine().toString()
                user.idade = 0
                print("Password: ")
                user.senha = readLine().toString()

                var message: String = autenticar(file, user)
                print("\n\n\t${message}")

                if (message.contains("\n\t")) {
                    log = true
                    m = "Logout"
                    nome = user.nome
                }
            }
            else {
                print("\n\nLogout realizado com sucesso!")
                log = false
                m = "Login"
                nome = ""
            }
        }
        else
            continue
    }
    while (op!=0)
}