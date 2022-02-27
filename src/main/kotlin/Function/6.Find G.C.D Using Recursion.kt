import java.util.*
fun gcdRecursive(n1 :Int, n2: Int):Int{
    if(n2==0)
        return n1;
    return  gcdRecursive(n2,n1%n2)
}


fun main()
{
    println("Give the number please")
    val scanner  = Scanner(System.`in`)
    val n1 = scanner.nextInt()
    val n2 = scanner.nextInt()
    println(gcdRecursive(n1,n2))

}