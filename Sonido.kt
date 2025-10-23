// função do sub-menu de volume:

fun sub_Menu_Volume_Geral () {
    
    while (true) {
        println("--- Configurações de Volume ---")
        println()
        println("1 - Volume do som")
        println("2 - Áudio Estéreo")
        println("3 - Ativar modo sem som")
        println("4 - Som ambiente")
        println("5 - Voltar ao Menu Anterior")
        
        val escolha_sub_Menu_Volume = readlnOrNull()
        
        if (escolha_sub_Menu_Volume == null) {
            println("Insira uma opção válida!") 
            
        } else {
            when (escolha_sub_Menu_Volume){
                "1" -> println("Escolha o volume: 1 a 10:")
                "2" -> println("Áudio Estéreo: Ativar, Desativar")
                "3" -> println("Modo sem som: Ativado, Desativado")
                "4" -> println("Som Ambiente: Ativado, Desativado")
                "5" -> break
                else -> println("Opção inválida!")
            }
        }
        println()
    }
    println("Voltando ao menu de configurações")
}
