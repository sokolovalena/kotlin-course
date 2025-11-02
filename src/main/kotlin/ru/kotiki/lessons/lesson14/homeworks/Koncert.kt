package org.example.ru.kotiki.lessons.lesson14.homeworks

class Koncert(var location: String, var group: String, var price: Double, var vmest: Int, private var countBil: Int) {
    fun info() {
        println("Концерт в $location будет группа $group и цена на концерт стоит $price, а вместимость зала $vmest" )
    }

    fun incrementBilet(countBil: Int, payed: Boolean): Int {
        var newCount = countBil
        if (payed) {
            newCount = countBil + 1
        }
        return newCount
    }
}