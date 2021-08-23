package one.digitalinnovation.collection

fun main() {
    val sara = Funcionario("Sara", 1000.0, "CLT")
    val kelvin = Funcionario("Kelvin", 2000.0, "PJ")
    val alexander = Funcionario("Alexander", 5000.0, "CLT")

    val funcionarios = listOf(sara, kelvin, alexander)

    funcionarios.forEach { println(it) }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    println(funcionarios.find {it.nome == "Sara"})
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    funcionarios.groupBy { it.tipoContratacao }.forEach { println(it) }
  //  println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")
}

