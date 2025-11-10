package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Programmable : Power(), Interfaces.Programmable {
    override fun programAction(action: String) {
        if (checkPower()) {
            println("запрограммирован на : $action")
        }
    }

    override fun execute() {
        if (checkPower()) {
            println("выполняет действие")
        }
    }
}