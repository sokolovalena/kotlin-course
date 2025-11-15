package org.example.ru.kotiki.lessons.lesson18.homeworks

abstract class MechWatches : Interfaces.Mechanical, Interfaces.Timable {
    override fun performMechanicalAction() {}
    override fun setTimer(time: Int) {}
}
