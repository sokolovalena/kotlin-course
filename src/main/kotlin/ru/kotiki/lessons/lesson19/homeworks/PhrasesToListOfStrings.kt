package org.example.ru.kotiki.lessons.lesson19.homeworks

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun map(item: String): List<String> {
        return item.split(" ")
    }

    override fun mapList(items: List<String>): List<List<String>> {
        return items.map { it.split(" ") }
    }
}