package nix.summer.practice.chatbot


fun main() {
    greetingsBot()
    greetingsUser()
    guessAge()
    toPositiveNumber()
    test()
    ending()
}

fun greetingsBot () {
    val botName = "Ken"
    val yearOfCreating = "2022"
    println("Hello! My name is $botName. I was created in $yearOfCreating")
}

fun greetingsUser(){
    print("Please, remind me your name.\n What a great name you have, ")
    val userName= readLine()
    println("What a great name you have, $userName!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val a = readLine()?.toInt()!!
    val b = readLine()?.toInt()!!
    val c = readLine()?.toInt()!!

    val age = ( a * 70 + b * 21 + c * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun toPositiveNumber(){
    println("I will prove to you that I can count to any number you want:")
    val x = readLine()?.toInt()!!
    for (n in 0..x) {
        println("$n !")
    }
}

fun test(){
    println("Modularity criteria include?")
    println("1. continuity ")
    println("2. the only choice")
    println("3. unified access")
    println("4. weak connectivity of interfaces")
    var answer  = readLine()
    while (answer != "1"){
        println("Please, try again.")
        answer  = readLine()
    }
println("Great, you right!")
}

fun ending(){
    println("Goodbye, have a nice day!")
}
