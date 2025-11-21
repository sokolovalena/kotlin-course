package org.example.ru.kotiki.lessons.lesson19.homeworks

class Generics {
    fun <T> getMiddleElement(list: List<T>): T? {
        val size = list.size

        if (size == 0 || size % 2 == 0) {
            return null
        }
        val i = size / 2
        return list[i]
    }

    fun <E, Q> transposition(mapp: Map<E, Q>): Map<Q, E> {
        val tmap: MutableMap<Q, E> = mutableMapOf()
        for ((k, v) in mapp) {
            tmap[v] = k
        }
        return tmap.toMap()
    }
}