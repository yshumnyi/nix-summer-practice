package nix.summer.practice.mvc

class Model {
    var water = 400
    var milk = 540
    var coffeeBeans = 120
    var cups = 9
    var money = 550
}

enum class Coffee(val water: Int, val coffeeBeans: Int, val milk: Int, val money: Int){
    Espresso(250, 16, 0, 4),
    Latte(350, 20, 75, 7),
    Cappuccino(200, 12, 100, 6);
}