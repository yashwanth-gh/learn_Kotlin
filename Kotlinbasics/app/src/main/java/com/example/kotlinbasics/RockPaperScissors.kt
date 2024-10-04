package com.example.kotlinbasics

fun asciiArt() {
    println(
        """
          _____            _      _____                         _____      _                    
         |  __ \          | |    |  __ \                       / ____|    (_)                   
         | |__) |___   ___| | __ | |__) __ _ _ __   ___ _ __  | (___   ___ _ ___ ___  ___  _ __ 
         |  _  // _ \ / __| |/ / |  ___/ _` | '_ \ / _ | '__|  \___ \ / __| / __/ __|/ _ \| '__|
         | | \ | (_) | (__|   <  | |  | (_| | |_) |  __| |     ____) | (__| \__ \__ | (_) | |   
         |_|  \_\___/ \___|_|\_\ |_|   \__,_| .__/ \___|_|    |_____/ \___|_|___|___/\___/|_|   
                                         | |                                                 
                                         |_|                                                 
        """.trimIndent()
    )
}

fun rps(): Int {
    println("1: Rock\n2: Paper\n3: Scissors\nPlease enter your choice!")
    val userChoice = readln().toIntOrNull() ?: return -1
    val computerChoice = (1..3).random()

    val result = when {
        userChoice == computerChoice -> {
            println("This try is a draw!\n")
            0
        }
        userChoice == 1 && computerChoice == 3 -> 1
        userChoice == 2 && computerChoice == 1 -> 1
        userChoice == 3 && computerChoice == 2 -> 1
        else -> 2
    }

    val choices = mapOf(1 to "Rock", 2 to "Paper", 3 to "Scissors")
    println("Your choice is ${choices[userChoice]}")
    println("Computer choice is ${choices[computerChoice]}")

    when (result) {
        1 -> println("You are the winner, Congratulations!\n")
        2 -> println("You lost, sorry try again!\n")
    }

    return result
}

fun main() {
    println("Please enter how many tries you want to play with the computer:\n(Default number of tries = 5, Max -> 15)")
    val triesInput = readln().toIntOrNull() ?: 5
    val maxTries = if (triesInput in 1..15) triesInput else {
        println("Sorry, choose anything between 1 and 15.")
        return
    }

    println("Welcome to Rock Paper Scissors game!")
    asciiArt()
    println("""
        -: GAME INSTRUCTIONS :-
        1. Choose between ROCK, PAPER, and SCISSORS when prompted.
        2. For each win, you get 1 point. If you lose, the computer gets 1 point.
        3. You have $maxTries tries throughout the game.
        4. The winner is the one with the most victories.
        5. You can quit anytime by typing 'q'. Quitting counts as a loss!
    """.trimIndent())

    var userPoints = 0
    var computerPoints = 0
    var remainingTries = maxTries

    while (remainingTries > 0) {
        val score = rps()
        remainingTries--

        when (score) {
            1 -> userPoints++
            2 -> computerPoints++
        }

        if (remainingTries > 0) {
            println("""
                At the end of this try the scoreboard looks like:
                --------------
                USER: $userPoints 
                COMPUTER: $computerPoints
                --------------
            """.trimIndent())
            println("Do you want to Quit or Continue? Enter 'q' to QUIT or press ENTER to continue.")
            if (readln().equals("q", ignoreCase = true)) {
                println("\nYou quit and lost! Thank you for playing.")
                return
            }
        }
    }

    println("""
        Final SCOREBOARD:
        --------------
        USER: $userPoints 
        COMPUTER: $computerPoints
        --------------
    """.trimIndent())

    when {
        userPoints > computerPoints -> println("CONGRATULATIONS! You won the match!")
        computerPoints > userPoints -> println("OOPS! You LOST the match!")
        else -> println("Close call, but this match is a DRAW!")
    }
}
