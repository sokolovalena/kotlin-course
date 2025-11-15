package org.example.ru.kotiki.lessons.lesson18.homeworks

fun main() {
    val hol = HolodilnikNonAbs()
    val stir = StiralnayaNonAbs()
    val cha = Chainik()

    hol.powerOn()
    hol.open()
    hol.clean()
    hol.close()

    stir.powerOn()
    stir.open()
    stir.close()

    cha.powerOn()
    cha.boilWater()
}