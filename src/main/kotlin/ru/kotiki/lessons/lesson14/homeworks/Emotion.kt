package org.example.ru.kotiki.lessons.lesson14.homeworks

class Emotion(var type: String, var intensity: Int) {
    fun express() {
        println("Эмоция типа $type и интенсивности $intensity")
    }
}