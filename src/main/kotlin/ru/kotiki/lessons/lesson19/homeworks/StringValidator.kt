package org.example.ru.kotiki.lessons.lesson19.homeworks

class StringValidator : Validator<String?> {
    override fun valid(item: String?): Boolean {
        if (item == null) {
            return false
        }
        return item.isNotBlank()
    }
}