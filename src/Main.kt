package sorteio

fun main() {
    val sorteio = Sorteio()
    var opcao: Int

    do {
        println("\n==============================")
        println("       APP DE SORTEIO")
        println("==============================")
        println("1 - Cadastrar participante")
        println("2 - Listar participantes")
        println("3 - Realizar sorteio")
        println("4 - Ver quantidade de participantes")
        println("0 - Sair")
        print("Escolha uma opção: ")

        opcao = readLine()?.toIntOrNull() ?: -1

        when (opcao) {
            1 -> {
                print("\nDigite o nome do participante: ")
                val nome = readLine()?.trim()

                if (nome.isNullOrBlank()) {
                    println("Nome inválido.")
                } else {
                    print("Digite o número do participante: ")
                    val numero = readLine()?.toIntOrNull()

                    if (numero == null || numero <= 0) {
                        println("Número inválido.")
                    } else {
                        val participante = Participante(nome, numero)

                        if (sorteio.cadastrarParticipante(participante)) {
                            println("Participante cadastrado com sucesso!")
                        } else {
                            println("Esse número já está cadastrado.")
                        }
                    }
                }
            }

            2 -> {
                sorteio.listarParticipantes()
            }

            3 -> {
                val vencedor = sorteio.realizarSorteio()

                if (vencedor != null) {
                    println("\n🎉 RESULTADO DO SORTEIO 🎉")
                    println("Número: ${vencedor.numero}")
                    println("Vencedor: ${vencedor.nome}")
                } else {
                    println("\nNão é possível realizar o sorteio.")
                    println("Cadastre pelo menos um participante.")
                }
            }

            4 -> {
                println(
                    "\nQuantidade de participantes: ${sorteio.quantidadeParticipantes()}"
                )
            }

            0 -> {
                println("\nObrigado por usar o App de Sorteio!")
            }

            else -> {
                println("\nOpção inválida. Escolha uma opção do menu.")
            }
        }

    } while (opcao != 0)
}
