package com.example.kotlinbasics

class BankAccount(
    var accountHolder:String ,
    var balance:Double){
    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount:Double){

    }
    fun withdraw(amount: Double){

    }
    fun displayTransactionHistory(){

    }
}