package u02

import lab_ex.Parity.{parityFunction, parityMethod}
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test

class TestParity {
  @Test def testParityFunction(){
    assertEquals("even", parityFunction(4))
    assertEquals("odd", parityFunction(5))
  }

  @Test def testParityMethod(){
    assertEquals("even", parityMethod(4))
    assertEquals("odd", parityMethod(5))
  }
}
