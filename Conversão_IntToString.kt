fun main () {

    println("Insira um nota de 0 à 100!")
    val input = readLine()?.trim()
    val userNota: Int? = input?.toIntOrNull()

    if (userNota == null || userNota !in 0..100) {
        println("Você só pode digitar números de 0 a 100!")
    } else {
        val nota: Int = userNota

        if (nota < 60) {
            println("Sua nota: F")
        } else if (nota in 60..69) {
            println("Sua nota: D")
        } else if (nota in 70..79) {
            println("Sua nota: C")
        } else if (nota in 80..89) {
            println("Sua nota: B")
        } else if (nota in 90..95) {
            println("Sua nota: A")
        } else if (nota in 96..100) {
            println("Sua nota: A+")
        }
    }
}