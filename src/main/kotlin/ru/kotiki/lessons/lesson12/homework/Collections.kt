package org.example.ru.kotiki.lessons.lesson12.homework

//Задачи на приведение коллекции к значению
//Проверить, что размер коллекции больше 5 элементов.

fun collectionMoreFive(col: Collection<Any>): Boolean {
    return col.size > 5
}

//Проверить, что коллекция пустая
fun colIsEmpty(col: Collection<Any>): Boolean {
    return col.isEmpty()
}

//Проверить, что коллекция не пустая
fun isColNotEmpty(col: Collection<Any>): Boolean {
    return col.isNotEmpty()
}

//Взять элемент по индексу или создать значение если индекса не существует
fun colGet(col: List<String>, index: Int, default: String): String {
    return col.getOrElse(index) { default }
}

//Собрать коллекцию в строку
fun colToString(col: Collection<Any>): String {
    return col.joinToString(",")
}

//Посчитать сумму всех значений
fun colSum(col: Collection<Int>): Int {
    return col.sum()
}

//Посчитать среднее
fun colAverage(col: Collection<Int>): Double {
    return col.average()
}

//Взять максимальное число
fun colMax(col: Collection<Int>): Int? {
    return col.maxOrNull()
}

//Взять минимальное число
fun colMim(col: Collection<Int>): Int? {
    return col.minOrNull()
}

//Взять первое число или null
fun colFirst(col: Collection<Int>): Int? {
    return col.firstOrNull()
}

//Проверить что коллекция содержит элемент
fun colContains(col: Collection<Any>, el: String): Boolean {
    return col.contains(el)
}

//Задачи на обработку коллекций
//Отфильтровать коллекцию по диапазону 18-30
fun colFilter(nums: Collection<Int>): Collection<Int> {
    return nums.filter { it in 18..30 }
}

//Выбрать числа, которые не делятся на 2 и 3 одновременно
fun colFilterNot(nums: Collection<Int>): Collection<Int> {
    return nums.filterNot { it % 2 == 0 && it % 3 == 0}
}

//Очистить текстовую коллекцию от null элементов
fun colDelNull(col: Collection<String>): Collection<String> {
    return col.filterNotNull()
}

//Преобразовать текстовую коллекцию в коллекцию длин слов
fun colToSize(words: Collection<String>): Collection<Int> {
    val sizes = mutableListOf<Int>()
    words.forEach { word ->
        sizes.add(word.length)
    }
    return sizes
}

//Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
fun colToMap(words: Collection<String>): Map<String, Int> {
    return words.associate { word ->
        word.reversed() to word.length
    }
}

//Отсортировать список в алфавитном порядке
fun colSorted(col: Collection<String>): Collection<String> {
    return col.sorted()
}

//Взять первые 3 элемента списка
fun colTakeThree(col: Collection<String>): Collection<String> {
    return col.take(3)
}

//Распечатать квадраты элементов списка
fun colKvadr(col: Collection<Int>) {
    println(col.map { it * it})
}

//Группировать список по первой букве слов
fun colGroup(col: Collection<String>): Map<Char, List<String>> {
    return col.groupBy { it.first() }
}

//Очистить список от дублей
fun colDistinct(col: Collection<Any>): Collection<Any> {
    return col.distinct()
}

//Отсортировать список по убыванию
fun colSortedDesc(col: Collection<String>): Collection<String> {
    return col.sortedDescending()
}

//Взять последние 3 элемента списка
fun colLastThree(col: Collection<String>): Collection<String> {
    return col.toList().takeLast(3)
}


