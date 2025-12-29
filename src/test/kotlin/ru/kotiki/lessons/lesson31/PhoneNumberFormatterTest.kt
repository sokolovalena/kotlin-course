import org.example.ru.kotiki.lessons.lesson31.homeworks.PhoneNumberFormatter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource

class PhoneNumberFormatterTest {

    private lateinit var formatter: PhoneNumberFormatter

    @BeforeEach
    fun setUp() {
        formatter = PhoneNumberFormatter()
    }

    @ParameterizedTest(name = "Вход: \"{0}\", Ожидается: \"{1}\"")
    @CsvSource(value = [
        "8 (922) 941-11-11, +7 (922) 941-11-11",
        "79229411111, +7 (922) 941-11-11",
        "+7 922 941 11 11, +7 (922) 941-11-11",
        "9229411111, +7 (922) 941-11-11",
        "abc +7 922 941 11 11, +7 (922) 941-11-11",
        "   (922) 941-11-11, +7 (922) 941-11-11",
        "  89229411111  , +7 (922) 941-11-11",
        "7-922-941-11-11, +7 (922) 941-11-11",
        "89229411111, +7 (922) 941-11-11"
    ])
    fun `should format valid`(input: String, expected: String) {
        assertEquals(expected, formatter.formatPhoneNumber(input))
    }

    @ParameterizedTest(name = "Вход: \"{0}\"")
    @MethodSource("invalidPhoneNumbers")
    fun `should throw Exception for invalid `(input: String) {
        assertThrows(IllegalArgumentException::class.java) {
            formatter.formatPhoneNumber(input)
        }
    }

    companion object {
        @JvmStatic
        fun invalidPhoneNumbers(): List<String> {
            return listOf(
                "12345",
                "+1 (234) 567-89-11",
                "911141111",
                "123456789012",
                "",
                "stroka",
                "11111111111",
                "09111111111"
            )
        }
    }
}