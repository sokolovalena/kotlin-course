package org.example.ru.kotiki.lessons.lesson15.homeworks.ucheba

open class School(
    isGorodskoe: Boolean,
    isPrivate: Boolean,
    val countUchenikov: Int
) : Zavedenie(isGorodskoe, isPrivate)