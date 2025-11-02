package org.example.ru.kotiki.lessons.lesson16.homeworks.Figures

import kotlin.math.PI

class Circle(val r: Double) : Shape() {
    override fun area(): Double {
        return PI * r * r
    }

    fun displayArea() {
        printShapeInfo("Circle", area())
    }
}
