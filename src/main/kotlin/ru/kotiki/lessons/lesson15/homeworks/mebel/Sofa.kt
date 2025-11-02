package org.example.ru.kotiki.lessons.lesson15.homeworks.mebel

class Sofa(
    isSoftMebel: Boolean,
    material: String,
    isKitchen: Boolean,
    val color: String
) : SoftMebel(isSoftMebel, material, isKitchen)