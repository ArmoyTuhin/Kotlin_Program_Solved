package Arrays.Arrays

import java.util.*

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
        inputArray[i] = scanner.nextInt()
        i++
    }

    println("Enter the second array size")
    val arraySize2 = scanner.nextInt()
    val inputArray2 = IntArray(arraySize2)
    println("enter the array element")
    var j =0
    var userInput2 = 0
    while(j<arraySize2)
    {

        inputArray2[j]= scanner.nextInt()
        j++
    }

    val concat = intArrayOf(*inputArray, *inputArray2)
    println(concat.contentToString())

}