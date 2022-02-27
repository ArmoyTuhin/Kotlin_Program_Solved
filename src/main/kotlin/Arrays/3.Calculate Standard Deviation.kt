package Arrays

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt


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
    var sumofarray = 0
    var xbar  = 0.0
    while(i<arraySize)
    {
        userInput = scanner.nextInt()
        inputArray[i]= userInput
        sumofarray+=inputArray[i]
        i++
    }
    var average = sumofarray/arraySize
    for(items in inputArray)
    {
        xbar += (average - items).toDouble().pow(2)

    }

    println("The Standard Deviation is ${sqrt(xbar/arraySize)}")
}