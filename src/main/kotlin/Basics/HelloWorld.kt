package Basics

import java.util.Scanner

// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */
/* The comment starts here
/* contains a nested comment */
and ends here. */
fun main(args: Array<String>) {
    val o:Any=10;
    print(o)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")



    var integer:Int = reader.nextInt()

    println("You entered: $integer")
    print("Hi Kotlin!")
    println("Hello World!")

    val stringInput = readLine()
    println("You entered: $stringInput")

}