package ru.otus.kotlin.loadtest.kmp

import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SomeDtoTestJvm {

    @Test
    fun someDtoTest() {
        assertEquals("str", SomeDto(some = "str").some)
    }

    @Test
    fun requestTest() {
        assertTrue("Request.request must return \"JVM\"") {
            Request().request().contains("Some JVM")
        }
    }

    @Test
    fun suspendTest() = runBlocking {
        assertEquals("Suspend JVM", SuspendRequest().request())
    }
}