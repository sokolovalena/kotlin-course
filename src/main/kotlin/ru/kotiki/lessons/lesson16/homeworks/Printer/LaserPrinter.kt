package org.example.ru.kotiki.lessons.lesson16.homeworks.Printer

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            println("${Colors.BLACK}${Background.WHITE}$word${Colors.RESET}")
        }
    }
}