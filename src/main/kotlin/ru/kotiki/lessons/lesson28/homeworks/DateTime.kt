package org.example.ru.kotiki.lessons.lesson28.homeworks

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

class DateTime {
//    Создай текущую метку времени и выведи её на печать (чтобы ещё раз запомнить название этого класса)

    fun main() {
        val localTimeNow = LocalTime.now()
        println(localTimeNow)

//Создай дату своего дня рождения.
        val birthday = LocalDate.of(1990, 7, 27)

//Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
        val dateTimeNow = LocalDate.now()
        val period = Period.between(dateTimeNow, birthday)
        println("${period.years} лет")

//Создай функцию, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
    // содержит ли аргумент время и часовой пояс.
    // Temporal - это общий тип для разных классов даты-времени.
    // В форматированном значении нужно выводить часы, минуты, секунды и таймзону, если они
    // представлены в переданном объекте. Обработай в методе все типы дат, которые знаешь.
    // Реализуй два варианта функции - с собственный форматированием и с форматами из ISO коллекции.

        fun temo(temp: Temporal) {
            val formattedString = when (temp) {
                is LocalDate -> {
                    temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                }
                is LocalTime -> {
                    temp.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
                }
                is LocalDateTime -> {
                    temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                }
                is OffsetTime -> {
                    temp.format(DateTimeFormatter.ofPattern("HH:mm:ss XXX"))
                }
                is OffsetDateTime -> {
                    temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss XXX"))
                }
                is ZonedDateTime -> {
                    temp.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss VV"))
                }
                is Instant -> {
                    temp.atOffset(ZoneOffset.UTC)
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss 'UTC'"))
                }
                else -> {
                    temp.toString()
                }
            }
            println(formattedString)
        }
//Создай объекты дат и / или времени которые мы изучили и по очереди передай их в метод созданный выше.
    // Не используй в них метод now()

        val date = LocalDate.of(2020, 1, 1)
        val time= LocalTime.of(8, 0, 0)
        val dateTimeNoZone = LocalDateTime.of(2020, 5, 5, 5, 5, 5)

        val offsetTime= OffsetTime.of(5, 5, 5, 5, ZoneOffset.ofHours(-5))
        val offsetDateTime = OffsetDateTime.of(2025, 1, 1, 1, 1, 1, 1, ZoneOffset.ofHours(1))

        val zoneIdMadr = ZoneId.of("Europe/Madrid")
        val zonedDateTimeBMadr = ZonedDateTime.of(2025, 1, 1, 2, 2, 2, 0, zoneIdMadr)

        val zoneIdVat = ZoneId.of("Europe/Vatican")
        val zonedDateTimeVat = ZonedDateTime.of(2020, 1, 1, 1, 5, 1, 1, zoneIdVat)

        val instant = Instant.ofEpochSecond(1689000000)

//Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года.
    // Создай форматтер, который форматирует дату в месяц и день.
        //Выведи первую отформатированную дату, прибавив к ней 10 дней.
//Выведи вторую отформатированную дату, прибавив к ней 10 дней. Найди отличия)))

        val date1 = LocalDate.of(2023, 2, 25)
        val date2 = LocalDate.of(2024, 2, 25)
        val formatter = DateTimeFormatter.ofPattern("MM-dd")
        println("${date1.plusDays(10).format(formatter)}") //03-07
        println("${date2.plusDays(10).format(formatter)}") //03-06
    }
    }