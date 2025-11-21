package org.example.ru.kotiki.lessons.lesson19.homeworks

class OddValidator : Validator<Int> {
    override fun valid(item: Int): Boolean {
        return item % 2 == 0
    }
}