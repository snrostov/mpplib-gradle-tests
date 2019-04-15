package sample

import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTests {
    @Test
    fun testMe() {
        assertEquals(Sample().checkMe(), 42)
    }
}