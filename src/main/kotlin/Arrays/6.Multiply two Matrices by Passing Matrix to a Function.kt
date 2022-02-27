package Arrays.Arrays
import java.util.*

fun matrixmultiply(firstmat : Array<IntArray>, secondmat : Array<IntArray>, r1:Int,c1:Int,r2:Int,c2: Int)
: Array<IntArray>{
    var matrixmul = Array(2) { IntArray(2) }
    for (i in 0..r1 - 1) {
        for (k in 0..r1 - 1) {
            for (j in 0..c1 - 1) {
                matrixmul[i][k] += firstmat[i][j] * secondmat[j][k]
            }

        }
    }
    return matrixmul
}

fun displayProduct(product :Array<IntArray>)
{
    println("Multiplication of two matrix ")
    for (i in product.indices) {
        for (j in product[i].indices) {
            print("${product[i][j]} ")

        }
        println()
    }
}


fun main() {
    var matrix1 = Array(2) { IntArray(3) }
    var matrix2 = Array(3) { IntArray(2) }
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

    displayProduct(matrixmultiply(matrix1,matrix2,row1,column1,row2,column2))



}