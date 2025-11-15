package org.example.ru.kotiki.lessons.lesson19.homeworks

class ListHolder<T>(items: List<T>) {
    val el: MutableList<T> = items.toMutableList()

    fun addItem(i: T) {
        el.add(i)
    }

    fun getItems(): List<T> {
        return el.toList()
    }
}
