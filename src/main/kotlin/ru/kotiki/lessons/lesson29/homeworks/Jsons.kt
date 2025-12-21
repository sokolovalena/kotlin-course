package org.example.ru.kotiki.lessons.lesson29.homeworks

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

class Jsons {
//    Задание 1
//
//Создай дата класс сотрудника компании Employee, содержащий:
//
//имя
//статус трудоустройства (булево)
//дата рождения (строка)
//должность CharacterTypes
//список подчинённых с типом Employee

    data class Employee(
    val name: String,
    val status: Boolean,
    val dateBirth: String,
    val type: CharacterTypes,
    val employes: List<Employee> = emptyList()
)

enum class CharacterTypes {
    CTO,
    UX_UI,
    CRM, // Customer Relationship Manager
    FRONTEND_DEV,
    TEAM_LEAD,
    BACKEND_DEV,
    PM,
    SYSADMIN,
    QA
}

//    Задание 2
//
//Создай объекты рабочей группы так, чтобы у CTO был PM и CRM, у PM было два тим-лида (на фронт и бэк)
// и у каждого было по группе сотрудников подходящего для его стека профиля.
fun main() {
    val frontend1 = Employee("one", true, "1990-05-05", CharacterTypes.FRONTEND_DEV)
    val frontend2 = Employee("two", true, "1990-05-20", CharacterTypes.FRONTEND_DEV)
    val des = Employee("three", true, "1999-01-05", CharacterTypes.UX_UI)

    val frontendTL = Employee(
        "three", true, "1991-01-01", CharacterTypes.TEAM_LEAD,
        employes = listOf(frontend1, frontend2, des)
    )

    val backend1 = Employee("four", true, "1991-01-01", CharacterTypes.BACKEND_DEV)
    val backend2 = Employee("five", true, "1992-02-02", CharacterTypes.BACKEND_DEV)
    val qa = Employee("six", true, "1993-03-03", CharacterTypes.QA)

    val backendTL = Employee(
        "seven", true, "1994-04-04", CharacterTypes.TEAM_LEAD,
        employes = listOf(backend1, backend2, qa)
    )

    val project = Employee(
        "eight", true, "1995-05-05", CharacterTypes.PM,
        employes = listOf(frontendTL, backendTL)
    )

    val crm = Employee("nine", true, "1996-06-06", CharacterTypes.CRM)

    val cto = Employee(
        "ten", true, "1997-07-07", CharacterTypes.CTO,
        employes = listOf(project, crm)
    )

//    Задание 3
//
//Создай функцию в которой:
//
//сериализуй CTO в текст с настройкой prettyPrinting
//текст запиши в файл в корне проекта.

    fun toPretty() {
        val gson = GsonBuilder()
            .setPrettyPrinting()
            .serializeNulls()
            .create()

        val json = gson.toJson(cto)
        println("Pretty JSON:\n$json")
    }

//    Задание 4
//
//Создай функцию в которой:
//
//прочитай текст из файла
//десериализуй его в объект класса Employee
//распечатай в консоль
    
fun fromFile() {
    val fileName = "employee.json"
    val gson = Gson()
    val jsonString = File(fileName).readText()
    val employee = gson.fromJson(jsonString, Employee::class.java)
    println(employee)
}
}
}