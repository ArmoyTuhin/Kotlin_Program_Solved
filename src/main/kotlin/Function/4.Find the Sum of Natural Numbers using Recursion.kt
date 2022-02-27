import java.util.*
fun sumRecursive(nn :Int):Int{
    if(nn==0)
        return 0;
    return nn+ sumRecursive(nn-1)
}


fun main()
{
    println("Give the number please")
    val scanner  = Scanner(System.`in`)
    val nn = scanner.nextInt()
    println(sumRecursive(nn))

}