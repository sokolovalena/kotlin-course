package org.example.ru.kotiki.lessons.lesson31.homeworks

class PhoneNumberFormatter {
//    Необходимо создать класс PhoneNumberFormatter, который будет иметь метод formatPhoneNumber принимающий и возвращающий строку. Этот метод должен преобразовывать входящую строку в стандартизированный формат номера телефона РФ +7 (XXX) XXX-XX-XX.  Если преобразование невозможно, то выдавать IllegalArgumentException.
//Алгоритм преобразования следующий:
// • Очищаем строку от невалидных символов через замену всех нечисловых знаков на пустую строку. Делается это через replace который принимает regex выражение "\\D".toRegex() ( \\D - это выражение, которое находит все нечисловые значения)
// • Если длина полученной числовой строки не равна 10 или 11 знакам - выкидываем исключение
// • Если в строке 11 значений, то номер должен начинаться на 8 или 7, иначе выкидываем исключение что номер невалидный. Если условие верное, то удаляем первый символ.
// • Создаём фрагменты номера с помощью substring и вставляем их в шаблон

    fun formatPhoneNumber(num: String): String {
        var cifry = num.replace("\\D".toRegex(), "")

        if (cifry.length != 10 && cifry.length != 11) {
            throw IllegalArgumentException("Должно быть 10 или 11 цифр")
        }

        if (cifry.length == 11) {
            if (cifry.startsWith("8") || cifry.startsWith("7")) {
                cifry = cifry.substring(1)
            } else {
                throw IllegalArgumentException("Неправильный номер")
            }
        }

        val three = cifry.substring(0, 3)
        val three2 = cifry.substring(3, 6)
        val two1 = cifry.substring(6, 8)
        val two2 = cifry.substring(8, 10)

        return "+7 ($three) $three2-$two1-$two2"
    }
}