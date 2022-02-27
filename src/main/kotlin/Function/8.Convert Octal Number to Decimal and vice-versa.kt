import java.util.*

fun octalToDecimal(octalNum: Int) {

}
fun decimalToOctal(deciNum: Int) {
    var n = deciNum
    var remainder = 0
    print("The binary of $deciNum is  ")
    while(n!=0)
    {
        n=n/8
        remainder = n%8
        print(remainder)
    }
}

fun main()
{
    val scanner  = Scanner(System.`in`)
    println("Which you want? \n 1.Decimal to Octal 2.Octal to decimal. \n  Enter 1 or 2")
    val option = scanner.nextInt()
    when(option)
    {
        1-> {
            println("Give the decimal number please")
            val deciNum = scanner.nextInt()
            decimalToOctal(deciNum)
        }
        2-> {
            println("Give the Octal number please")
            val octalNum = scanner.nextInt()
            octalToDecimal(octalNum)
        }
    }

}


