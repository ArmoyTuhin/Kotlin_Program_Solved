import java.util.*
fun main()
{
    println("Give the string please")
    val scanner = Scanner(System.`in`)
    val str = scanner.nextLine()


    println("The string is after removing whitespace ${str.filter { !it.isWhitespace() }}")

}



