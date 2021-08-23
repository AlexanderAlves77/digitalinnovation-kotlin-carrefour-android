package one.digitalinnovation.collection

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Sara"
    nomes[1] = "Kelvin"
    nomes[2] = "Patrick"

    for (nome in nomes) {
        println(nome)
    }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Alexander", "Marly", "José")
    nomes2.sort()
    nomes2.forEach { println(it) }
}