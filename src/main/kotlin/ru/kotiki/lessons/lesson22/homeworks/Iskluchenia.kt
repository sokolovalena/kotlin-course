package org.example.ru.kotiki.lessons.lesson22.homeworks

class Iskluchenia {
//   8. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:

    //NullPointerException
    fun exNull(el: Int?): Int {
        var res = el!! + 1
        return res
    }

    //IndexOutOfBoundsException
    fun exIndex(): Int {
        val res: Array<Int> = arrayOf(1, 2, 3)
        return res[4]
    }

    //ClassCastException
    fun exClass() {
        val obj: Any = "str"
        val num: Int = obj as Int
    }

    //IllegalArgumentException
    fun exIllegal(el: Int) {
        require(el in 0..100) { "от 0 до 100" }
    }

    //NumberFormatException
    fun exNumber(): Int {
        val res = "abc"
        return res.toInt()
    }

    //IllegalStateException
    fun exIllegalState(el: Boolean) {
        check(el) { "IllegalStateException" }
    }

    //OutOfMemoryError
    fun exOutMemory(): Int {
        var res = 0
        while (true) {
            res += 1
        }
        return res
    }

    //StackOverflowError
    fun exStack() {
        exStack()
    }

//Задание 9. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа
// ошибки свой catch блок

    fun main() {
        try {
            exNull(null)
        } catch (e: ExNullException) {
            println("Ошибка: ${e.message}")
        }

        try {
            exIndex()
        } catch (e: ExIndexException) {
            println("Ошибка: ${e.message}")
        }

        try {
            exClass()
        } catch (e: ExClassException) {
            println("Ошибка: ${e.message}")
        }

        try {
            exIllegal(150)
        } catch (e: ExIllegalException) {
            println("Ошибка: ${e.message}")
        }

        try {
            exNumber()
        } catch (e: ExNumberException) {
            println("Ошибка: ${e.message}")
        }

        try {
            exIllegalState(false)
        } catch (e: ExIllegalStateException) {
            println("Ошибка: ${e.message}")
        }

        try {
            exOutMemory()
        } catch (e: ExOutMemoryException) {
            println("Ошибка: ${e.message}")
        }

        try {
            exStack()
        } catch (e: ExStackException) {
            println("Ошибка: ${e.message}")
        }
    }

//    Задание 10. Напиши функцию, которая принимает nullable аргумент типа Any и в блоке try/catch
//    выполни набор действий с этим аргументом которые могут потенциально вызвать одно из исключений
//    в этом же порядке:

    fun fun1(el: Any?) {
        try {
            // 1. NullPointerException
            val non = el!!
            println("не null")

            // 2. IndexOutOfBoundsException
            if (non is List<*>) {
                non[100]
            }
            println("не IndexOutOfBoundsException")

            // 3. ClassCastException
            val str = non as String
            println("не ClassCastException")

            // 4. IllegalArgumentException
            require(str.isNotBlank()) { "" }
            println("Строка не пустаz")

            // 5. NumberFormatException
            val num = str.toInt()
            println("строка в число")

            // 6. IllegalStateException
            check(num % 2 == 0) { "" }
            println("четное")

            println("Переданный аргумент фантастически хорош!")

        } catch (e: Throwable) {
            when (e) {
                is NullPointerException -> println("NullPointerException")
                is IndexOutOfBoundsException -> println("IndexOutOfBoundsException")
                is ClassCastException -> println("ClassCastException")
                is IllegalArgumentException -> println("IllegalArgumentException")
                is NumberFormatException -> println("NumberFormatException")
                is IllegalStateException -> println("IllegalStateException")
                else -> println("исключение еще какое-то")
            }
            println("Сообщение ${e.message}\n")
            throw e
        }


//    Задание 11. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и
//    принимающий текст. Выброси это исключение в main
        val some = false
        if (!some) {
            throw ExAssertionException("some должен быть true")
        }
    }

//    Задание 12. Создай свой тип исключения в отдельном файле, наследуемый от RuntimeException и
//    принимающий IndexOutOfBoundsException тип в качестве аргумента. Напиши код, который спровоцирует
//    выброс IndexOutOfBoundsException, перехвати его с помощью try-catch и в блоке catch выведи
//    сообщение в консоль и сделай выброс своего типа исключения.
    // -- уже сделано выше
}
