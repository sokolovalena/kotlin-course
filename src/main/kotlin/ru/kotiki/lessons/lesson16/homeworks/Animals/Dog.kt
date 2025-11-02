package org.example.ru.kotiki.lessons.lesson16.homeworks.Animals

class Dog : Animals() {
    override fun makeSound() {
        println("${Colors.RED}Bark${Colors.RESET}")
    }
}