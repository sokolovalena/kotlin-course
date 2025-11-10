package org.example.ru.kotiki.lessons.lesson18.homeworks

class Chainik : Temperature() {
    override val maxTemperature: Int = 50
    fun boilWater() {
        if (checkPower()) {
            println("Чайник кипятит")
        }
    }
}
