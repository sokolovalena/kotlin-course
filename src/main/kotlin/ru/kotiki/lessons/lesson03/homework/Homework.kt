package org.example.ru.kotiki.lessons.lesson03.homework

class Homework {
   // 1. Название мероприятия
    val eventName: String = "Kotiki Hackaton"

   //  2.  Дата проведения
    var evantDate: String = "11.11.2025"

    // 3. Место проведения
    var eventLocation: String = "Kotiki hall"

    // 4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
    lateinit var eventSum: String

    // 5. Количество участников (запишем буквами позже, когда будет известно)
    lateinit var eventMemberCount: String

    // 6. Длительность хакатона (пока не ясно сколько продлится)
    lateinit var eventDuration: String

    // 7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
    private var termsOfSupplier: String = "Terms"

    // 8. Текущее состояние хакатона (статус)
    var eventConditionNow: String = "not started"

    // 9. Список спонсоров
    var eventListOfSponsors: String = "Sponsors"

    // 10. Бюджет мероприятия
    private var eventSumTotal: Int = 10000

    // 11. Текущий уровень доступа к интернету
    var isNetworkAvailable: Boolean = true

    // 12. Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
    private var infoOfRecources: String = "Information"

    // 13. Количество команд
    var countCommand: Int = 10

    // 14. Перечень задач
    var listOfTasks: String = "List"

    // 15. План эвакуации
    val evacuationPlan: String = "Plan"

    // 16. Список доступного оборудования (всё, что выделено для использования на мероприятии)
    lateinit var availableEquipment: String

    // 17. Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
    private var freeEquipment: String = "free"

    // 18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
    lateinit var mealSchedule: String

    // 19. План мероприятий на случай сбоев
    private var eventPlanB: String = "plan B"

    // 20. Список экспертов и жюри
    var expertsList: String = "experts"

    // 21. Политика конфиденциальности
    val privacy: String = "privacy policy"

    // 22. Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
    private var retentions: String = "retentions"

    // 23. Текущая температура в помещении
    var temperatureNow: Double = 24.5

    // 24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
    lateinit var monitoringEquipment: String

    // 25. Регулятор скорости интернета (понижающий коэффициент, например 0.5)
    var speedNetwork: Double = 0.5

    // 26. Уровень освещения
    var lightengLevel: Double = 15.2

    // 27. Лог событий мероприятия
    var eventLog: String = "log"

    // 28. Возможность получения медицинской помощи прямо на мероприятии (да/нет)
    var firstAidAvailable: Boolean = true

    // 29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
    private var plansSafety: String = "plan safety"

    // 30. Регистрационный номер мероприятия
    val eventRegNumber: Int = 197492

    // 31. Максимально допустимый уровень шума в помещении хакатона.
    val levelOfNoise: Double = 11.0

    // 32. Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
    private var levelOfNoiseNow: Boolean = false

    // 33. План взаимодействия с прессой
    private var planOfPress: String = "plan press"

    //34. Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
    lateinit var detailsResults: String

    //35. Статус получения всех необходимых разрешений для проведения мероприятия
    private var isAvailablePermissions: Boolean = true

    //36. Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
    private var isAvailableEquipment: Boolean = true

    //37. Список партнеров мероприятия
    var listOfPartners: String = ""

    //38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
    lateinit var detailsReport: String

    //39. Внутренние правила распределения призов
    private val distributionsOfPrizes: String = "prizes"

    //40. Список разыгрываемых призов
    var prizesList: String = "priiiizes"

    //41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
    private val contactsOfEmergency: String = "prizes"

    //42. Особые условия для участников с ограниченными возможностями
    var specialConditions:String = "special conditions"

    //43. Общее настроение участников (определяется опросами)
    lateinit var generalMoodMembers: String

    //44. Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
    lateinit var detailsPlanOfEvent: String

    //45. Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
    lateinit var eventGuest: String

    //46. Максимальное количество людей, которое может вместить место проведения.
    val maxCountOfMembers: Int = 1000

    //47. Количество часов, отведенное каждой команде для работы над проектом.
    var maxHoursForWork: Double = 1.5
}