package nix.summer.practice.coffeemachine

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val coffeeMachine = CoffeeMachine()
    var on = true
    while (on) {
        print("Write action (buy, fill, take, remaining, exit): ")
        var scelta = scanner.next()
        println()
        when (scelta) {
            "buy" -> {
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                scelta = scanner.next()
                coffeeMachine.buy(scelta)
            }
            "fill" -> {
                print("Write how many ml of water do you want to add: ")
                val water = scanner.nextInt()
                print("Write how many ml of milk do you want to add: ")
                val milk = scanner.nextInt()
                print("Write how many grams of coffee beans do you want to add: ")
                val coffeeBeans = scanner.nextInt()
                print("Write how many disposable cups of coffee do you want to add: ")
                val cups = scanner.nextInt()
                coffeeMachine.fill(water, milk, coffeeBeans, cups)
            }
            "take" -> coffeeMachine.take()
            "remaining" -> {
                println("The coffee machine has:")
                println("${coffeeMachine.water} of water")
                println("${coffeeMachine.milk} of milk")
                println("${coffeeMachine.coffeeBeans} of coffee beans")
                println("${coffeeMachine.cups} of disposable cups")
                println("${coffeeMachine.money} of money\n")
            }
            "exit" -> on = false
        }
    }
}

enum class Coffee(val water: Int, val coffeeBeans: Int, val milk: Int, val money: Int){
    Espresso(250, 16, 0, 4),
    Latte(350, 20, 75, 7),
    Cappuccino(200, 12, 100, 6);
}

class CoffeeMachine () {
    var water = 400
    var milk = 540
    var coffeeBeans = 120
    var cups = 9
    var money = 550

    fun makeCoffee(coffeeType: Coffee) {
        if(this.water > coffeeType.water && this.coffeeBeans > coffeeType.coffeeBeans && this.milk > coffeeType.milk){
            cups -= 1
            this.water -= coffeeType.water
            this.coffeeBeans -= coffeeType.coffeeBeans
            this.milk -= coffeeType.milk
            this.money += coffeeType.money
            enoughResources()
        } else notEnoughResources()
    }
    fun enoughResources(){
        println("I have enough resources, making you a coffee!\n")
    }
    fun notEnoughResources(){
        println("coffee machine doesn’t have enough resources to make coffee\n")
    }
    fun buy(scelta: String){
        when (scelta) {
            "1" -> makeCoffee(Coffee.Espresso)
            "2" -> makeCoffee(Coffee.Latte)
            "3" -> makeCoffee(Coffee.Cappuccino)
            "back" -> println()
        }
    }
    fun fill(water: Int, milk: Int, coffeBeans: Int, cups: Int){
        this.water += water
        this.milk += milk
        this.coffeeBeans += coffeBeans
        this.cups += cups
    }
    fun take(){
        println("I gave you $${this.money}")
        this.money = 0
    }
}