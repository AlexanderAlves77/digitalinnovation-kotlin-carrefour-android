package one.digitalinnovation.collection

fun main() {
    val pair: Pair<String, Double> = Pair("Sara", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Kelvin" to 2500.0,
        "Alexander" to 3500.0
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}