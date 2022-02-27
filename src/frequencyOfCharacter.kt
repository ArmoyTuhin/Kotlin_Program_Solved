import java.util.*
fun main()
{
    println("Give the string pls ")
    val scanner  = Scanner(System.`in`)
    val str = scanner.nextLine().replace(" ", "")
    var frequency = 0

    var mySet = mutableSetOf<Char>()
    for (i in 0..str.length-1 )
    {
        mySet.add(str[i])
    }

    for(element in mySet)
    {
        for (j in 0..str.length-1 )
        {

            if(str[j]==element)
            {
                frequency++
            }
        }
        println("Frequency of ${element} is $frequency ")
        frequency = 0
    }

}
