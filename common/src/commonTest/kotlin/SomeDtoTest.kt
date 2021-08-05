import ru.otus.kotlin.loadtest.kmp.Request
import ru.otus.kotlin.loadtest.kmp.SomeDto
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SomeDtoTest {

    @Test
    fun someDtoTest() {
        assertEquals("str", SomeDto(some = "str").some)
    }

    @Test
    fun requestTest() {
        assertTrue("Request.request must return \"true\"") {
            Request().request().contains("Some")
        }
    }

    @Test
    fun suspendTest() {

    }
}