package org.example.ru.kotiki.lessons.lesson16.homeworks

class Korzina {
    private val items: MutableMap<String, Int> = mutableMapOf()

    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
        println("добавлен айтем $itemId в корзину")
    }

    fun addToCart(itemId: String, kol: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + kol
        println("добавлено $kol айтемов: $itemId в корзину")
    }

    fun addToCart(itemsss: Map<String, Int>) {
        for ((itemId, kol) in itemsss) {
            items[itemId] = items.getOrDefault(itemId, 0) + kol
            println("добавлено $kol айтемов $itemId из мапы в корзину")
        }
    }

    fun addToCart(itemIds: List<String>) {
        for (itemId in itemIds) {
            items[itemId] = items.getOrDefault(itemId, 0) + 1
            println("Добавлен айтем $itemId из листа в корзину")
        }
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("=== Корзинка ===\n")
        stringBuilder.append(String.format("%-15s | %-10s | %-15s\n", "id", "Количество", "Сумма"))
        stringBuilder.append("---------------------------------------\n")

        var kolItems = 0
        var count = 0

        val sorti = items.toList().sortedBy { it.first }

        for ((id, q) in sorti) {
            stringBuilder.append(
                String.format(
                    "%-15s | %-10d | %-15d\n",
                    id,
                    q,
                    q
                )
            )
            kolItems += q
            count++
        }

        stringBuilder.append("---------------------------------------\n")
        stringBuilder.append("Строк: $count\n")
        stringBuilder.append("Всего айтемов $kolItems\n")
        stringBuilder.append("---------------------------------------")

        return stringBuilder.toString()
    }
}

fun main() {
    val myCart = Korzina()

    myCart.addToCart("Ручка")
    myCart.addToCart("Карандаш")
    myCart.addToCart("Линейка")

    myCart.addToCart("Стерка", 3)
    myCart.addToCart("Точилка", 5)
    myCart.addToCart("Ручка", 2)

    val itemsFromMap = mapOf(
        "Тетрадь" to 2,
        "Дневник" to 1,
        "Обложка" to 4
    )
    myCart.addToCart(itemsFromMap)

    val itemsFromList = listOf("Учебник", "Портфель", "Фломастеры", "Ручка")
    myCart.addToCart(itemsFromList)

    println("\n=== Конец ===")
    println(myCart)
}