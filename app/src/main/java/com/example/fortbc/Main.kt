//task1
fun gcd(a: Int, b: Int): Int{
    return if (b == 0) a else gcd(b, a % b)
}

//task2
fun lcm(a: Int, b: Int): Int {
    return (a*b) / gcd(a,b)
}

//task3
fun isInclude(str: String): Boolean{
    return "$" in str
}

//task4
fun sum100(): Int{
    fun helper(n: Int): Int{
        return if (n == 0) 0 else n + helper(n-1)
    }
    return helper(100)
}
/*
explanation:
i will provide the example of sum of 10, it should works the same way as sum of 100.

fun sum10(): Int{
    fun helper(n: Int): Int{
        return if (n == 0) 0 else n + helper(n-1)
    }
    return helper(10)
}

helper(10) is called, then checks if n==0  (false) then goes to else block, returns 10 + helper(9) ,
initial state so it must be added in stack -> [helper(10)]

helper(9) -> 9 + helper(8), stack[helper(10), helper(9)]
helper(8) -> 8 + helper(7), stack[helper(10), helper(9), helper(8)]
helper(7) -> 7 + helper(6), stack[helper(10), helper(9), helper(8), helper(7)]
helper(6) -> 6 + helper(5), .........
helper(5) -> 5 + helper(4), .........
helper(4) -> 4 + helper(3), .........
helper(3) -> 3 + helper(2), ...........
helper(2) -> 2 + helper(1), .................
helper(1) -> 1 + helper(0), stack[helper(10), helper(9), helper(8), helper(7), .......helper(1)]

helper(0) checks if n == 0 (true) so returns 0 (it is base case), and after reaching the base case,
the function starts returning values from stack.
helper(0) does not stay on the stack because
it does not call anything else, it directly returns 0 and pops off the stack.

so this must be started from the last element which was added in stack.
helper(1) -> 1 + 0 = 1,  "0" is from helper(0) which returns 0.
helper(2) -> 2 + 1 = 3,   "1" is from helper(1) which returns 1
helper(3) -> 3 + 3 = 6,   "3" is from helper(2) which returns 3
helper(4) -> 4 + 6 = 10,  "6" is from helper(3) which returns 6
helper(5) -> 10 + 5 = 15, .....
helper(6) -> 15 + 6 = 21, .....
helper(7) -> 21 + 7 = 28, .....
helper(8) -> 28 + 8 = 36, .....
helper(9) -> 36 + 9 = 45, .....
finally, helper(10) -> 45 + 10 = 55
 */

//task5
fun reverse(n: Int): Int {
    return n.toString().reversed().toInt()
}
/*
explanation:
first, we should convert int to string because of its built-in function -> reversed().
integer does not have this function, so we should convert it to string, and after reverse, convert the
reversed string to the integer, which automatically drops leading zero.
 */

//task6
fun isPlaindrome(str: String): Boolean{
    val cleanedString = str.replace("[^A-Za-z0-9]".toRegex(), "").lowercase()
    return cleanedString == cleanedString.reversed()
}

//testing
fun main(){
    println(gcd(-6,-8))
    println(gcd(20, 50))
    println(lcm(17, 18))
    println(lcm(20,500))
    println(isInclude("$4sokfas"))
    println(isInclude("4sokfas"))
    println(sum100())
    println(reverse(10220))
    println(isPlaindrome("A man, a plan, a canal, Panama"))
    println(isPlaindrome("ook"))
}