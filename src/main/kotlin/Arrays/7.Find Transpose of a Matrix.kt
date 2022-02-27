package Arrays.Arrays

import java.util.*

fun transposematrix(inputmatrix: Array<IntArray>,r:Int,c:Int):
Array<IntArray>
{
    var trasnsposeMatrix = Array(3) { IntArray(2) }
    for (i in 0..r - 1) {
        for (j in 0..c - 1) {
            trasnsposeMatrix[j][i] = inputmatrix[i][j]
        }
    }
    return trasnsposeMatrix
}


fun display(inputmatrix: Array<IntArray>)
{
    for (i in inputmatrix.indices) {
        for (j in inputmatrix[i].indices)
        {
            print("${inputmatrix[i][j]} ")
        }
        println()
    }

}


fun main() {
    var row = 2
    var column = 3
    var matrix = Array(2) { IntArray(3) }
    var trasnsposeMatrix = Array(3) { IntArray(2) }
    val scanner = Scanner(System.`in`)

    //taking input
    for (i in matrix.indices) {
        for (j in matrix[i].indices)
        {
            matrix[i][j] = scanner.nextInt()
        }
    }
    display(transposematrix(matrix,row,column))



}
