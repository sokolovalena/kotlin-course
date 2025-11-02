package org.example.ru.kotiki.lessons.lesson16.homeworks

object Colors {
    const val RESET = "\u001B[0m"
    const val YELLOW = "\u001B[33m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RED = "\u001B[41m"
}

enum class LogLevel(val prefix: String) {
    INFO("INFO"),
    WARNING("WARNING"),
    ERROR("ERROR"),
    DEBUG("DEBUG")
}

class Logger {

    private fun printColored(message: String, level: LogLevel) {
        when (level) {
            LogLevel.INFO -> println("${Colors.WHITE}${message}${Colors.RESET}")
            LogLevel.DEBUG -> println("${Colors.CYAN}${message}${Colors.RESET}")
            LogLevel.WARNING -> println("${Colors.YELLOW}${message}${Colors.RESET}")
            LogLevel.ERROR -> println("${Colors.WHITE}${Background.RED}$message${Colors.RESET}")
        }
    }

    fun log(message: String) {
        printColored("[${LogLevel.INFO.prefix}] $message", LogLevel.INFO)
    }

    fun log(level: LogLevel, message: String) {
        when (level) {
            LogLevel.INFO -> printColored("[${LogLevel.INFO.prefix}] $message", LogLevel.INFO)
            LogLevel.DEBUG -> printColored("[${LogLevel.DEBUG.prefix}] $message", LogLevel.DEBUG)
            LogLevel.WARNING -> printColored("[${LogLevel.WARNING.prefix}] $message", LogLevel.WARNING)
            LogLevel.ERROR -> printColored("[${LogLevel.ERROR.prefix}] $message", LogLevel.ERROR)
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(LogLevel.INFO, message)
        }
    }

    fun log(exception: Exception) {
        log(LogLevel.ERROR, "эксепшен: ${exception.message ?: "ошибка"}")
    }
}

fun main() {
    val logger = Logger()

    logger.log("Просто текст без уровня")

    logger.log(LogLevel.INFO, "Серый текст")
    logger.log(LogLevel.DEBUG, "Голубой текст")
    logger.log(LogLevel.WARNING, "Желтый текст")
    logger.log(LogLevel.ERROR, "Красный текст-ошибка")

    val info = listOf(
        "Какие-то",
        "еще",
        "сообщения"
    )
    logger.log(info)

    try {
        val res = 10 / 0
    } catch (e: ArithmeticException) {
        logger.log(e)
    }

    try {
        throw NullPointerException("Ошибка деления на ноль")
    } catch (e: NullPointerException) {
        logger.log(e)
    }

    try {
        throw IllegalArgumentException()
    } catch (e: IllegalArgumentException) {
        logger.log(e)
    }
    println("=Конец=")
}