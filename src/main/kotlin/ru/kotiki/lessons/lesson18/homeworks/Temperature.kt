package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Temperature : Programmable(), Interfaces.TemperatureRegulatable, Interfaces.Openable {
    private var temperature: Int = 0

    override fun setTemperature(temp: Int) {
        if (checkPower()) {
            temperature = temp
            println("установлена температура: $temperature")
        }
    }

    override fun open() {
        if (checkPower()) {
            println("открыто")
        }
    }

    override fun close() {
        if (checkPower()) {
            println("закрыто")
        }
    }
}