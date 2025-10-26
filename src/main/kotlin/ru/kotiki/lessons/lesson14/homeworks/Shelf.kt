package org.example.ru.kotiki.lessons.lesson14.homeworks

class Shelf(val capacity: Int) {
    val items: MutableList<String> = mutableListOf()

    fun addItem(item: String): Boolean {
        if (canAccommodate(item)) {
            items.add(item)
            return true
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        return items.remove(item)
    }

    fun canAccommodate(item: String): Boolean {
        return (capacity - items.sumOf { it.length }) >= item.length
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun getRemainingCapacity(): Int {
        return capacity - items.sumOf { it.length }
    }
}