import org.junit.jupiter.api.BeforeAll
import kotlin.test.Test
import kotlin.test.assertEquals

class Junit5Test {

    companion object {
        @JvmStatic
        @BeforeAll
        fun tearUp() {
            println("before all tests")
        }
    }

    @Test
    fun junit5Test() {
        assertEquals("1", 1.toString())
    }
}