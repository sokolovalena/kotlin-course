package org.example.ru.kotiki.lessons.lesson16.homeworks.Printer

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

fun printWithColor(text: String, textColor: String, backgroundColor: String) {
    println("$textColor$backgroundColor$text$backgroundColor$textColor$Colors.RESET")
}


abstract class Printer {
    abstract fun print(text: String)
}

fun main() {
val laserPrinter = LaserPrinter()
val strPrinter = StrPrinter()

val corText = "Короткий текст"
val dlinText = "Это был очень и очень и очень и очень и очень и очень и очень и очень и очень и очень и очень и очень и очень и очень длинный текст"

laserPrinter.print(corText)
strPrinter.print(corText)
strPrinter.print(dlinText)
}
