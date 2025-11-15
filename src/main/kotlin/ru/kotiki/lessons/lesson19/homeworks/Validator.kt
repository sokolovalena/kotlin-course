package org.example.ru.kotiki.lessons.lesson19.homeworks

interface Validator<T> {
    fun valid(item: T): Boolean
}