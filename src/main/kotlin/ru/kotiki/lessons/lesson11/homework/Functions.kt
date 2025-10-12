//package org.example.ru.kotiki.lessons.lesson11.homework
//
//Задачи на сигнатуру метода
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
//

//Не принимает аргументов и не возвращает значения.
fun one() { }

//Принимает два целых числа и возвращает их сумму.
fun two(one: Int, two: Int): Int {
    return one + two
}

//Принимает строку и ничего не возвращает.
fun three(one: String) {}

//Принимает список целых чисел и возвращает среднее значение типа Double.
fun four(one: List<Int>): Double {
    var sum = one.sum()
    return sum.toDouble() / one.size
}

//Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun five(one: String?): Int? {
    return one?.length
}

//Не принимает аргументов и возвращает nullable вещественное число.
fun six(): Double? {
    val num = 3.14
    return num
}

//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun seven(one: List<Int>?) { }

//Принимает целое число и возвращает nullable строку.
fun eight(one: Int): String? {
    var s = "s"
    return s
}

//Не принимает аргументов и возвращает список nullable строк.
fun nine(): List<String?> {
    var s = "s"
    return listOf(s)
}

//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun ten(one: String?, two: Int?): Boolean? {
    return one?.length == two
}

//Задачи на написание кода
//Напишите валидную сигнатуру метода а так же рабочий код для задач.
//
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(one: Int): Int {
    return one * 2
}

//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(one: Int): Boolean {
    return one % 2 == 0
}

//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }

    for (i in 1..n) {
        println(i)
    }
}

//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(n: List<Int>): Int? {
    for (i in n) {
        if (i < 0) {
            return i
        }
    }
    return null
}

//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку. Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(s: List<String?>) {
    for (str in s) {
        if (str == null) {
            return
        }
        println(str)
    }
}
