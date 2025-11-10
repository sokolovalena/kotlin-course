package org.example.ru.kotiki.lessons.lesson16.homeworks.Figures

class Square(val a: Double) : Shape() {
    override fun area(): Double {
        return a * a
    }

    fun displayArea() {
        printShapeInfo("Square", area())
    }
}
