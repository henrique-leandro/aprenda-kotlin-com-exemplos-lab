enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val usuario1 = Usuario("Henrique")
    val usuario2 = Usuario("Evelyn")
    val usuario3 = Usuario("joãozinho")
    
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", Nivel.BASICO, 60)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objeto em Kotlin", Nivel.INTERMEDIARIO, 120)
    val conteudo3 = ConteudoEducacional("O poder das funções em Kotlin", Nivel.DIFICIL, 120)
    
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2, conteudo3))
    
    
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoKotlin.matricular(usuario3)
    
    
    println("🚀 Inscritos na Formação Kotlin 🚀")
    formacaoKotlin.inscritos.forEach {
        println(it.nome)
    }
    
   println("🧑🏻‍💻Conteúdos da Formação🧑🏻‍💻")
    formacaoKotlin.conteudos.forEach{ conteudo ->
        println("Nome do conteudo: ${conteudo.nome}, Nivel ${conteudo.nivel}, Duração ${conteudo.duracao} min")
        
    }
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}