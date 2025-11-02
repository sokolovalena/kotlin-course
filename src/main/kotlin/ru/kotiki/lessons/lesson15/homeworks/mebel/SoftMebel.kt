package org.example.ru.kotiki.lessons.lesson15.homeworks.mebel

open class SoftMebel(
    isSoftMebel: Boolean,
    material: String,
    val isKitchen: Boolean
) : Mebel(isSoftMebel, material)