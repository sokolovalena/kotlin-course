package org.example.ru.kotiki.lessons.lesson21.homeworks

class Privedenie {
//Для строки: "Это строка: [значение]".
//Для любого числа: "Это число: [значение]".
//Для списка: "Это список, количество элементов: [количество]".
//Для словаря: "Это словарь, количество пар: [количество]".
//Для остальных типов: "Неизвестный тип данных".

    fun analyzeDataType(el: Any) {
        when (el) {
            is String -> println("Это строка: $el")
            is Int -> println("Это число: $el")
            is List<*> -> println("Это список, количество элементов: ${el.count()}")
            is Map<*, *> -> println("Это список, количество элементов: ${el.count()}")
            else -> println("Неизвестный тип данных")
        }
    }

//    Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка,
//    если аргумент можно безопасно привести к типу List.
//    В случае неудачного приведения функция должна возвращать -1.
//    Используйте as? для безопасного приведения типа.

    fun safeCastToList(el: Any): Int {
        if (el is List<*>) {
            return el.count()
        } else {
            return -1
        }
    }

//    Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any? и
//    возвращает длину строки, если аргумент можно привести к типу String.
//    В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.

    fun getStringLengthOrZero(el: Any?): Int {
        if (el is String) {
            return el.length
        } else {
            return 0
        }
    }

//    Создайте функцию-расширение класса Any toSquare.
//    Функция гарантированно вызывается у числа (в виде числа или строки, например 4 или 4.2 или “4.2”)
//    и должна вернуть квадрат этого числа. Если придёт число, его нужно возвести в квадрат,
//    если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.

    fun Any.toSquare(el: Any): Double {
        if (el is String) {
            return el.toDouble() * el.toDouble()
        } else if (el is Int) {
            return el.toDouble() * el.toDouble()
        }
        return 0.0
    }

//    Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает
//    сумму всех целочисленных (Int) и вещественных (Double) значений в списке. Все остальные типы должны
//    быть проигнорированы.

    fun sumIntOrDoubleValues(el: List<Any>): Double {
        var count = 0.0
        for (e in el) {
            if (e is Int) {
                count += e
            } else if (e is Double) {
                count += e
            }
        }
        return count
    }

//    Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести
//    его к типу List<*>. Если приведение успешно, функция должна напечатать все строки из списка,
//    если элемент не является строкой то вывести предупреждение об этом. Если приведение неудачно,
//    должно быть выведено сообщение об ошибке, не прерывая выполнение программы.

    fun tryCastToListAndPrint(el: Any) {
        if (el is List<*>) {
                for (i in el) {
                if (i is String) {
                    println("  Строка: $i")
                } else {
                    println("$i не строка")
                }
            }
        } else {
            println("Это не список")
        }
    }
}