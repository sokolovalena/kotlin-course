package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Fonarik : Interfaces.Powerable, Interfaces.LightEmitting, Interfaces.Rechargeable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun emitLight() {}
    override fun completeLiteEmission() {}
    override fun getChargeLevel(): Double = 0.0
    override fun recharge() {}
}
