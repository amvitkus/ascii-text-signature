import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    val axes = IntArray(6) { input.nextInt() }
    var rows = ""
    var columns = ""

    for (x in 1..5) {
        if (axes[0] == x || axes[2] == x || axes[4] == x) continue
        rows += "$x "
    }
    for (y in 1..5) {
        if (axes[1] == y || axes[3] == y || axes[5] == y) continue
        columns += "$y "
    }
    println(rows.trim())
    println(columns.trim())

//My non working attempt below
    //val myArray = input.IntArray(6)
//    val x1 = input.nextInt()
//    val y1 = input.nextInt()
//    val x2 = input.nextInt()
//    val y2 = input.nextInt()
//    val x3 = input.nextInt()
//    val y3 = input.nextInt()
//
//    var rows = ""
//    var columns = ""
//
//    for (x in 1..5) {
//        if ()
//    }
//
//    for (y in 1..5) {
//
//    }
//
//    println(rows.trim())
//    println(columns.trim())
}