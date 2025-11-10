package org.example.ru.kotiki.lessons.lesson16.homeworks.Printer

class StrPrinter : Printer() {
    private val colors = listOf(
        Pair(Colors.RED, Background.YELLOW),
        Pair(Colors.YELLOW, Background.RED),
        Pair(Colors.GREEN, Background.BLUE),
        Pair(Colors.BLUE, Background.GREEN),
        Pair(Colors.PURPLE, Background.CYAN),
        Pair(Colors.CYAN, Background.PURPLE)
    )
    private var colorIndex = 0

    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
                val (textColor, backgroundColor) = colors[colorIndex % colors.size]
                println("$textColor$backgroundColor$word${Colors.RESET}")
                colorIndex++
        }
    }
}
