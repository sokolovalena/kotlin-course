//package org.example.ru.kotiki.lessons.lesson09.homework

//Работа с массивами Array
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
val numbers = arrayOf(1, 2, 3, 4, 5)

//Создайте пустой массив строк размером 10 элементов.
val stringArray = arrayOfNulls<String>(10)

//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
val doubleArray = DoubleArray(5) { i -> i * 2.0 }

//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
fun arrays() {
    val arr = IntArray(5)
    for (i in arr.indices) {
        arr[i] = i * 3
    }
}

//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
fun arrays2() {
    val arr = arrayOfNulls<String>(3)
    arr[0] = null
    arr[1] = "Котлин"
    arr[2] = "Зе Бест"
}

//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
fun arrays3() {
    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = IntArray(arr1.size)

    for (i in arr1.indices) {
        arr2[i] = arr1[i]
    }
}

//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
fun arrays4() {
    val arr1 = intArrayOf(10, 9, 8, 7, 6)
    var arr2 = intArrayOf(5, 4, 3, 2, 1)
    var arr3 = IntArray(arr1.size)
    for (i in arr1.indices) {
        arr3[i] = arr1[i] - arr2[i]
    }
}

//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
fun arrays5(): Int {
    val arr1 = intArrayOf(10, 9, 8, 7, 6, 5)
    var i = 0
    while (i < arr1.size) {
        if (arr1[i] == 5) {
            return i
        }
        i++
    }
    return -1
    println("-1")
}

//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
fun arrays6() {

    val arr1 = intArrayOf(10, 9, 8, 7, 6, 5)
    for (i in arr1.indices) {
        if (arr1[i] % 2 == 0) {
            println("$arr1[i] чётное")
        } else {
            println("$arr1[i] нечётное")
        }
    }
}

//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
fun arrays7(arr1: Array<String>, str: String) {
    for (i in arr1) {
        if (i.contains(str)) {
            println(i)
            return
        }
    }
}


//Работа со списками List
//Создайте пустой неизменяемый список целых чисел.
val readOnlyList: List<String>  = listOf()

//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
val readOnlyList2: List<String>  = listOf("Hello", "World", "Kotlin")

//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
var mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
fun list1(){
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)
}

//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
fun list2() {
    var mutableList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    mutableList.remove("World")
}

//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
fun list3() {
    var mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    for(i in mutableList) {
        println(i)
    }
}

//Создайте список строк и получите из него второй элемент, используя его индекс.
fun list4() {
    var mutableList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    mutableList.elementAt(1)
}

//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
fun list5() {
    var mutableList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    mutableList.removeAt(1)
    mutableList.add(1, "Ku")
}
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
fun list6() {
    val list1 = listOf("one", "two", "three")
    val list2 = listOf("four", "five", "six")
    val list3 = mutableListOf<String>()

    for (i in list1) {
        list3.add(i)
    }

    for (i in list2) {
        list3.add(i)
    }
}

//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
fun list7() {
    val list1 = listOf(1, 2, 3)
    var max = list1[0]
    var min = list1[0]

    for (i in list1) {
        if (i > max) {
            max = i
        }
        if (i < min) {
            min = i
        }
    }
}
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
fun list8() {
    val list1 = listOf(1, 2, 3)
    val list2 = mutableListOf<Int>()
    for (i in list1) {
        if (i % 2 == 0) {
            list2.add(i)
        }
    }
}

//Работа с Множествами Set
//Создайте пустое неизменяемое множество целых чисел.
val emptySet: Set<Int> = emptySet()

//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
val numbersSet: Set<Int> = setOf(1, 2, 3)

//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
val mutableNumbersSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
fun set1() {
    mutableNumbersSet.add("Swift")
    mutableNumbersSet.add("Go")
}

//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
fun set2() {
    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    mutableNumbersSet.remove(2)
}

//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
fun set3() {
    val numbersSet: Set<Int> = setOf(1, 2, 3)
    for (i in numbersSet) {
        println(i)
    }
}

//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
fun set4(one: Set<String>, two: String): Boolean {
    for (i in one) {
        if (i == two) {
            return true
        }
    }
    return false
}
//Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
fun set5() {
    val strSet: Set<String> = setOf("one", "two", "three") // Пример множества строк
    val mutableList: MutableList<String> = mutableListOf()

    for (i in strSet) {
        mutableList.add(i)
    }
}