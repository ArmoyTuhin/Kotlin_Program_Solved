import java.util.*
import kotlin.math.sqrt

fun primenumCheck(candidateNum:Int): Boolean {
    for(i in 2..sqrt(candidateNum.toDouble()).toInt())
    {
        if (candidateNum%i==0) return false
    }
    return true
}


fun main()
{
    println("Give the number please")
    val scanner  = Scanner(System.`in`)
    val number = scanner.nextInt()
    for (i in 2..number/2)
    {
        if(primenumCheck(i))
        {
            if(primenumCheck(number-i))
            {
                println("$i + ${number-i} = $number")
            }
        }
    }

}

