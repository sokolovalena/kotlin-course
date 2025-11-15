package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Holodilnik : Interfaces.Powerable, Interfaces.WaterContainer, Interfaces.TemperatureRegulatable,
    Interfaces.AutomaticShutdown {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun fillWater(amount: Int) {}
    override fun getWater(amount: Int) {}
    override fun setTemperature(temp: Int) {}
    override fun startMonitoring() {}
}



