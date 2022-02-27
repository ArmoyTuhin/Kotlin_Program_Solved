package Arrays

import java.util.*
import kotlin.math.pow


fun main()
{

    val scanner = Scanner(System.`in`)
    println("Enter the array size")
    val arraySize = scanner.nextInt()
    val inputArray = IntArray(arraySize) { i -> 0 }
    println("enter the array element")
    var i : Int = 0
    var largeelement= -1
    var userInput = 0

    while(i<arraySize)
    {
        userInput = scanner.nextInt()
        inputArray[i]= userInput
        i++
    }


    println("The largest element of the array is ${largeelement}")
}