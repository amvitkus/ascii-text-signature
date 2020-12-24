import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var initial = scanner.nextInt()

    //while (scanner.hasNextInt()) {
        var a = scanner.nextInt()
        var b = scanner.nextInt()
        var c = scanner.nextInt()
        var purchase = a + b + c
        val remainder = initial - purchase
        val required = remainder + purchase - remainder
    //}

    print("Thank you for choosing us to manage your account! You have $remainder money.\n")
    initial = remainder

    if (initial <= 0) {
        println("Error, insufficient funds for the purchase. You have $initial, but you need $required.")
    }

}

