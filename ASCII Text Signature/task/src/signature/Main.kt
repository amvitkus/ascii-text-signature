package signature

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val name = scanner.nextLine()
    val border = "*"
    val borderLength = name.length

//    println("**" + name.length + "**")
//    println("* $name *")
//    println("**" + name.length + "**")
    print("****")
    //println("* $name *")

    for (i in 0 until borderLength) {
        print(border)
//        println("* $name *")
//        print("**" + border + "**")

    }
    print("\n")
    print("* $name *")
    print("\n")
    print("****")

    for (i in 0 until borderLength) {
        print(border)
//        println("* $name *")
//        print("**" + border + "**")

    }

    //Code Below is a better way of solving it.
//    val ch = scanner.nextLine()
//
//    val lg: Int = ch.length
//    val str: String = "*".repeat(lg)
//
//    println("**$str**")
//    println("* $ch *")
//    println("**$str**")

}
