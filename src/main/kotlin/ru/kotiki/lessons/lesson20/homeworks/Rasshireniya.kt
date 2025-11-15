package org.example.ru.kotiki.lessons.lesson20.homeworks

import kotlin.math.absoluteValue

class Rasshireniya {
    fun Array<Int>.returnPairs(): Pair<Int?, Int?> {
        if (this.isEmpty()) {
            return Pair(null, null)
        }
        return Pair(this[0], this[size - 1])
    }

    fun <T : Comparable<T>> MutableList<T>.functions(i: Boolean): List<T> {

        if (i) {
            this.sort()
        } else {
            this.sortDescending()
        }
        return this.toList()
    }


    fun <Q, W> Map<Q, List<W>>?.extractByIndex(index: Int): Map<String, W?>? {
        if (this == null) {
            return null
        }

        val map: Map<Q, List<W>> = this

        val resMap: MutableMap<String, W?> = mutableMapOf()

        for ((k, v) in map) {
            val newKey = k.toString()
            val newValue: W? = v.getOrNull(index)

            resMap[newKey] = newValue
        }
        return resMap.toMap()
    }


    fun Number.within(other: Int, deviation: Int): Boolean {
        if ((this.toInt().absoluteValue - other.absoluteValue) < deviation) {
            return true
        } else {
            return false
        }
    }

    fun String.encrypt(base: Int): String {
        var res = ""
        for (i in this) {
            val shiftedChar = (i.code + base).toChar()
            res += shiftedChar
        }
        return res

    }

    fun String.decrypt(base: Int): String {
        var res = ""
        for (i in this) {
            val shiftedChar = (i.code - base).toChar()
            res += shiftedChar
        }
        return res

    }

    fun String.twitter(author: List<String>) {
        val hasAuthors = author.isNotEmpty()
        var index = 0

        for (i in this) {
            val cur = author[index % author.size]
            index++
            "$cur:"


            println(cur)
            println(i.uppercaseChar())
            println()
        }
    }
}




