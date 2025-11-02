package org.example.ru.kotiki.lessons.lesson14.homeworks

class Rack(val maxShelves: Int) {
    val shelves: MutableList<Shelf> = mutableListOf()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size < maxShelves && !shelves.contains(shelf)) {
            shelves.add(shelf)
            return true
        }
        return false
    }

    fun removeShelf(index: Int): List<String> {
        if (index in 0 until shelves.size) {
            val removedShelf = shelves.removeAt(index)
            return removedShelf.getItemssss()
        }
        return emptyList()
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(item)) {
                return true
            }
        }
        return false
    }

    fun getShelvesss(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        for ((index, shelf) in shelves.withIndex()) {
            println("Индекс полки ${index + 1}:")
            println("Вместимость полки: ${shelf.capacity}")
            println("Оставшаяся вместимость: ${shelf.getRemainingCapacity()}")
            println("Список предметов: ${shelf.getItemssss()}")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in 0 until shelves.size) {
            return emptyList()
        }

        val removedShelf = shelves.removeAt(index)
        val unplacedItems = mutableListOf<String>()
        val itemsToReallocate = removedShelf.getItemssss().sortedByDescending { it.length }

        for (item in itemsToReallocate) {
            var placed = false
            for (shelf in shelves) {
                if (shelf.canAccommodate(item)) {
                    shelf.addItem(item)
                    placed = true
                    break
                }
            }
            if (!placed) {
                unplacedItems.add(item)
            }
        }

        return unplacedItems.toList()
    }
}