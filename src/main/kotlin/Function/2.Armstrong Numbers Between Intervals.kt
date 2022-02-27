import java.util.*
import kotlin.math.pow

fun armstrongCheck(candidateNum:Int): Boolean {
    var sum: Int =0
    var temp = candidateNum
    var digit = 0
    var count =0
    var n=0
    while(temp!=0)
    {
        digit = temp%10
        temp = temp/10
        count++
    }
    temp = candidateNum
    while(temp!=0)
    {
        digit = temp%10
        n= digit.toDouble().pow(count).toInt()
        sum =sum + n
        temp = temp/10
    }
    return candidateNum == sum
}


fun main()
{
    println("Give the Interval limit please")
    val scanner  = Scanner(System.`in`)
    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    for (i in number1..number2)
    {
        if(armstrongCheck(i)) {
            println(i)
        }
    }

}

