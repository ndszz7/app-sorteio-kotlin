package sorteio

class Sorteio {
    private val participantes = mutableListOf<Participante>()

    fun cadastrarParticipante(participante: Participante): Boolean {
        val numeroJaCadastrado = participantes.any { it.numero == participante.numero }

        return if (numeroJaCadastrado) {
            false
        } else {
            participantes.add(participante)
            true
        }
    }

    fun listarParticipantes() {
        if (participantes.isEmpty()) {
            println("\nNenhum participante cadastrado.")
            return
        }

        println("\n===== PARTICIPANTES =====")
        for (participante in participantes) {
            println("Número: ${participante.numero} | Nome: ${participante.nome}")
        }
    }

    fun realizarSorteio(): Participante? {
        if (participantes.isEmpty()) {
            return null
        }

        return participantes.random()
    }

    fun quantidadeParticipantes(): Int {
        return participantes.size
    }
}
