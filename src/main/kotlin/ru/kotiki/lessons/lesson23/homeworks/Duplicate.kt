package org.example.ru.kotiki.lessons.lesson23.homeworks

class Duplicate {
//    Создай функцию-расширение списка чисел, которая будет возвращать множество дубликатов чисел (встречающихся в списке более одного раза).


    fun List<Int>.duplicates(): Set<Int> {
        val see = mutableSetOf<Int>()
        val dupl = mutableSetOf<Int>()

        for (number in this) {
            if (see.contains(number)) {
                dupl.add(number)
            } else {
                see.add(number)
            }
        }
        return dupl
    }

//Создай аналогичную анонимную функцию.

    val dupli: List<Int>.() -> Set<Int> = fun List<Int>.(): Set<Int> {
        val see = mutableSetOf<Int>()
        val dupl = mutableSetOf<Int>()

        for (number in this) {
            if (see.contains(number)) {
                dupl.add(number)
            } else {
                see.add(number)
            }
        }
        return dupl
    }

//Создай аналогичное лямбда выражение с указанием типа.
    //  OrderProcessor.(Int) -> String = {

    val dupli2: List<Int>.() -> Set<Int> = {
        val see = mutableSetOf<Int>()
        val dupl = mutableSetOf<Int>()

        for (number in this) {
            if (see.contains(number)) {
                dupl.add(number)
            } else {
                see.add(number)
            }
        }
        dupl
    }


//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.

    fun main() {
        val dupl = listOf(1, 2, 3, 2, 4, 1, 2, 3).dupli2()
        println("Дубликаты: $dupl")
        val no = listOf(5, 6, 0).dupli2()
        println("Дубликаты: $no")
        val empty = emptyList<Int>().dupli()
        println("Дубликаты: $empty")
    }
}