fun main() {
    while (true) {
        println("enter x string: ")
        var x: String = readlnOrNull() ?: break
        println("enter y string: ")
        var y: String = readlnOrNull() ?: break
        x = x.filter { it.isDigit() }
        y = y.filter { it.isDigit() }

        val resultX = if (x.isNotEmpty()) x.toDouble() else 0.0
        val resultY = if (y.isNotEmpty()) y.toDouble() else 0.0

        val z = resultX / resultY
        println("$resultX divided by $resultY is: $z")

        println("do you wish to execute the program again? <Y/N>")
        val answer = readlnOrNull()?.uppercase() ?: break
        if (answer != "Y") break
    }
}