package org.example.ru.kotiki.lessons.lesson14.homeworks

class Party(var location: String, var attendees: Int) {
    fun details() {
        println("Вечеринка в $location и гостей в ней $attendees")
    }
}