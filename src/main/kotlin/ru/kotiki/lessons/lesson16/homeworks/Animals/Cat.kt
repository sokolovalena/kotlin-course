package org.example.ru.kotiki.lessons.lesson16.homeworks.Animals

class Cat: Animals() {
    override fun makeSound() {
        println("${Colors.YELLOW}Meow${Colors.RESET}")
    }
}