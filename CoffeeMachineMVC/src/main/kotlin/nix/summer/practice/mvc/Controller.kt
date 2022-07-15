package nix.summer.practice.mvc

import java.util.*

class Controller {
    val scanner = Scanner(System.`in`)
//    var view = View()
    var model = Model()
    fun makeCoffee(coffeeType: Coffee) {
        if(this.model.water > coffeeType.water && this.model.coffeeBeans > coffeeType.coffeeBeans && this.model.milk > coffeeType.milk){
            model.cups -= 1
            this.model.water -= coffeeType.water
            this.model.coffeeBeans -= coffeeType.coffeeBeans
            this.model.milk -= coffeeType.milk
            this.model.money += coffeeType.money
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
            "1" -> {
                makeCoffee(Coffee.Espresso)
                model.money + 4
            }
            "2" -> {
                makeCoffee(Coffee.Latte)
                model.money + 7
            }
            "3" -> {
                makeCoffee(Coffee.Cappuccino)
                model.money + 6
            }
            "back" -> println()
        }
    }

    fun fill(water: Int, milk: Int, coffeBeans: Int, cups: Int){
        this.model.water += water
        this.model.milk += milk
        this.model.coffeeBeans += coffeBeans
        this.model.cups += cups
    }

    fun take(){
        println("I gave you $${this.model.money}")

    }
}
