import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)

    val s1 = scanner.next().toLowerCase()
    val s2 = scanner.next().toLowerCase()

    if (s1 == s2) {
        println("true")
    } else {
        println("false")
    }

    //Another more efficient method of solving problem
//    val ch1 = scanner.nextLine()
//    val ch2 = scanner.nextLine()
//
//    println(ch1.toLowerCase() == ch2.toLowerCase())
}