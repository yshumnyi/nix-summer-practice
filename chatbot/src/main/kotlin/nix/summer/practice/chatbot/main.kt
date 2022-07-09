package nix.summer.practice.chatbot

import java.lang.Math


fun main() {
    greetings_bot()
    greetings_user()
    guess_age()
}

fun greetings_bot () {
    val bot_name = "Ken"
    val year_of_creating = "2022"
    println("Hello! My name is $bot_name. I was created in $year_of_creating")
}

fun greetings_user(){
    print("Please, remind me your name.\n What a great name you have, ")
    val user_name= readLine()
    println("What a great name you have, $user_name!")
}

fun guess_age() {
//    var age: Int
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val a = readLine()?.toInt()!!
    val b = readLine()?.toInt()!!
    val c = readLine()?.toInt()!!

    val age = ( a * 70 + b * 21 + c * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}
