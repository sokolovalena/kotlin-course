package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class Power : Interfaces.Powerable {
    private var isPoweredOn = false

    override fun powerOn() {
        isPoweredOn = true
        println("включено")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("выключено")
    }

    protected fun checkPower(): Boolean {
        if (!isPoweredOn) {
            println("Невозможно тк выключен")
        }
        return isPoweredOn
    }
}