package org.example.ru.kotiki.lessons.lesson27.homeworks

class Enums {

//    Задание 1
//Создай Enum со статусами прохождения теста (passed, broken, failed).

    enum class Statuses {
        PASSED,
        BROKEN,
        FAILED
    }
//
//Создай Enum с типами жилой недвижимости для сайта аренды, включая человекопонятные названия этих типов.

        enum class Types {
            ECONOM,
            COMFORT,
            PREMIUM,
            BUSINESS,
            ELITE
        }
//
//Создай Enum с планетами солнечной системы, включая расстояние до солнца в астрономических единицах и вес планеты.

    enum class Planety(val rasstoyanie: Int, val ves: Double) {
        MERKURIY(1, 1.0),
        VENERA(2, 2.0),
        ZEMLYA(3, 3.0),
        MARS(4, 4.0),
        YUPITER(5, 5.0),
        SATURN(6, 6.0),
        URAN(7, 7.0),
        NEPTUN(8, 8.0);
    }

//    Задание 2
//Создай функцию, которая выводит на печать человекочитаемые названия типов
// недвижимости в порядке возрастания длины названия enum.

    fun printTypes() {
        Types.values()
            .map { it.name }
            .sortedBy { it.length }
            .forEach { println(it) }
    }

//    Задание 3
//Создай функцию, которая принимает лямбду без аргументов и возвращаемого значения и возвращает
// Enum со статусом прохождения теста в зависимости от того как выполнится принятая лямбда:
//
//если без исключений - PASSED
//если будет AssertionError - FAILED
//прочие исключения  - BROKEN

    fun test(lambda: () -> Unit): Statuses {
        return try {
            lambda()
            Statuses.PASSED
        } catch (e: AssertionError) {
            Statuses.FAILED
        } catch (e: Exception) {
            Statuses.BROKEN
        }
    }

//    Задание 4
//Создай функцию, которая принимает лямбду и возвращает enum планеты.
// Лямбда должна принимать планету и возвращать булево значение.
// Лямбда здесь выступает в качестве фильтра, который должен отфильтровать список
// всех планет по какому-либо признаку (расстояние или вес).
// Вернуть нужно первый элемент из отфильтрованного списка или выкинуть исключение если список пустой.

    fun findPlanet(filter: (Planety) -> Boolean): Planety {
        val pl = Planety.values().filter(filter)
        return pl.firstOrNull() ?: throw Exception("список пустой.")
    }



}