package one.digitalinnovation.collection

fun main() {
    val sara = Funcionario("Sara", 3000.0, "CLT")
    val kelvin = Funcionario("Kelvin", 4000.0, "PJ")
    val alexander = Funcionario("Alexander", 5000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(sara.nome, sara)
    repositorio.create(kelvin.nome, kelvin)
    repositorio.create(alexander.nome, alexander)

    println(repositorio.findById(sara.nome))
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    repositorio.findAll().forEach { println(it) }
    println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")

    repositorio.remove(sara.nome)
    repositorio.findAll().forEach { println(it) }
}