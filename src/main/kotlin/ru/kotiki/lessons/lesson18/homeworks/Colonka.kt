package org.example.ru.kotiki.lessons.lesson18.homeworks

import java.io.InputStream

abstract class Colonka : Interfaces.Powerable, Interfaces.SoundEmitting, Interfaces.Programmable {
    override fun powerOn() {}
    override fun powerOff() {}
    override fun setVolume(volume: Int) {}
    override fun mute() {}
    override fun playSound(stream: InputStream) {}
    override fun programAction(action: String) {}
    override fun execute() {}
}