package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Robot : Interfaces.Powerable, Interfaces.Movable, Interfaces.Cleanable, Interfaces.AutomaticShutdown {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun move(direction: String, distance: Int) {}
    override fun clean() {}
    override fun startMonitoring() {}
}
