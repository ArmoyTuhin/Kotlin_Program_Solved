package Arrays

import java.util.*

fun main() {
    var matrix1 = Array(2) { IntArray(3) }
    var matrix2 = Array(2) { IntArray(3) }
    var matrixSum = Array(2) { IntArray(3) }
    val scanner = Scanner(System.`in`)

    println("Enter 2 X 3 matrix ")

    //input first matrix
    for (i in matrix1.indices) {
        for (j in matrix1[i].indices) {
            matrix1[i][j] = scanner.nextInt()
        }
    }
    println("Enter 2 X 3 matrix ")
    //input second matrix
    for (i in matrix2.indices) {
        for (j in matrix2[i].indices) {
            matrix2[i][j] = scanner.nextInt()
        }
    }

    //perform addition
    for (i in matrixSum.indices) {
        for (j in matrixSum[i].indices) {
            matrixSum[i][j] = matrix1[i][j] + matrix2[i][j]
        }
    }
    println("Adition of two matrix ")
    //print the addition
    for (i in matrixSum.indices) {
        for (j in matrixSum[i].indices) {
            print("${matrixSum[i][j]} ")

        }
        println()
    }

}
