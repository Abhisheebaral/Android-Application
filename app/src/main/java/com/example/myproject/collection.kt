package com.example.myproject

fun main() {

    // 1. LIST
    val colors = listOf("Red", "Green", "Blue") // cannot modify this list
    println("Fixed Colors List: $colors")

    val pets = mutableListOf("Parrot", "Fish") // you can add or remove items
    pets.add("Hamster")  // adding an item
    println("Editable Pets List: $pets")


    // 2. SET
    val letters = setOf("A", "B", "C", "A") // duplicates removed, cannot change
    println("Fixed Letters Set: $letters")

    val luckyNumbers = mutableSetOf(7, 14, 21) // can modify this set
    luckyNumbers.add(28)  // add a number
    luckyNumbers.remove(14) // remove a number
    println("Editable Lucky Numbers Set: $luckyNumbers")


    // 3. MAP
    val capitals = mapOf("France" to "Paris", "Japan" to "Tokyo") // fixed map
    println("Fixed Capitals Map: $capitals")

    val scores = mutableMapOf("Player1" to 50, "Player2" to 75) // editable map
    scores["Player3"] = 90  // add a new key-value pair
    println("Editable Scores Map: $scores")
}
//change1
