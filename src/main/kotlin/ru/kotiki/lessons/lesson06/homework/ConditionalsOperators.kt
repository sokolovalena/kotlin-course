package org.example.ru.kotiki.lessons.lesson06.homework

class ConditionalsOperators {

    // Задание 1: "Определение сезона"
    fun seasons(numMonth: Int) {
        when (numMonth) {
            in 1..2, 12 -> println("Зима")
            in 3..5 -> println("Весна")
            in 6..8 -> println("Лето")
            in 9..11 -> println("Осень")
            else -> println("Некорректный месяц")
        }
    }

    // Задание 2: "Расчет возраста питомца"
    fun dog(years: Int) {
        val underTwo = 10.5
        var afterTwo = 4

        when (years) {
            in Int.MIN_VALUE .. -1 -> println("Некорректный возраст: $years")
            0 -> println(years * underTwo)
            in 1..2 -> println(years * underTwo)
            else -> println(2 * underTwo + (years - 2) * afterTwo)
        }
    }

    // Задание 3: "Определение способа перемещения"
    fun moving(km: Int) {
        val p = "пешком"
        val v = "велосипед"
        val at = "автотранспорт"
        when (km) {
            in Int.MIN_VALUE .. -1 -> println("Некорректный аргумент: $km")
            in 0..1 -> println(p)
            in 2..5 -> println(v)
            else -> println(at)
        }
    }

    // Задание 4: "Расчет бонусных баллов"
    fun bonuses(count: Int) {
        when (count) {
            in Int.MIN_VALUE .. -1 -> println("Некорректный аргумент: $count")
            in 0..1000 -> println(count / 100 * 2)
            else -> println(count / 100 * 3)
        }
    }

    // Задание 5: "Определение типа документа"
    fun doc(type: String) {
        val table = "Таблица"
        val pic = "Изображение"
        val unknown = "Неизвестный тип"
        val text = "Текстовый документ"
        when (type) {
            "csv", "xls" -> println(table)
            "txt", "doc" -> println(text)
            "jpeg" -> println(pic)
            else -> println(unknown)
        }
    }

    // Задание 6: "Конвертация температуры"
    // (°C × 9/5) + 32
    fun temo(value: Double, type: String) {
        if (type == "C") {
            val res = (value * 9/5) + 32
            println("$res$type")
        } else if (type == "F") {
            //(°F − 32) × 5/9
            val res = (value - 32) * 5/9
            print("$res$type")
        } else { println("Unknown type") }
    }

    // Задание 7: "Подбор одежды по погоде"
    fun clothes(temp: Int) {
        when (temp) {
            in Int.MIN_VALUE .. -35, in 35.. Int.MAX_VALUE -> println("Не выходите из дома, там $temp")
            in -34..10 -> println("куртка и шапка")
            in 11 .. 18 -> println("ветровка")
            in 19 .. 34 -> println("футболка и шорты")
        }
    }

    // Задание 8: "Выбор фильма по возрасту"
    fun cinema(age: Int) {
        when(age) {
            in 0 .. 9 -> println("детские")
            in 10 .. 17 -> println("подростковые")
            in 18 ..Int.MAX_VALUE -> println("без ограничений")
            else -> println("Некорректный возраст $age")
        }
    }


}