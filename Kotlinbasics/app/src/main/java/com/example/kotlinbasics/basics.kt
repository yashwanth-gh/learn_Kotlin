package com.example.kotlinbasics

fun intPractice(year: Int) {
    // Calculate age based on the input year
    val age = 2024 - year

    // Initial favorite number
    var favNum = 6
    print("Enter your favorite number: ")

    // Read user input and safely convert to Int (or fallback to original favNum)
    val input = readlnOrNull()
    favNum = input?.toIntOrNull() ?: favNum
    println("Your favorite number is: $favNum")
    println("Your Age is: $age")

    // Demonstrating explicit type conversion
    favNum = 44.732.toInt()  // Convert a Double to Int (truncates the decimal part)
    println("A long favorite number (after casting from Double): $favNum")

    // Different ways of declaring Long type
    val longNum = 34L  // Explicit Long declaration
    println("This is a Long data type: $longNum")

    // Short type example (note: Short has a range of -32,768 to 32,767)
    var shortNum: Short = 31_000
    // Uncommenting the below line causes an error: Value out of range for Short
    // shortNum = 43_679_000

    // Byte type example (range: -128 to 127)
    var byteNum: Byte = 122
    // Uncommenting the below line causes an error: Value out of range for Byte
    // byteNum = 535

    // --- Assigning Types for All Kotlin Number Types ---
    val byteValue: Byte = 10         // Byte
    val shortValue: Short = 20       // Short
    val intValue: Int = 100          // Int
    val longValue: Long = 1000L      // Long
    val floatValue: Float = 10.5F    // Float
    val doubleValue: Double = 20.99  // Double

    // --- Type Casting in Kotlin Number Types ---
    val intVal: Int = 42

    // Convert Int to Long
    val longVal: Long = intVal.toLong()

    // Convert Int to Double
    val doubleVal: Double = intVal.toDouble()

    // Convert Int to Byte
    val byteVal: Byte = intVal.toByte()

    // Convert Double to Float
    val floatVal: Float = doubleVal.toFloat()

    // Convert Float to Int (truncates the decimal part)
    val newIntVal: Int = floatVal.toInt()

    // Convert Int to UByte (unsigned byte)
    val uByteVal: UByte = intVal.toUByte()

    // Display results of type conversions
    println("Int to Long: $longVal")
    println("Int to Double: $doubleVal")
    println("Int to Byte: $byteVal")
    println("Double to Float: $floatVal")
    println("Float to Int (after truncation): $newIntVal")
    println("Int to UByte: $uByteVal")
}

fun basicPractice() {
    // --- Byte Type ---
    // Byte has a range of -128 to 127
    val byteValue: Byte = 127
    println("Byte value: $byteValue")

    // --- Short Type ---
    // Short has a range of -32,768 to 32,767
    val shortValue: Short = 32_767
    println("Short value: $shortValue")

    // --- Int Type ---
    // Int has a range of -2,147,483,648 to 2,147,483,647
    val intValue: Int = 2_147_483_647
    println("Int value: $intValue")

    // Use underscores to enhance readability for large numbers
    val bigNumber: Int = 1_000_000  // One million
    println("Big number with underscore: $bigNumber")

    // --- Long Type ---
    // Long has a range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    val longValue: Long = 9_223_372_036_854_775_807L  // 'L' is required for Long literals
    println("Long value: $longValue")

    // --- Float Type ---
    // Float (32-bit floating point) has a limited precision (~7 decimal digits)
    val floatValue: Float = 3.14159F  // 'F' is required for Float literals
    println("Float value: $floatValue")

    // --- Double Type ---
    // Double (64-bit floating point) has higher precision (~15 decimal digits)
    val doubleValue: Double = 3.141592653589793
    println("Double value: $doubleValue")

    // --- Char Type ---
    // Char represents a single character, enclosed in single quotes
    val charValue: Char = 'A'
    println("Char value: $charValue")

    // --- Boolean Type ---
    // Boolean represents true/false values
    val boolTrue: Boolean = true
    val boolFalse: Boolean = false
    println("Boolean values: $boolTrue, $boolFalse")

    // --- Type Conversions and Casting ---
    // Explicit type conversions are necessary because Kotlin doesn't perform implicit conversions

    // Int to Long
    val intToLong: Long = intValue.toLong()
    println("Int to Long: $intToLong")

    // Long to Float
    val longToFloat: Float = longValue.toFloat()
    println("Long to Float: $longToFloat")

    // Double to Int (truncates the decimal part)
    val doubleToInt: Int = doubleValue.toInt()
    println("Double to Int (truncated): $doubleToInt")

    // Float to Double (safe conversion)
    val floatToDouble: Double = floatValue.toDouble()
    println("Float to Double: $floatToDouble")

    // Int to Byte (possible range overflow if out of Byte's range)
    val intToByte: Byte = intValue.toByte()
    println("Int to Byte (may overflow): $intToByte")

    // --- Nullable Types and Safe Operations ---
    // Kotlin provides nullable types (e.g., Int?) and null-safe operators to avoid NullPointerException
    val nullableInt: Int? = null

    // Use the safe-call operator (?.) to safely access nullable variables
    println("Nullable Int: ${nullableInt?.toString() ?: "Value is null"}")

    // Elvis operator (?:) provides a fallback value if the left expression is null
    val safeInt: Int = nullableInt ?: 0  // If nullableInt is null, use 0
    println("Safe Int with fallback: $safeInt")

    // --- Arithmetic Operations ---
    val difference = doubleValue - floatValue  // Subtracting Double and Float, result is Double
    val product = byteValue * 2  // Multiplying Byte with Int, result is Int
    val division = longValue / intValue  // Dividing Long by Int, result is Long

    println("Arithmetic Operations: Sum = , Difference = $difference, Product = $product, Division = $division")

    // --- Practical Usage Techniques ---
    // 1. String Templates:
    val userName = "John"
    println("Hello, $userName! Welcome to Kotlin.")

    // 2. Null safety in project usage:
    val userInput: String? = null
    val userAge: Int = userInput?.toIntOrNull() ?: -1  // Safe casting from nullable String to Int
    println("User age: $userAge")  // If the input was invalid or null, fallback to -1

    // 3. Smart casts:
    val someAny: Any = 42
    if (someAny is Int) {
        println("The value is an Int: ${someAny + 10}")  // Smart cast to Int within this block
    }

    // 4. Using ranges:
    val isWithinRange = intValue in 1..1_000_000
    println("Is within range: $isWithinRange")  // Check if the intValue is in the range of 1 to 1,000,000
}

fun main() {
val myBook = BookClass()

    println("""
        Book name      : ${myBook.title}
        Book author    : ${myBook.author}
        Book publisher : ${myBook.yearPublished}
    """.trimIndent())

    val customBook = BookClass("Jugari Cross","Purnachandra tejasi",1996);
    println("""
        Book name      : ${customBook.title}
        Book author    : ${customBook.author}
        Book publisher : ${customBook.yearPublished}
    """.trimIndent())



}
