import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val num = scanner.nextInt()
    val b = scanner.nextBoolean()

    if (num in 10..20 && !b) {
        println("true")
    } else if (num in 15..25 && b) {
        println("true")
    } else {
        println("false")
    }

    //Below is another solution
//    val num = scanner.nextInt()
//    val weekend = scanner.nextBoolean()
//    val succesful = num in 10..20 && !weekend || num in 15..25 && weekend
//    println(succesful)

}