package org.example.ru.kotiki.lessons.lesson18.homeworks

class HolodilnikNonAbs : Temperature(), Interfaces.Cleanable, Interfaces.Movable {
    override val maxTemperature: Int = 10

    override fun clean() {
        if (checkPower()) {
            println("Холодильник очищен")
        }
    }

    override fun move(direction: String, distance: Int) {
        if (checkPower()) {
            println("Холодильник перемещён")
        }
    }
}

