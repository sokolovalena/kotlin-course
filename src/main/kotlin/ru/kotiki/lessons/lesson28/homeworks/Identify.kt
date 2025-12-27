package org.example.ru.kotiki.lessons.lesson28.homeworks

import java.time.LocalDate

//Создайте функцию identifyGeneration, которая расширяет класс
// LocalDate и печатает строку, определяющую, к какому поколению принадлежит
// человек родившийся в эту дату:
// "Бумер" для тех, кто родился с 1946 по 1964 год включительно,
// и "Зумер" для тех, кто родился с 1997 по 2012 год включительно.
// Если дата рождения не попадает ни в один из этих диапазонов,
// функция должна печатать "Не определено".
// Для сравнения дат используй методы isAfter(otherDate)
// и isBefore(otherDate) или проверку вхождения в диапазон.
// Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

class Identify {
    private val boomstart = LocalDate.of(1946, 1, 1)
    private val boomend = LocalDate.of(1964, 12, 31)

    private val zoomstart = LocalDate.of(1997, 1, 1)
    private val zoomend = LocalDate.of(2012, 12, 31)

    fun LocalDate.identifyGeneration() {
        when {
            (this.isAfter(boomstart.minusDays(1))) -> {
                println("Бумер")
            }
            (this.isAfter(zoomstart.minusDays(1)))-> {
                println("Зумер")
            }
            else -> {
                println("Не определено")
            }
        }
    }
}
