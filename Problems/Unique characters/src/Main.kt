import java.util.*

fun main() {
    // put your code here
    //Commented code is first attempt based on Java finding.
//    val scanner = Scanner(System.`in`)
//    val s1 = scanner.next()
//    getValues(s1)

    val word = readLine()!!

    // part of task: use break/continue/return
    var countOf1Appearance = 0
    for (letter in 'a'..'z') {
        if (word.filter { it == letter }.count() != 1) {
            continue
        }
        countOf1Appearance++
    }
    println(countOf1Appearance)

    //This code below is another solution, doesn't need extra function.
//    val str = Scanner(System.`in`).next()
//    var count = 0
//    for (s in str) {
//        val t = str.split(s)
//        if (t.size == 2) count++
//    }
//    println(count)

}

//fun getValues(s1: String) {
//    val s2 = s1.toLowerCase()
//    val sb = StringBuffer(s2)
//    var l = sb.length
//    var count = 0
//    var i = 0
//    while (i < l) {
//        count = 0
//        var j = i + 1
//        while (j < l) {
//            if (sb[i] == sb[j]) {
//                sb.deleteCharAt(j)
//                count++
//                j--
//                l--
//            }
//            j++
//        }
//        if (count > 0) {
//            sb.deleteCharAt(i)
//            i--
//            l--
//        }
//        i++
//    }
//    if (sb.isEmpty()) {
//        println(0)
//    } else println(sb.length)
//}