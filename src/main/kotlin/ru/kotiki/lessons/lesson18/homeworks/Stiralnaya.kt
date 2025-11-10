package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Stiralnaya : Interfaces.Powerable, Interfaces.Openable, Interfaces.WaterContainer,
    Interfaces.TemperatureRegulatable, Interfaces.Timable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun open() {}
    override fun close() {}
    override fun fillWater(amount: Int) {}
    override fun getWater(amount: Int) {}
    override fun setTemperature(temp: Int) {}
    override fun setTimer(time: Int) {}
}
