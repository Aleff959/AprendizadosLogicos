/ Define a letra da música e a duração (em milissegundos) para cada linha
val letraComTempos = listOf(
    Pair("Aqui começa a nossa canção...", 2000L), // 2 segundos
    Pair("Onde o ritmo bate no coração.", 1500L), // 1.5 segundos
    Pair("Cada palavra tem o seu lugar,", 1800L), // 1.8 segundos
    Pair("E o tempo nos faz esperar.", 2500L), // 2.5 segundos
    Pair("Próxima estrofe, o show vai continuar!", 3000L) // 3 segundos
)

fun main() {
    println("--- Iniciando as Legendas (Kotlin Terminal) ---")
    println()

    for ((linha, duracao) in letraComTempos) {
        // 1. Imprime a linha
        println(linha)
        
        // 2. Pausa a execução pelo tempo da duração
        try {
            // Thread.sleep() aceita o tempo em milissegundos (Long)
            Thread.sleep(duracao)
        } catch (e: InterruptedException) {
            // Lida com a interrupção, embora seja raro em programas de terminal simples
            Thread.currentThread().interrupt()
            break // Sai do loop se for interrompido
        }
    }

    println()
    println("--- Fim da Canção ---")
}