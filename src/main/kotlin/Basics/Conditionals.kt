package Basics

//fun maxOf(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}

// or

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun switchEquivalent(obj: Any):String
{
   val res= when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
    return res
}


fun main() {
    println("max of 0 and 42 is ${maxOf(0, 42)}")
    println("${switchEquivalent("Hello")}")
}