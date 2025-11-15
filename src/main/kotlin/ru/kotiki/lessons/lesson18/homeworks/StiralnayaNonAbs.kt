package org.example.ru.kotiki.lessons.lesson18.homeworks

import java.io.InputStream

class StiralnayaNonAbs : Temperature(), Interfaces.SoundEmitting {
    override val maxTemperature: Int = 10
    override fun setVolume(volume: Int) {
        if (checkPower()) {
            println("Стиральная машина установила громкость на $volume.")
        }
    }

    override fun mute() {
        if (checkPower()) {
            println("Стиральная машина отключена.")
        }
    }

    override fun playSound(stream: InputStream) {
        if (checkPower()) {
            println("Стиральная машина воспроизводит звук.")
        }
    }
}
