import java.util.*

fun main(args: Array<String>) {
    // put your code here
    val scanner = Scanner(System.`in`)
    val celsius = scanner.nextDouble()
    val fahrenheit = celsius * 1.8 + 32

    println(fahrenheit)
}