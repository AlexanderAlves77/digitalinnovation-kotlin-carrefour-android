package one.digitalinnovation.collection

fun main() {
    val sara = Funcionario("Sara", 1000.0, "CLT")
    val kelvin = Funcionario("Kelvin", 2000.0, "PJ")
    val alexander = Funcionario("Alexander", 5000.0, "CLT")

    val funcionarios1 = setOf(sara, kelvin)
    val funcionarios2 = setOf(alexander)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    val funcionarios3 = setOf(sara, kelvin, alexander)
    val resultSubtr = funcionarios3.subtract(funcionarios2)
    resultSubtr.forEach { println(it) }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}