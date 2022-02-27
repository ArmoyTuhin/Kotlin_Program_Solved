import java.util.*
import kotlin.math.pow

fun decimalToBinary(deciNum:Int)
{
    var n = deciNum
    var remainder = 0
    print("The binary of $deciNum is  ")
    while(n!=0)
    {
        n=n/2
        remainder = n%2
        print(remainder)
    }

}

fun binaryToDecimal(binaryNum:Long)
{
    var n = binaryNum
    var quotient = 0
    var remainder = 0
    var sum = 0
    var count = 0
    while(n.toInt()!=0)
    {

        quotient = (n / 10).toInt()
        remainder = (n%10).toInt()
        n = quotient.toLong()
        sum= (sum + remainder*(2.toDouble().pow(count))).toInt()
        count++
    }
    println("The Decimal of $binaryNum is $sum")
}


fun main()
{
    val scanner  = Scanner(System.`in`)
    println("Which you want? \n 1.Decimal to Binary 2.Binary to decimal. \n  Enter 1 or 2")
    val option = scanner.nextInt()
    when(option)
    {
        1-> {
            println("Give the decimal number please")
            val deciNum = scanner.nextInt()
            decimalToBinary(deciNum)
        }
        2-> {
            println("Give the binary number please")
            val binaryNum = scanner.nextLong()
            binaryToDecimal(binaryNum)
        }
    }

}


