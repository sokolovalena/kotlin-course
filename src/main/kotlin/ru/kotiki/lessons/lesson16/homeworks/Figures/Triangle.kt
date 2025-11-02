package org.example.ru.kotiki.lessons.lesson16.homeworks.Figures

import kotlin.math.sin

class Triangle(val a: Double, val b: Double, val c: Double) : Shape() {
    override fun area(): Double {
        val rad = Math.toRadians(c)
        return 0.5 * a * b * sin(rad)
    }

    fun displayArea() {
        printShapeInfo("Triangle", area())
    }
}
