package org.example.ru.kotiki.lessons.lesson16.homeworks.Figures

open class Shape {
    open fun area(): Double {
        return 0.0
    }

    fun printShapeInfo(shapeName: String, area: Double) {
        println("$shapeName Area: $area")
    }
}

fun main() {
    val shapes = listOf<Shape>(
        Circle(5.0),
        Square(4.0),
        Triangle(6.0, 8.0, 30.0),
        Circle(2.5),
        Square(10.0),
        Triangle(5.0, 12.0, 90.0)
    )

    for (shape in shapes) {
        when (shape) {
            is Circle -> shape.displayArea()
            is Square -> shape.displayArea()
            is Triangle -> shape.displayArea()
        }
    }
}
