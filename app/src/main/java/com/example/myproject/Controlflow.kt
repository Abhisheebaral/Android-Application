package com.example.myproject


fun main() {
    // Simple if-else example
    print("Enter your age to check driving eligibility: ")
    val driveAge: Int = readln().toInt()

    if (driveAge >= 18) {
        println("You are allowed to apply for a driving license.")
    } else {
        println("Sorry, you are not old enough for a driving license.")
    }


    // If-Else-If ladder example
    print("Enter your age again for category check: ")
    val currentAge: Int = readln().toInt()

    if (currentAge < 13) {
        println("You are a kid.")
    } else if (currentAge < 18) {
        println("You are a teenager.")
    } else if (currentAge < 40) {
        println("You are a young adult.")
    } else {
        println("You belong to the experienced adult group.")
    }
}

