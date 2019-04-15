package sample.a

import sample.hello
import kotlin.test.Test
import kotlin.test.assertTrue

class DeepPackageTest {
    @Test
    fun testHello() {
        assertTrue("JS1" in hello())
    }

    class Inner {
        @Test
        fun testHello() {
            assertTrue("JS1" in hello())
        }
    }
}