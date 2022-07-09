package nix.summer.practice.chatbot

fun main() {
    greetings_bot()
    greetings_user()
}

fun greetings_bot () {
    val bot_name = "Ken"
    val year_of_creating = "2022"
    println("Hello! My name is $bot_name. I was created in $year_of_creating")
}

fun greetings_user(){
    print("Please, remind me your name.\n What a great name you have, ")
    val user_name= readLine()
}