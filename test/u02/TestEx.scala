package u02

import lab_ex.Ex_2A
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import Ex_2A.parityMethod

class TestEx {
  @Test def testNeg(){
    assertEquals("even", parityMethod(4))
    assertEquals("odd", parityMethod(5))
  }

/*
  @Test def TestNonEmpty(){
    assertFalse(empty(""))
    assertTrue("a")
  }

 */
}
