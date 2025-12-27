package org.example.ru.kotiki.lessons.lesson30.homeworks

class InventoryManager(private val capacity: Int) {

    private val items = mutableMapOf<String, Int>()

    /**
     * Метод возвращает количество инвентаря. Если наименования нет, возвращает 0
     */
    fun getItemCount(itemName: String): Int {
        return items.getOrDefault(itemName, 0)
    }

    /**
     * Добавляет инвентарь в хранилище к существующему.
     * @param itemName название инвентаря
     * @param quantity количество инвентаря
     * @throws IllegalStateException в случае, если допустимое количество может быть превышено
     */
    fun addItem(itemName: String, quantity: Int) {
        if (quantity <= 0) {
            throw IllegalArgumentException("Количество должно быть больше 0")
        }
        val current = items.getOrDefault(itemName, 0)
        val new= current + quantity
        checkCapacity(quantity)
        items[itemName] = new
    }


    /**
     * Удаляет инвентарь из хранилища
     * @param itemName название инвентаря
     * @param quantity количество инвентаря для удаления
     * @return true если удаление произошло и false если удаление невозможно, например нет наименования или нужного количества
     */
    fun removeItem(itemName: String, quantity: Int): Boolean {
        if (quantity <= 0) {
            throw IllegalArgumentException("Количество должно быть больше 0")
        }
        val current = items[itemName]

        if (current == null) { return false }
        if (quantity > current) { return false }

        val new = current - quantity
        if (new == 0) { items.remove(itemName) }
        else {
            items[itemName] = new
        }
        return true
    }


    /**
     * Проверяет, что количество объектов в инвентаре с учётом добавляющихся не превысит допустимого количества
     * @param itemsForAdding количество объектов для добавления
     * @throws IllegalStateException в случае, если допустимое количество может быть превышено
     */
    private fun checkCapacity(itemsForAdding: Int) {
        if (itemsForAdding < 0) {
            throw IllegalArgumentException("Количество не может быть отрицательным")
        }
        val current = items.values.sum()
        check(capacity - current >= itemsForAdding) {
            "Количество инвентаря не должно превышать $capacity единиц. " +
                    "Сейчас: $current, Плюс: $itemsForAdding, Макс: $capacity."
        }
    }
}