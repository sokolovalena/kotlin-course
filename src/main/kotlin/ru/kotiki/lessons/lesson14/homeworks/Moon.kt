package org.example.ru.kotiki.lessons.lesson14.homeworks

object Moon {
    val isVisible: Boolean = true
    val phase: String = ""

    fun showPhase() {
        if (isVisible) {
            println("Луна видна")
        } else {
            println("Луна не видна")
        }
        println("Текущая фаза луны: $phase")
    }
}