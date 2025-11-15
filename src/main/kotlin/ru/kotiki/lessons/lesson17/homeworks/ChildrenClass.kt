package org.example.ru.kotiki.lessons.lesson17.homeworks

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // Аргумент передается в конструктор ChildrenClass. ChildrenClass наследуется от BaseClass, и эти аргументы передаются в конструктор BaseClass.
    // В BaseClass publicVal объявлен как val publicVal: String.он объявлен без модификатора доступа (значит public), он доступен для чтения из любого места.
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // getAll() объявлена в BaseClass с модификатором доступа по умолчанию (public).
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // printText() в BaseClass: Метод printText() в BaseClass вызывает privatePrint().
    // privatePrint в BaseClass с модификатором private. а private члены не наследуются
    // здесь объявлен метод с тем же именем и сигнатурой, что и private метод в родителе, это не переопределение. Это создание новой,функции.

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun setProtectedFieldFromMain(newValue: String) {
        protectedField = newValue
    }

    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}

fun main() {
    val child = ChildrenClass(
        privateVal = "Значение для ChildrenClass.privateVal",
        protectedVal = "Защищенное значение",
        publicVal = "Публичное значение"
    )
    child.publicField = "Антонио Бандерас"
    child.setProtectedFieldFromMain("кто-то еще")
    println(child.getAll())
    println(child.privateVal)
}