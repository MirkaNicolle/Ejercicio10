package choco

fun main(args: Array<String>) {
    val boxOfChocolate = RandomBox<Chocolate>(arrayListOf<Chocolate>(
        Chocolate(name = "Chocolate 1", sugarContent = 100, flavor = "Cereza"),
        Chocolate(name = "Chocolate 2", sugarContent = 100, flavor = "Licor"),
        Chocolate(name = "Chocolate 3", sugarContent = 100, flavor = "Nuez")
    ));

    val forrest = ForrestGump<Chocolate>(boxOfChocolate);
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
}


