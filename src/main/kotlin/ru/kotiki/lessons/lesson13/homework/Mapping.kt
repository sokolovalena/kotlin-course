package org.example.ru.kotiki.lessons.lesson13.homework

//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
fun averageTime(map: Map<String, Int>): Double {
    return map.values.average()
}

//Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых
// методов а значения - строка с метаданными. Выведите список всех тестовых методов.
fun metaValue(map: Map<String, String>): List<String> {
    return map.keys.toList()
}

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
fun addResult(map: MutableMap<String, String>, testName: String, res: String) {
    map[testName] = res
}

//Посчитайте количество успешных тестов в словаре с результатами (ключ - название,
// значение - результат из passed, failed, skipped).
fun countUsp(map: Map<String, String>): Int {
    return map.values.map {it == "passed"}.count()
}

//Удалите из изменяемого словаря с баг-трекингом запись о баге,
// который был исправлен (ключ - название, значение - статус исправления).
fun removeBug(map: MutableMap<String, String>, bug: String) {
    map.remove(bug)
}

//Для словаря с результатами тестирования веб-страниц
// (ключ — URL страницы, значение — статус ответа), выведите сообщение
// о странице и статусе её проверки.
fun printTest(map: Map<String, String>) {
    map.forEach { (url, status) ->
        println("Страница: $url, Статус: $status")
    }
}

//Найдите в словаре с названием и временем ответа сервисов только те,
// время ответа которых превышает заданный порог.
fun filterMaps(map: Map<String, Int>, porog: Int): String {
    return map.filter { it.value > porog }.entries.joinToString() { "${it.key}: ${it.value}" }
}

//В словаре хранятся результаты тестирования API
// (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует,
// предположите, что он не был протестирован.
fun api(res: Map<String, String>, ep: String): String {
    return res[ep] ?: "'$ep' не был протестирован."
}

//Из словаря, содержащего конфигурации тестового окружения
// (ключ — название параметра конфигурации, значение - сама конфигурация),
// получите значение для "browserType". Ответ не может быть null.
fun browserType(map: Map<String, String>): String {
    return map.getValue("browserType")
}

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
val one = mapOf("1" to "1", "2" to "2", "3" to "3")
val new = "4" to "4"

val upd = one.toMutableMap().apply {
    put(new.first, new.second)
}.toMap()

//Используя словарь с настройками тестирования для различных мобильных устройств
// (ключ — модель устройства, значение - строка с настройками),
// получите настройки для конкретной модели или верните настройки по умолчанию.
val set = mapOf("iPhone" to "УУууу", "Samsung" to "Ооооо", "Poco" to "ЕЕЕЕеее")
val defaullt = "Оаоаоаоао"

fun getSet(model: String): String {
    return set[model] ?: defaullt
}

//Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки,
// значение - описание ошибки) определенный код ошибки.
fun codeContains(map: Map<Int, String>, code: Int): Boolean {
    return map.containsKey(code)
}

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в
// формате "TestID_Version", а значения — статусы выполнения этих тестов
// ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только
// те сценарии, идентификаторы которых соответствуют определённой версии
// тестов, то-есть в ключе содержится требуемая версия.
fun mapFilter(map: Map<String, String>, req: String): Map<String, String> {
    return map.filterKeys { it.contains(req) }
}

//У вас есть словарь, где ключи — это названия функциональных модулей
// приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.
fun mapContains(map: Map<String, String>): Boolean {
    return map.containsValue("fail")
}

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
fun add() {
    val onee = mutableMapOf("1" to 1, "2" to 2, "3" to 3)
    val twoo = mapOf("4" to 4, "5" to 5, "6" to 6)
    onee.putAll(twoo)
}

//Объедините два неизменяемых словаря с данными о багах.
fun addAll() {
    val three = mapOf("1" to 1, "2" to 2, "3" to 3)
    val four = mapOf("4" to 4, "5" to 5, "6" to 6)
    val five = three + four
}

//Очистите изменяемый словарь с временными данными о последнем
// прогоне автоматизированных тестов.
fun remove() {
    val six = mutableMapOf("4" to 4, "5" to 5, "6" to 6)
    six.clear()
}

//Исключите из отчета по автоматизированному тестированию те случаи,
// где тесты были пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.
fun removeIf(map: Map<String, String>): Map<String, String> {
    return map.filter { (_, status) -> status != "skipped" }
}

//Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
fun copies(one: Map<String, String>, two:  Set<String>): Map<String, String> {
return one.filterNot {  (key, _) -> key in two }
}

//Создайте отчет о тестировании, преобразовав словарь с результатами
// тестирования (ключ — идентификатор теста, значение — результат) в
// список строк формата "Test ID: результат".
fun generate(map: Map<String, String>): List<String> {
    return map.map { (id, res) -> "$id: $res" }
}

//Преобразуйте изменяемый словарь с результатами последнего тестирования
// в неизменяемый для архивации.
fun tomap() {
    val one = mutableMapOf("1" to "1", "2" to "2", "3" to "3", "4" to "4")
    val two: Map<String, String> = one.toMap()
}

//Преобразуйте словарь, содержащий числовой ID теста и данные о времени
// выполнения тестов, заменив идентификаторы тестов на их строковый аналог
// (например через toString()).
fun tostring() {
    val one = mutableMapOf("1" to "1", "2" to "2", "3" to "3", "4" to "4")
    val two: Map<String, String> = one.mapKeys { it.key.toString() }
}

//Для словаря с оценками производительности различных версий приложения
// (ключи - строковая версия, значения - дробное число времени ответа сервера)
// увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
fun mapupd(map: Map<String, Double> ): Map<String, Double> {
    return map.mapValues { it.value * 1.1 }
}

//Проверьте, пуст ли словарь с ошибками компиляции тестов.
fun emptyli(map: Map<String, String>): Boolean {
    return map.isEmpty()
}

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
fun notempty(map: Map<String, String>): Boolean {
    return map.isNotEmpty()
}

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
fun issuccess(map: Map<String, String>): Boolean {
    return map.values.all {it == "success"}
}

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
fun one(map: Map<String, String>): Boolean {
    return map.values.any {it == "fail"}
}

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
// которые не прошли успешно и содержат в названии “optional”.
fun fffilt(map: Map<String, String>): Map<String, String> {
    return map.filter { (key, value) -> value == "fail" && key.contains("optional") }
}
