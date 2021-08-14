package ru.otus.kotlin.loadtest.kmp

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SomeDtoTestJs {

    @Test
    fun someDtoTest() {
        assertEquals("str", SomeDto(some = "str").some)
    }

    @Test
    fun requestTest() {
        assertTrue("Request.request must return \"JS\"") {
            Request().request().contains("Some JS")
        }
    }
}