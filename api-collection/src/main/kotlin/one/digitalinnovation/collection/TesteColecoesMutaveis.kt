package one.digitalinnovation.collection

fun main() {
    val sara = Funcionario("Sara", 1000.0, "CLT")
    val kelvin = Funcionario("Kelvin", 2000.0, "PJ")
    val alexander = Funcionario("Alexander", 5000.0, "CLT")

    val funcionarios = mutableListOf(sara, kelvin)
    funcionarios.forEach { println(it) }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    funcionarios.add(alexander)
    funcionarios.forEach { println(it) }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    funcionarios.remove(alexander)
    funcionarios.forEach { println(it) }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    val funcionariosSet = mutableSetOf(alexander)
   // funcionariosSet.forEach { println(it) }

    funcionariosSet.add(kelvin)
    funcionariosSet.add(sara)
    funcionariosSet.forEach { println(it) }
}