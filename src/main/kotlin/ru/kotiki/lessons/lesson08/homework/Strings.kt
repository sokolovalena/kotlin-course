package org.example.ru.kotiki.lessons.lesson08.homework

// 1. Преобразование строк
fun madeString(predl: String) {
    if (predl.contains("невозможно")) {
        predl.replace("невозможно", "совершенно точно возможно, просто требует времени")
        }
    if (predl.startsWith("Я не уверен")) {
        predl+", но моя интуиция говорит об обратном"
    }
    if (predl.contains("катастрофа")) {
        predl.replace("катастрофа", "интересное событие")
    }
    if (predl.endsWith("Без проблем>")) {
        predl.replace("Без проблем", "с парой интересных вызовов на пути")
    }
    if (!predl.contains(" ")) {
        "Иногда, " + ", но не всегда"
    }
}

// 2. Извлечение даты из строки лога
fun dateTime(log: String) {
    var arr = log.split(" -> ")
    var arr2 = arr[1].split(" ")
    println(arr2[0])
    println(arr2[1])
}

//3. Маскирование личных данных
fun mask(card: String) {
    var arr = card.split(" ")
    var res = "**** **** **** " + arr[3]
}

//4.Форматирование адреса электронной почты.
fun emailEdit(email: String) {
    email.replace("@", " [at] ")
    email.replace(".", " [dot] ")
}

//5. Извлечение имени файла из пути.
fun files(path: String): String {
    var arr = path.split("/")
    return arr[arr.lastIndex]
}

//6. Создание аббревиатуры из фразы.
fun abbrv(fr: String): String {
    var arr = fr.split(" ")
    var res = ""
    for (i in arr.indices) {
        res += arr[i][0]
    }
    return res.uppercase()
}