package nix.summer.practice.mvc

import java.util.*

class View {
    var coffeeMachine = Model()
    var controller = Controller()
    fun Interfase () {

        val scanner = Scanner(System.`in`)
        var on = true
        while (on) {
            print("Write action (buy, fill, take, remaining, exit): ")
            var scelta = scanner.next()
            println()
            when (scelta) {
                "buy" -> {
                    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                    scelta = scanner.next()
                    controller.buy(scelta)
                }
                "fill" ->
                {
                    print("Write how many ml of water do you want to add: ")
                    val water = scanner.nextInt()
                    coffeeMachine.water += water
                    print("Write how many ml of milk do you want to add: ")
                    val milk = scanner.nextInt()
                    coffeeMachine.milk+= milk
                    print("Write how many grams of coffee beans do you want to add: ")
                    val coffeeBeans = scanner.nextInt()
                    coffeeMachine.coffeeBeans += coffeeBeans
                    print("Write how many disposable cups of coffee do you want to add: ")
                    val cups = scanner.nextInt()
                    coffeeMachine.cups += cups
                    controller.fill(water, milk, coffeeBeans, cups)
                }
                "take" -> {
                    controller.take()
                    coffeeMachine.money=0
                }
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
}

