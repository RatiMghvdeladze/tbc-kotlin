import kotlin.math.absoluteValue

class MathOperations {
    //task1
    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a.absoluteValue else gcd(b, a % b)
    }

//    lcm and gcd both of them must be a positive


    //task2
    fun lcm(a: Int, b: Int): Int {
        return if(a == 0 || b == 0) 0 else (a * b).absoluteValue / gcd(a, b)
    }

//    wikipedia says that lcm(0,0) = 0

    //task3
    fun contains(str: String): Boolean {
        return "$" in str
    }

    //task4
    fun sumEven(n: Int): Int {
            return if(n <= 0) 0 else if (n%2==0) (n+sumEven(n-2)) else sumEven(n-1)
    }
    /*
    rodesac n luwia chveulebrivad asrulebs am operacias -> (n+sumEven(n-2)), xolo tu kentia
    chveni mizania ro es condition davskipot amistvis else blockshi vutitebt -> sumEven(n-1),
    rom gadavides momdevno luw ricxvze
    100 -> (n+sumEven(n-2))
    99 -> daiskipa gadavida 98 ze
    98 -> (n+sumEven(n-2))
    ...
    ...
    ...
    ...
     */


    //task5
    fun reverse(n: Int): Int {
        return n.toString().reversed().toInt()
    }

    /*
    aq viyenebt stringis chashenebul extension funqcias, integers ar aqvs msgavsi funqcia amitom
    jer stringshi gadaviyvanet am funqciastan wvdoma rom gvqonoda da shemdeg davabrunet isev
    integershi, leading zeroebi avtomaturad chamoshordeboda
     */

    //task6
    fun isPlaindrome(str: String): Boolean {
        val cleanedString = str.filter{it.isLetterOrDigit()}.lowercase()
        return cleanedString == cleanedString.reversed()
    }
}

//testing
fun main(){
    val obj = MathOperations()

    println(obj.gcd(0,0)) //0
    println(obj.gcd(-10, -50)) //output: 10, it must be positive

    println(obj.lcm(0, 0)) //wikipedia says that lcm(0,0) = 0
    println(obj.lcm(20,500))

    println(obj.contains("$4sokfas"))
    println(obj.contains("4sokfas"))

    println(obj.sumEven(101))
    println(obj.reverse(10220))

    println(obj.isPlaindrome("A man, a plan, a canal, Panama"))
    println(obj.isPlaindrome("ook"))

}