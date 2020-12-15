import java.util.Scanner

// write your function here
fun isVowel(letter: Char): Boolean {
    val vowels = "aeiou"
    return letter.toLowerCase() in vowels
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}