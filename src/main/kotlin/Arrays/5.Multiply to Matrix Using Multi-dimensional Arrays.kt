package Arrays.Arrays

import java.util.*

fun main() {
    var matrix1 = Array(2) { IntArray(3) }
    var matrix2 = Array(3) { IntArray(2) }
    var matrixmul = Array(2) { IntArray(2) }
    val scanner = Scanner(System.`in`)
    var row1 = 2
    var row2 = 3
    var column1 = 3
    var column2 = 2

    println("Enter 2 X 3 matrix ")

    //input first matrix
    for (i in 0..row1 - 1) {
        for (j in 0..column1 - 1) {
            matrix1[i][j] = scanner.nextInt()
        }
    }
    println("Enter 3 X 2 matrix ")
    //input second matrix
    for (i in 0..row2 - 1) {
        for (j in 0..column2 - 1) {
            matrix2[i][j] = scanner.nextInt()
        }
    }

    //multiplication of matrix
    for (i in 0..row1 - 1) {
        for (k in 0..row1 - 1) {
            for (j in 0..column1 - 1) {
                matrixmul[i][k] += matrix1[i][j] * matrix2[j][k]
            }

        }
    }
    println("Multiplication of two matrix ")
    //print the addition
    for (i in matrixmul.indices) {
        for (j in matrixmul[i].indices) {
            print("${matrixmul[i][j]} ")

        }
        println()
    }

}
