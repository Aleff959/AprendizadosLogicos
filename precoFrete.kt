fun main() {
    println("Calcule o seu frete!")
    println("Insira o peso do seu encomenda em gramas:")
    val orderWeight: Int? = readLine()?.toIntOrNull()

    if (orderWeight == null || orderWeight < 0) {
        println("Peso inválido!")
    } else {
        if (orderWeight >= 1000) {
            println("Seu frete ficou por: R$ 10,00")
        } else if (orderWeight >= 500) {
            println("Seu frete ficou por: R$ 25,00")
        } else if (orderWeight >= 0) {
            println("Seu frete ficou por: R$ 50,00")
        }
    }
    println("Sucesso! Fim do programa.")
}