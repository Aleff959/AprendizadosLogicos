fun main() {
    // Dados da legenda extraídos do arquivo .srt
    // Par: (Milissegundos de início, Texto da linha)
    val letraComTempos = listOf(
        Pair(3070L, "She said, you think the devil has horns,"), // [cite: 1]
        Pair(7590L, "well so did I, but I was wrong,"), // [cite: 2]
        Pair(10450L, "his hair is combed and he wears a"), // [cite: 3]
        Pair(12770L, "suit and tie."), // [cite: 3]
        Pair(14170L, "He's nice, polite, he'll catch you by surprise,"), // [cite: 5]
        Pair(18550L, "a smile so bright, you never bat an"), // [cite: 6]
        Pair(22070L, "eye."), // [cite: 7]
        Pair(25010L, "Said she was in a hurry, that's when"), // [cite: 8]
        Pair(29370L, "she met him Sunday walking down the street."), // [cite: 9]
        Pair(32730L, "She dropped her bag and it fell to"), // [cite: 10]
        Pair(35910L, "his feet, he got down on one knee."), // [cite: 11]
        Pair(39330L, "He handed her the purse and gave a"), // [cite: 12]
        Pair(41730L, "warning to her saying this, you know the"), //
        Pair(44930L, "devil has horns."), //
        Pair(46590L, "He's out tonight, walking round downtown carrying a"), //
        Pair(52050L, "gun and knife."), //
        Pair(53510L, "He'll fight, you'll die, but you'll see him"), //
        Pair(56430L, "clear his life beneath those signs, you should"), //
        Pair(60210L, "know the warning signs."), //
        Pair(64330L, "So then he walked her to her home,"), //
        Pair(67870L, "he said a pretty girl like you can't"), //
        Pair(70810L, "be alone."), //
        Pair(72210L, "Because the devil he will take all that"), //
        Pair(75270L, "you own and he'll strip you to the"), //
        Pair(77710L, "bone."), //
        Pair(78570L, "She thanked him twice and said goodnight, she"), //
        Pair(80910L, "checked her bag but nothing was inside."), //
        Pair(83450L, "You think the devil has horns, well so"), //
        Pair(86650L, "did I, but I was wrong, his hair"), //
        Pair(89490L, "is combed and he wears a suit and"), //
        Pair(91910L, "tie."), //
        Pair(92310L, "He's nice, polite, he'll catch you by surprise,"), //
        Pair(97070L, "a smile so bright, he's the devil in"), //
        Pair(100190L, "disguise.") //
    )

    println()
    println("--- Iniciando as Legendas (Marino - Devil In Disguise) ---")
    
    var tempoAnterior = 0L // Variável para armazenar o tempo de início da linha anterior

    for (i in letraComTempos.indices) {
        val (tempoAtual, linha) = letraComTempos[i]

        // 1. Calcula a duração da pausa
        // A duração é a diferença entre o tempo de início desta linha e o tempo de início da linha anterior.
        val duracaoPausa = tempoAtual - tempoAnterior

        // Se for a primeira linha (i == 0), o tempoAnterior é 0, então a duraçãoPausa é o tempoAtual.
        // Espera-se que a primeira linha tenha uma pequena pausa inicial, ou comece imediatamente.
        // Usamos uma pausa se for > 0, para evitar esperas desnecessárias no início.
        if (duracaoPausa > 0) {
            try {
                // Pausa a execução para aguardar o tempo de início da linha
                Thread.sleep(duracaoPausa)
            } catch (e: InterruptedException) {
                Thread.currentThread().interrupt()
                break
            }
        }
        
        // 2. Imprime a linha da letra
        println(linha)

        // 3. Atualiza o tempoAnterior para o próximo cálculo
        tempoAnterior = tempoAtual
    }

    // Pausa final após a última linha para visualização
    // Calculamos a pausa usando o tempo final da última legenda (1 minuto e 40 segundos, ou 100730 ms)
    // Usaremos uma pausa extra de 5 segundos (5000L) após o fim da legenda
    val tempoFinalDaUltimaLinha = 100730L
    val pausaRestante = tempoFinalDaUltimaLinha - tempoAnterior
    try {
        if (pausaRestante > 0) {
            Thread.sleep(pausaRestante)
        }
        Thread.sleep(5000L) // Pausa extra para fechar
    } catch (e: InterruptedException) {
        Thread.currentThread().interrupt()
    }


    println()
    println("--- Fim da Canção ---")
}