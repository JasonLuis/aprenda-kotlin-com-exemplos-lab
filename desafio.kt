enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String,val idade: Int,val email: String)
data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>,val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    
    override fun toString() = "Formação: $nome\nConteudo: $conteudos\nNivel: $nivel\nInscritos: $inscritos"
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    
    //usuarios
    val usuario1 = Usuario("João", 24, "joao@email.com")
    val usuario2 = Usuario("Silva", 20, "silva@email.com")
    val usuario3 = Usuario("Jose", 29, "josea@email.com")
    
    //conteudo 
    val programacaoBasica = ConteudoEducacional("Programação Basíca", 240, Nivel.BASICO)
    val kotlin = ConteudoEducacional("Programação kotlin", 240, Nivel.INTERMEDIARIO)
    val html = ConteudoEducacional("Desenvolvimento de sites com html", 140, Nivel.BASICO)
    val java = ConteudoEducacional("Programação java", 340, Nivel.INTERMEDIARIO)
    val css = ConteudoEducacional("Estilização com CSS", 140, Nivel.BASICO)
    
    // lista de conteudos
    val conteudoFrontend = mutableListOf<ConteudoEducacional>(); 
    conteudoFrontend.add(html)
    conteudoFrontend.add(css)
    val conteudoBackend = listOf(java, kotlin)
    val conteudoFullstack = listOf(java, kotlin, html, css)
    
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    //formações
    val formacaoBackend = Formacao("Backend Developer", conteudoBackend, Nivel.AVANCADO)
    val formacaoFrontEnd = Formacao("Frontend Developer", conteudoFrontend, Nivel.AVANCADO)
    val formacaoFullstack = Formacao("Fullstack Developer", conteudoFullstack, Nivel.AVANCADO)
    
    
    //adicionar usuarios
    formacaoBackend.matricular(usuario1)
    formacaoFrontEnd.matricular(usuario2)
    formacaoFullstack.matricular(usuario3)
    println("")
    //imprimir usuarios adicionados em cada uma das formações
    println(formacaoBackend.inscritos)
    println(formacaoFrontEnd.inscritos)
    println(formacaoFullstack.inscritos)
    
    println("")
    //imprimir todas as formações
    println(formacaoBackend)
    println(formacaoFrontEnd)
    println(formacaoFullstack)
}