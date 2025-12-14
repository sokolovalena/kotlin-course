package org.example.ru.kotiki.lessons.lesson26.homeworks

import java.io.File

class Files {
//    Создайте текстовый файл workspace/task1/example.txt.
    //    Запишите в него строку "Hello, Kotlin!", а затем проверьте,
    //    существует ли файл. Реши задачу с использованием scope функции без создания переменной.

    val path = "workspace/task1/example.txt"
    val fileExists = File(path).apply {
        writeText("Hello, Kotlin!")
    }.exists()
}

//   cоздайте директорию workspace/task2/testDir. Проверьте, является ли она директорией,
//   и выведите её абсолютный путь.
    fun main() {

    val dir = File("workspace/task2/testDir")
    dir.mkdirs()

    println("Является ли '${dir.path}' директорией: ${dir.isDirectory}")
    println("Абсолютный путь: ${dir.absolutePath}")


//Задача 3
//
//Создайте директорию workspace/task3/structure. Внутри директории structure создайте папку
// myDir с двумя вложенными поддиректориями subDir1 и subDir2.
// Проверьте, что myDir действительно содержит эти поддиректории.
// Используй scope функции для минимизации создания переменных а так же метод file.resolve("myDir")
// для создания нового объекта File путём добавления к существующему пути ещё одной секции.
// И так же для других директорий.

    val dir2 = File("workspace/task3/structure")
    dir2.mkdirs()
    dir2.resolve("myDir").apply {
        mkdirs()
        resolve("subDir1").mkdirs()
        resolve("subDir2").mkdirs()
    }.also { dirr ->
        val isdirr = dirr.isDirectory
        val sub1 = dirr.resolve("subDir1").isDirectory
        val sub2 = dirr.resolve("subDir2").isDirectory

        println("Директория ('${dirr.path}') существует и является директорией: $isdirr")
        println("myDir сожержит ли subDir1: $sub1")
        println("myDir сожержит ли subDir2: $sub2")
    }

//    Задача 4
//
//Создайте директорию workspace/task4/temp. Внутри директории temp создайте
    // несколько вложенных файлов и директорий.
    // Удалите директорию workspace/task4 со всем содержимым

    val dir3 = File("workspace/task4/temp")
    dir3.mkdirs()
    dir3.resolve("myDir").apply {
        mkdirs()
        resolve("subDir1").mkdirs()
        resolve("subDir2").mkdirs()
    }

    dir3.deleteRecursively()


//    Задача 5
//
//Создайте файл workspace/task5/config/config.txt.
    // запишите в него список параметров (в формате ключ=значение),
    // а затем прочитайте файл и выведите только значения.

    val file2 = "workspace/task5/config/config.txt"

    File(file2).apply {
        parentFile.mkdirs()

        writeText("""
            1=2,
            3=4,
            5=6
        """)
    }

    File(file2).readLines().forEach { line ->
            val v = line.substringAfter('=')
            println(v)
        }

//    Задача 6
//
//Пройди по всем вложенным директориям workspace и выведи в консоль сначала пути директорий,
    // а потом пути файлов

    val dd = File("workspace")

    val all = mutableListOf<String>()
    val allfiles = mutableListOf<String>()

    dd.walkTopDown().forEach { file ->
        if (file.isDirectory) {
            all.add(file.absolutePath)
        } else if (file.isFile) {
            allfiles.add(file.absolutePath)
        }
    }

    all.forEach { println(it) }

    allfiles.forEach { println(it) }


//    Задача 7
//
//Создайте директорию workspace/task7/docs.
    // Проверь, есть ли файл с именем readme.md.
    // Если файла нет, создайте его и запишите текст "This is a README file.". Проверьте текст в файле.

    val dir4 = File("workspace/task7/docs")
    dir4.mkdirs()

    val readme = dir4.resolve("readme.md")

    if (!readme.exists()) {
        readme.writeText("This is a README file.")
    } else {
        println("readme уже существует.")
    }

    println("Содержимое файла ")
    println(readme.readText())

//    Задача 8
//
//Создайте файлы
//
//workspace/task8/data/1/4/prod/data14.mysql
//workspace/task8/data/2/3/prod/data23.mysql
//workspace/task8/data/5/2/prod/data52.mysql
//Создайте директорию workspace/task8/backup и скопируйте туда файлы из
// workspace/task8/data сохраняя структуру директорий.
// Для копирования используй метод copyTo.
// Д ля получения относительного пути начиная от data используй relativeTo от
// пути до файла, передавая в него путь до базовой директории (то-есть data).
// Полученный relative фрагмент можно присоединить к пути бэкапа через
// resolve и таким образом получить путь назначения копирования, например
// workspace/task8/backup/1/4/prod/data14.mysql сохраняя весь относительный путь.


    val datadir = File("workspace/task8/data")
    val backup = File("workspace/task8/backup")

    val filess = listOf(
        datadir.resolve("1/4/prod/data14.mysql"),
        datadir.resolve("2/3/prod/data23.mysql"),
        datadir.resolve("5/2/prod/data52.mysql")
    )

    backup.mkdirs()

    filess.forEach { fiile ->
        val relativepath = fiile.relativeTo(datadir)
        val destfile = backup.resolve(relativepath)

        fiile.copyTo(destfile, overwrite = true)
    }
}


