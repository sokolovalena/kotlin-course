package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Watches : Interfaces.Powerable, Interfaces.Timable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun setTimer(time: Int) {}
}
