package nix.summer.practice.coffeemachine

fun main() {
    mass ()
    calculationIngredients ()
}

fun mass () {
    println("Starting to make a coffee in NIX office")
    println("Grinding coffee beans")
    println("Boiling water")
    println("Mixing boiled water with crushed coffee beans")
    println("Pouring coffee into the cup")
    println("Pouring some milk into the cup")
    println("Coffee is ready! Go to work!")
}

fun calculationIngredients () {
    println("Write how many cups of coffee you will need:")
    val cupCoffee = readLine()?.toInt()!!
    var water:Int = 200 * cupCoffee
    var milk:Int = 50 * cupCoffee
    var coffeeBeans:Int = 15 * cupCoffee
    println("For $cupCoffee cups of coffee you will need:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$coffeeBeans g of coffee beans")
}