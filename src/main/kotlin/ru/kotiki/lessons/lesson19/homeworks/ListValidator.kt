package org.example.ru.kotiki.lessons.lesson19.homeworks

class ListValidator<T : Number> : Validator<List<T?>> {
    override fun valid(items: List<T?>): Boolean {
        for (i in items) {
            if (i == null) {
                return false
            }
            if (i.toDouble() == 0.0) {
                return false
            }
        }
        return true
    }
}