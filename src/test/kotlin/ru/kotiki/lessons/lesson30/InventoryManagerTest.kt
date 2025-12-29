package ru.kotiki.lessons.lesson30

import org.example.ru.kotiki.lessons.lesson30.homeworks.InventoryManager
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class InventoryManagerTest {
    private lateinit var manager: InventoryManager
    private val capacity = 100

    @BeforeEach
    fun setUp() {
        manager = InventoryManager(capacity)
    }

    @Test
    fun getItemCount_exist() = with(manager) {
        addItem("Кастрюлька", 10)
        assertEquals(10, getItemCount("Кастрюлька"))
    }

    @Test
    fun getItemCount_nonexist() = with(manager) {
        assertEquals(0, getItemCount("Сковородка"))
    }

    @Test
    fun addItem_newItem() = with(manager) {
        addItem("Половник", 3)
        assertEquals(3, getItemCount("Половник"))
    }

    @Test
    fun addItem_exist_update() = with(manager) {
        addItem("Ложка", 1)
        addItem("Ложка", 2)
        assertEquals(3, getItemCount("Ложка"))
    }

    @Test
    fun addItem_exceedsCapacity() = with(manager) {
        assertThrows<IllegalStateException> {
            addItem("Вилка", capacity + 2) }
        assertEquals(0, getItemCount("Вилка"))
    }

    @Test
    fun addItem_exceedsCapacity_exist() = with(manager) {
        addItem("Чашка", capacity - 3)
        assertEquals(capacity - 3, getItemCount("Чашка"))

        assertThrows<IllegalStateException> {
            addItem("Чашка", 15)
        }
        assertEquals(capacity - 15, getItemCount("Чашка"))
    }

    @Test
    fun addItem_zero() = with(manager) {
        assertThrows<IllegalArgumentException> {
            addItem("Ничего", 0)
        }
        assertEquals(0, getItemCount("Ничего"))
    }

    @Test
    fun addItem_negative() = with(manager) {
        assertThrows<IllegalArgumentException> {
            addItem("Минус", -5)
        }
        assertEquals(0, getItemCount("Минус"))
    }

    @Test
    fun addItem_exactly() = with(manager) {
        addItem("Один", capacity / 2)
        addItem("Два", capacity / 2)
        assertEquals(capacity / 2, getItemCount("Один"))
        assertEquals(capacity / 2, getItemCount("Два"))
    }


    @Test
    fun removeItem_existItem() = with(manager) {
        addItem("Кастрюлька", 10)
        assertTrue(removeItem("Кастрюлька", 4))
        assertEquals(6, getItemCount("Кастрюлька"))
    }

    @Test
    fun removeItem_existingItemCompl() = with(manager) {
        addItem("Сковородка", 5)
        assertTrue(removeItem("Сковородка", 5))
        assertEquals(0, getItemCount("Сковородка"))
    }

    @Test
    fun removeItem_nonExist() = with(manager) {
        assertFalse(removeItem("Вода", 1))
        assertEquals(0, getItemCount("Вода"))
    }
}