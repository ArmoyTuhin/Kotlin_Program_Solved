package Function

import java.util.Scanner
fun strReverse(rawstr: String)
: String{
      if(rawstr.isEmpty())
        return rawstr

    return strReverse(rawstr.substring(1)) + rawstr[0]
}

fun main() {

    val scanner = Scanner(System.`in`)
    println("Input The String ")
    var rawstr = scanner.nextLine()

    println(strReverse(rawstr))

}
