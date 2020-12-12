import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var num = scanner.nextInt()
    var count = 0

    while (num > 0) {
        num /= 10
        count += 1
    }
    println("$count")
}

//Below is another solution
//val n = scanner.nextInt()
//
//when {
//    n < 10 -> println(1)
//    n < 100 -> println(2)
//    n < 1000 -> println(3)
//    n < 10_000 -> println(4)
//}