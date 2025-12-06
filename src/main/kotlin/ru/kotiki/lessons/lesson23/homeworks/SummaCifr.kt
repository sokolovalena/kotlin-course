package org.example.ru.kotiki.lessons.lesson23.homeworks

class SummaCifr {
//    Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа. Сделай проверку, что входящее число больше нуля. Подсказка: для парсинга символа в число можно использовать функцию digitToInt()
fun sum(n: Long): Int {
    require(n > 0)
    var sum = 0
    val nums = n.toString()
    for (i in nums) {
        sum += i.digitToInt()
    }
    return sum
}

//Создай аналогичную анонимную функцию.
val sum = fun(n: Long): Int {
    require(n > 0)
    var sum = 0
    val nums = n.toString()
    for (i in nums) {
        sum += i.digitToInt()
    }
    return sum
}

//Создай аналогичное лямбда выражение с указанием типа.
val sum2: (Long) -> Int = { n ->
    require(n > 0)
    var sum = 0
    val nums = n.toString()
    for (i in nums) {
        sum += i.digitToInt()
    }
    sum
}

//Создай лямбда выражение без указания типа.

    val sum3 = { n: Long ->
        require(n > 0)
        var sum = 0
        val nums = n.toString()
        for (i in nums) {
            sum += i.digitToInt()
        }
        sum
    }

//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

    fun main() {
        println("Сумма цифр 749292: ${sum3(749292)}")
        println("Сумма цифр 890: ${sum3(890)}")
        println("Сумма цифр 8: ${sum3(8)}")
        println("Сумма цифр 0: ${sum3(0)}")
    }
}