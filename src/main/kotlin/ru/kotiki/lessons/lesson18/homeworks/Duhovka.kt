package org.example.ru.kotiki.lessons.lesson18.homeworks

class Duhovka : Temperature() {
    override val maxTemperature: Int = 250
    fun bake() {
        if (checkPower()) {
            println("Духовка печет")
        }
    }
}