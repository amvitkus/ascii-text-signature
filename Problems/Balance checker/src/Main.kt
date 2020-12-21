import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var initial = scanner.nextInt()

    do {

        val purchase = scanner.nextInt()
        val remainder = initial - purchase
        val required = (remainder + purchase) - remainder

        print("Thank you for choosing us to manage your account! You have $remainder money.\n")
        initial = remainder

        if (initial < required) {
            println("Error, insufficient funds for the purchase. You have $initial, but you need $required.")
        }
    } while (remainder != 0)


}