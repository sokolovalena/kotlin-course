import java.util.*

//package org.example.ru.kotiki.lessons.lesson10.homework
//
//Задачи на работу со словарём
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
val emptyMap = mapOf<Int, Int>()

//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
val map = mapOf(1.2 to 1.2, 2.1 to 2.1, 3.1 to 3.1)

//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
val mutableMap = mutableMapOf<Int, String>()

//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
fun addToMap() {
    mutableMap[0] = "Котики"
    mutableMap[1] = "Котята"
    mutableMap[2] = "Кошки"
    mutableMap[3] = "Котища"
}

//Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
fun valueFromMap() {
    val oneCat = mutableMap[0]
    val twoCat = mutableMap[5]
}

//Удалите определенный элемент из изменяемого словаря по его ключу.
fun deleteFromMap() {
    mutableMap.remove(0)
}

//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
fun delenieInMap() {
    val map = mapOf(1.0 to 2, 1.1 to 3, 1.2 to 4)
    for ((doub, inte) in map) {
        if (inte == 0) {
            println("бесконечность")
        } else { println(doub/inte) }
    }
}

//Измените значение для существующего ключа в изменяемом словаре.
fun izmenInMap() {
    mutableMap[0] = "Вообще не коты"
}

//Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
fun twoMaps() {
    val mutableMap1 = mutableMapOf(1 to "Коты", 2 to "Собаки", 3 to "Коровы")
    val mutableMap2 = mutableMapOf(4 to "Коты", 5 to "Собаки", 6 to "Коровы")

    val res = mutableMapOf<Int, String>()
    for ((i, n) in mutableMap1) { res[i] = n }
    for ((i, n) in mutableMap2) { res[i] = n }
}

//Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
// Добавьте несколько элементов в этот словарь.
fun insertToMaps() {
    val map = mutableMapOf<String, MutableList<Int>>()
    map["котики"] = mutableListOf(1, 2, 3)
    map["собачки"] = mutableListOf(4)
}

//Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
// Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк)
// и добавь в это множество ещё строку. Распечатай полученное множество.
fun anotherMap() {
    val maps = mutableMapOf(
        1 to mutableSetOf("яблоко", "банан"),
        2 to mutableSetOf("собака")
    )

    val key1 = maps[1]
    key1?.add("апельсин")
    println("множество для ключа 1: $key1")
}

//Создай словарь, где ключами будут пары чисел.
// Через перебор найди значение у которого пара будет содержать цифру 5
// в качестве первого или второго значения.
fun anotherMap2() {
    val map = mapOf(
        Pair(1, 2) to "1",
        Pair(5, 3) to "2",
        Pair(4, 5) to "3",
        Pair(7, 8) to "4",
    )

    val res = mutableListOf<String>()

    for ((p, v) in map) {
        if (p.first == 5 || p.second == 5) {
            println("Пара $p содержит 5 и значение: $v")
            res.add(v)
        }
    }
}



//Задачи на подбор оптимального типа для словаря
//Словарь библиотека: Ключи - автор книги, значения - список книг
val lin: MutableMap<String, MutableList<String>> = mutableMapOf()

//Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
val rast: MutableMap<String, MutableList<String>> = mutableMapOf()

//Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
val football: MutableMap<String, MutableList<String>> = mutableMapOf()

//Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
val med: MutableMap<Date, MutableList<String>> = mutableMapOf()

//Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
val travel: MutableMap<String, MutableMap<String, MutableList<String>>> = mutableMapOf()