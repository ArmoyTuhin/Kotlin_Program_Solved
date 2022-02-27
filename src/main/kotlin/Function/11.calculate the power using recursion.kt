import java.util.*
fun powerRecursive(num:Int, power: Int):Int{
    if(power==0)
        return 1;
    return num * powerRecursive(num , power-1)
}


fun main()
{
    println("Give the numbers ")
    val scanner  = Scanner(System.`in`)
    val num = scanner.nextInt()
    val power = scanner.nextInt()
    println(powerRecursive(num,power))

}