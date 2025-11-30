package org.example.ru.kotiki.lessons.lesson23.homeworks

class SredneeArifm {
//    Создай функцию, которая принимает список чисел и возвращает среднее арифметическое всех чётных чисел этого списка. С помощью require проверь, что список не пустой.

    fun returnaverage(a: List<Int>): Double {
        require(a.isNotEmpty())
        var sum = 0
        var count = 0
        for (i in a) {
            if (i % 2 == 0) {
                sum += i
                count += 1
            }
        }
        return if (count > 0) {
            sum.toDouble() / count
        } else {
            0.0
        }
    }

    //Создай аналогичную анонимную функцию.

    val returnaverage = fun(a: List<Int>): Double {
        require(a.isNotEmpty())
        var sum = 0
        var count = 0
        for (i in a) {
            if (i % 2 == 0) {
                sum += i
                count += 1
            }
        }
        return if (count > 0) {
            sum.toDouble() / count
        } else {
            0.0
        }
    }

    //Создай аналогичное лямбда выражение с указанием типа.

    val returnaverage2: (List<Int>) -> Double = { a ->
        require(a.isNotEmpty())
        var sum = 0
        var count = 0
        for (i in a) {
            if (i % 2 == 0) {
                sum += i
                count += 1
            }
        }
        if (count > 0) {
            sum.toDouble() / count
        } else {
            0.0
        }
    }

    //Создай лямбда выражение без указания типа.

    val returnaverage3 = { a: List<Int> ->
        require(a.isNotEmpty())
        var sum = 0
        var count = 0
        for (i in a) {
            if (i % 2 == 0) {
                sum += i
                count += 1
            }
        }
        if (count > 0) {
            sum.toDouble() / count
        } else {
            0.0
        }
    }

    //Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

    fun main() {
        println("Среднее в 1, 2, 3, 4, 5: ${returnaverage3(listOf(1, 2, 3, 4, 5))}")
        println("Среднее в 2, 4, 6, 8: ${returnaverage3(listOf(2, 4, 6, 8))}")
        println("Среднее в 1, 3, 5: ${returnaverage3(listOf(1, 3, 5))}")
        println("Среднее в 10: ${returnaverage2(listOf(10))}")
        println("Среднее в пусто: ${returnaverage2(listOf())}")
    }
}