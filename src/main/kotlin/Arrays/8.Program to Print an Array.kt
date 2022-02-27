import java.util.*

fun display1(inputarray: IntArray)
{
    for (i in inputarray) {
        print("$i ")
    }

}


fun main()
{

    val scanner = Scanner(System.`in`)
    println("Enter the array size")
    val arraySize = scanner.nextInt()
    val inputArray = IntArray(arraySize)
    println("enter the array element")
    var i : Int = 0
    var userInput = 0

    while(i<arraySize)
    {
        userInput = scanner.nextInt()
        inputArray[i]= userInput
        i++
    }

    display1(inputArray)

}