package org.example.ru.kotiki.lessons.lesson16.homeworks.Animals

class Bird: Animals() {
    override fun makeSound() {
        println("${Colors.GREEN}Tweet${Colors.RESET}")
    }
}