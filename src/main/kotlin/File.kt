// Package declaration
package com.example.myapp

// Import statements
import java.util.*

// Main function - Entry point of the application
fun main() {
    println("Hello, Kotlin!")

    // Example usage of the SampleClass
    val sample = SampleClass("Kotlin Template")
    sample.displayMessage()
}

// A sample class to demonstrate class structure
class SampleClass(private val name: String) {

    // A sample function
    fun displayMessage() {
        println("Welcome to $name!")
    }
}