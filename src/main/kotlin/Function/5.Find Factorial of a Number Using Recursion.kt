import java.util.*
fun factorialRecursive(nn :Int):Int{
    if(nn==0)
        return 1;
    return nn * factorialRecursive(nn-1)
}


fun main()
{
    println("Give the number please")
    val scanner  = Scanner(System.`in`)
    val nn = scanner.nextInt()
    println(factorialRecursive(nn))

}
