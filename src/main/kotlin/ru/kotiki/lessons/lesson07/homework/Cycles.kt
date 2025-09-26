package org.example.ru.kotiki.lessons.lesson07.homework

//Задания для цикла for
//Прямой диапазон
//Напишите цикл for, который выводит числа от 1 до 5.
fun one () {
    for (i in 1..5) {
        println(i)
    }
}
//Напишите цикл for, который выводит четные числа от 1 до 10.
fun two () {
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

//Обратный диапазон
//Создайте цикл for, который выводит числа от 5 до 1.
fun three () {
    for (i in 5 downTo 1) {
        println(i)
    }
}

//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
fun four () {
    for (i in 10 downTo 1) {
        println(i * 2)
    }
}

//С шагом (step)
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
fun five () {
    for (i in 1..9 step 2) {
        println(i)
    }
}

//Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
fun six () {
    for (i in 3..20 step 3) {
        println(i)
    }
}

//Использование до (until)
//Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
fun seven () {
    val size: Int = 10
    for (i in 3 until size step 2) {
        println(i)
    }
}
//Задания для цикла while
//Цикл while
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
fun eight () {
    var counter = 1
    while (counter <= 5) {
        println(counter * counter)
        counter++
    }
}
//Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
fun nine () {
    var counter = 10
    while (counter >= 5) {
        counter--
        println(counter)
    }
}
//Цикл do while
//Используйте цикл do while, чтобы вывести числа от 5 до 1.
fun ten() {
    var counter = 5
    do {
        println(counter)
        counter--
    } while (counter >= 1)
}
//Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
fun elleven () {
    var counter = 5
    do {
        counter++
    } while (counter <= 10)
}
//Задания для прерывания и пропуска итерации
//Использование break
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
fun twelwe () {
    for (i in 1..10) {
        if (i == 3) break
    }
}
//Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
fun thirteen() {
    var i = 1
    while (true) {
        if (i == 10) break
        println(i)
        i++
    }
}
//Использование continue
//В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
fun fourteen() {
    for (i in 1..10) {
        if (i %2 == 0) continue
    }
}
//Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
fun fifteen() {
    var counter = 1
    while (counter <= 10) {
        if (counter % 3 == 0) {
            counter++
            continue
        }
        println(counter)
        counter++
    }
}
