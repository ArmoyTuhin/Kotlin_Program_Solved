import java.util.*


fun main()
{

    val scanner = Scanner(System.`in`)
    println("Enter the array size")
    val arraySize = scanner.nextInt()
    val inputArray = IntArray(arraySize) { i -> 0 }
    println("enter the array element")
    var i : Int = 0
    var sum = 0
    var userInput = 0
    while(i<arraySize)
    {
        userInput = scanner.nextInt()
        inputArray[i]= userInput
        sum += inputArray[i]
        i++
    }
    println("Average of the array ${sum/inputArray.size}")

}