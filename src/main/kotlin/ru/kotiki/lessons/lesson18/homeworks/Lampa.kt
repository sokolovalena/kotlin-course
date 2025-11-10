package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Lampa : Interfaces.Powerable, Interfaces.LightEmitting, Interfaces.Programmable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun emitLight() {}
    override fun completeLiteEmission() {}
    override fun programAction(action: String) {}
    override fun execute() {}
}
