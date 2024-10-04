package com.example.kotlinbasics

fun main(){
    val fruitsList = mutableListOf("Apple","Banana","Cherry","Dragon Fruit","Grape")

    println(fruitsList)

    fruitsList.add("Jack-fruit")
    println(fruitsList)
    fruitsList.remove("Dragon Fruit")
    println(fruitsList)

    when{
        fruitsList.contains("Banana") -> println("Banana is already present in the list.")
        else -> println("Banana is not found in the fruit list.")
    }

    when{
        fruitsList.contains("Dragon Fruit") -> println("Dragon Fruit is already present in the list.")
        else -> println("Dragon Fruit is not found in the fruit list.")
    }

    println("")

    for(index in 0 until fruitsList.size){
        println("$index. ${fruitsList[index]} --Added")
    }
}