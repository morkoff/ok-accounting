import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun `should multiply has correct result`() {
        assertEquals(
            expected = 4.0,
            actual = multiply(val1 = 2.0, val2 = 2.0)
        )
    }
}
