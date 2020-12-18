package signature

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val firstName = scanner.next()
    val secondName = scanner.next()
    var status = ""
    while (scanner.hasNext()) {
        status = scanner.nextLine()
    }
    val symbols = middleOfSign(bigName(firstName, secondName, 1).length, status.length)

    println("Enter name and surname: $firstName $secondName")
    println("Enter person's status: $status")
    println(symbols[0])
    println("*" + symbols[1] + bigName(firstName, secondName, 1) + symbols[2] + "*")
    println("*" + symbols[1] + bigName(firstName, secondName, 2) + symbols[2] + "*")
    println("*" + symbols[1] + bigName(firstName, secondName, 3) + symbols[2] + "*")
    println("*" + symbols[3] + status + symbols[4] + "*")
    println(symbols[0])
}

fun bigName(first: String, second: String, line: Int): String {
    val bigLetters1 = arrayOf("____", "___ ", "____", "___ ", "____", "____", "____", "_  _", "_", " _", "_  _", "_   ", "_  _", "_  _", "____", "___ ", "____", "____", "____", "___", "_  _", "_  _", "_ _ _", "_  _", "_   _", "___ ")
    val bigLetters2 = arrayOf("|__|", "|__]", "|   ", "|  \\", "|___", "|___", "| __", "|__|", "|", " |", "|_/ ", "|   ", "|\\/|", "|\\ |", "|  |", "|__]", "|  |", "|__/", "[__ ", " | ", "|  |", "|  |", "| | |", " \\/ ", " \\_/ ", "  / ")
    val bigLetters3 = arrayOf("|  |", "|__]", "|___", "|__/", "|___", "|   ", "|__]", "|  |", "|", "_|", "| \\_", "|___", "|  |", "| \\|", "|__|", "|   ", "|_\\|", "|  \\", "___]", " | ", "|__|", " \\/ ", "|_|_|", "_/\\_", "  |  ", " /__")
    var result = ""
    for (i in 0..first.lastIndex) {
        when (line) {
            1 -> result += bigLetters1[first[i].toUpperCase().toInt() - 65]
            2 -> result += bigLetters2[first[i].toUpperCase().toInt() - 65]
            3 -> result += bigLetters3[first[i].toUpperCase().toInt() - 65]
        }
        if (i == first.lastIndex) break
        result += " "
    }
    result += "      "
    for (i in 0..second.lastIndex) {
        when (line) {
            1 -> result += bigLetters1[second[i].toUpperCase().toInt() - 65]
            2 -> result += bigLetters2[second[i].toUpperCase().toInt() - 65]
            3 -> result += bigLetters3[second[i].toUpperCase().toInt() - 65]
        }
        if (i == second.lastIndex) break
        result += " "
    }
    return result
}

fun middleOfSign(name: Int, status: Int): Array<String> {
    val lengthOfAsterisks: Int
    val lengthOfSpacesNameRight: Int
    val lengthOfSpacesStatusRight: Int
    val lengthOfSpacesNameLeft: Int
    val lengthOfSpacesStatusLeft: Int
    if (name >= status) {
        lengthOfAsterisks = name + 6
        lengthOfSpacesNameLeft = 2
        lengthOfSpacesNameRight = 2
        if ((name % 2 == 0 && status % 2 != 0) xor (name % 2 != 0 && status % 2 == 0)) {
            lengthOfSpacesStatusLeft = (lengthOfAsterisks - 2 - status) / 2
            lengthOfSpacesStatusRight = (lengthOfAsterisks - 2 - status) / 2 + 1
        } else {
            lengthOfSpacesStatusLeft = (lengthOfAsterisks - 2 - status) / 2
            lengthOfSpacesStatusRight = lengthOfSpacesStatusLeft
        }
    } else {
        lengthOfAsterisks = status + 6
        lengthOfSpacesStatusLeft = 2
        lengthOfSpacesStatusRight = 2
        if ((name % 2 == 0 && status % 2 != 0) xor (name % 2 != 0 && status % 2 == 0)) {
            lengthOfSpacesNameLeft = (lengthOfAsterisks - 2 - name) / 2
            lengthOfSpacesNameRight = (lengthOfAsterisks - 2 - name) / 2 + 1
        } else {
            lengthOfSpacesNameLeft = (lengthOfAsterisks - 2 - name) / 2
            lengthOfSpacesNameRight = lengthOfSpacesNameLeft
        }
    }
    var asterisks = ""
    repeat(lengthOfAsterisks) {
        asterisks += "*"
    }
    var spacesNameRight = ""
    repeat(lengthOfSpacesNameRight) {
        spacesNameRight += " "
    }
    var spacesNameLeft = ""
    repeat(lengthOfSpacesNameLeft) {
        spacesNameLeft += " "
    }
    var spacesStatusRight = ""
    repeat(lengthOfSpacesStatusRight) {
        spacesStatusRight += " "
    }
    var spacesStatusLeft = ""
    repeat(lengthOfSpacesStatusLeft) {
        spacesStatusLeft += " "
    }
    return arrayOf(asterisks, spacesNameLeft, spacesNameRight, spacesStatusLeft, spacesStatusRight)
}
