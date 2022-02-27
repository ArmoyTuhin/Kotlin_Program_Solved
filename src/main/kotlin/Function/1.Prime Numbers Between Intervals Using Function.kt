import java.util.*
import kotlin.math.sqrt

fun primeCheck(candidateNum:Int): Boolean {
    for(i in 2..sqrt(candidateNum.toDouble()).toInt())
    {
        if (candidateNum%i==0) return false
    }
    return true
}


fun main()
{
    println("Give the Interval limit please")
    val scanner  = Scanner(System.`in`)
    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    for (i in number1..number2)
    {
        if(i!=1 && primeCheck(i))
            println(i)
    }

}