//Задача 24. Характеристика числовой коллекции
//Напиши функцию, которая принимает коллекцию чисел и возвращает строку с характеристикой коллекции используя конструкцию when
//
//Если коллекция пустая - “Пусто”
//Если количество элементов меньше пяти - “Короткая”
//Если коллекция начинается с 0 - “Стартовая”
//Если сумма всех чисел больше 10000 - “Массивная”
//Если среднее значение равно 10 - “Сбалансированная”
//Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
//Если максимальное число меньше -10 - “Отрицательная”
//Если минимальное число больше 1000 - “Положительная”
//Если содержит одновременно числа 3 и 14 - “Пи***тая”
//Иначе - “Уникальная”
//Вызвать метод с данными, подходящими под каждую из веток
fun twentyFour(col: Collection<Int>): String {
    return when {
        col.isEmpty() -> "Пусто"
        col.size < 5 -> "Короткая"
        col.first() == 0 -> "Стартовая"
        col.sum() > 10000 -> "Массивная"
        col.average() == 10.0 -> "Сбалансированная"
        col.toString().length > 20 -> "Клейкая"
        col.max() < -10 -> "Отрицательная"
        col.min() > 1000 -> "Положительная"
        col.contains(3) && col.contains(14) -> "Пиздатая"
        else -> "Уникальная"
    }
}

var pust = twentyFour(listOf())
var kor = twentyFour(listOf(1))
var start = twentyFour(listOf(0))
var mass = twentyFour(listOf(1000000))
var balance = twentyFour(listOf(10, 10))
var kleik = twentyFour(listOf(19881,3981,410819,7841,904819,48147194,8941391))
var mmmax = twentyFour(listOf(-20))
var mmmin = twentyFour(listOf(1400))
var pizd = twentyFour(listOf(3,14))
var unic = twentyFour(listOf(4, 5, 6, 9, 11, 14))

//Задача 25. Анализ учебных оценок
//Напиши функцию, которая принимает список чисел и возвращает список чисел.
//
//Пример данных: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//
//Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по
// возрастанию и взять первые 3. Вызывай методы обработки и фильтрации последовательно
// один из другого, чтобы результат предыдущего метода являлся основой для следующего.
//
fun twentyFive(col: List<Int>): List<Int> {
    return col.filter { it >= 60 }
        .sorted()
        .take(3)
}

//Задача 26. Создание каталога по первой букве
//Напиши функцию, которая принимает список строк и возвращает словарь с ключом - буквой
// и значением - списком строк.
//
//Начальные значения: val list = listOf(
//    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
//    "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
//    "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
//    "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус",
//    "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка",
//    "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
//    "посуда", "Настольная лампа", "торшер", "Этажерка"
//)
//
//Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог
// по первой букве используя метод groupBy
fun twentySix(col: List<String>): Map<Char, List<String>> {
    return col.map { it.lowercase() }
        .groupBy { it.first() }
}

//Задание 27. Подсчёт средней длины слов в списке
//Напиши функцию, которая принимает список строк и возвращает строку.
//
//Начальные значения взять из предыдущей задачи.
//
//Цель: Перевести все слова в количество букв, подсчитать среднее значение.
// Вернуть форматированный текст с двумя знаками после запятой, используя функцию
// format и подходящий шаблон.
//
fun twentySeven(col: List<String>): String {
    val sum = col.sumOf { it.length }
    val count = col.size

    return String.format("%.2f", sum)
}

//Задание 28: Категоризация чисел
//Напиши функцию, которая принимает список чисел и возвращает словарь с ключами - строками
// и значениями - список чисел.
//
//Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//
//Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать
// по четности (“четные” и “нечетные”).
//
fun twentyEight(col: List<Int>): Map<String, List<Int>> {
    val numsuniq = col.distinct().sortedDescending()
    val chet = numsuniq.filter { it % 2 == 0 }
    val nechet = numsuniq.filter { it % 2 != 0 }

    return mapOf("четные" to chet, "нечетные" to nechet)
}

//Задание 29: Поиск первого подходящего элемента
//Напиши функцию, которая принимает список чисел и число и возвращает nullable число.
//
//Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60) и
// число для проверки возраста, например 18.
//
//Цель: Найти первый возраст в списке, который соответствует условию
// (больше второго аргумента) и вернуть его, либо null если значения не нашлось.
//
fun twentyNine(col: List<Int>, i: Int): Int? {
    return col.firstOrNull { it > i }
}
