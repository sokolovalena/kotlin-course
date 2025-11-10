package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Coffee : Interfaces.Powerable, Interfaces.WaterContainer, Interfaces.TemperatureRegulatable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun fillWater(amount: Int) {}
    override fun getWater(amount: Int) {}
    override fun setTemperature(temp: Int) {}
}
