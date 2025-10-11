fun main() {
    println("Cinema Tatu Assado!")
    println("Qual sua idade?")
    val entrada = readLine()!!
    val idade = entrada.toIntOrNull()

    if (idade != null) {
        if (idade < 12) {
            println("Ingresso Infantil")
        } else if (idade >= 12 && idade <= 17) {
            println("Ingresso Adolescente")
        } else {
            println("Ingresso Adulto")
        }
    } else {
        println("Entrada inválida. Você só pode digitar números!")
    }
}