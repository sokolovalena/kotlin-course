package org.example.ru.kotiki.lessons.lesson19.homeworks

interface Mapper<ONE, TWO> {
    fun map(item: ONE): TWO

    fun mapList(items: List<ONE>): List<TWO> {
        return items.map { map(it) }
    }

}
