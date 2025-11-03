package com.example.a37apractice.learning

//Create a Dictionary app using mapOf() function where user will type a word and your program should return the meaning of that word.
fun main() {
    val Newdictionary = mapOf(
        "serene" to "Very calm and peaceful",
        "Alacrity" to "Eagerness or cheerfulness.",
        "Fatuous" to "Silly and unintelligent",
        "Eloquent" to "Fluent and persuasive in speaking or writing"
    )
    println("enter the word");
    val input: String = readln().lowercase();
    if (Newdictionary.containsKey(input)) {
        println("the meaning of the word is ${Newdictionary[input]}");
    }
    else{
        println("the word doesnt exist in the dictionary");
    }
}