package u02

import lab_ex.Composition.composeMethodGeneric
import lab_ex.Recursion.{fib, fib_tail}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestRecursion {
  @Test def testNotTailRecursion(){
    assertEquals(8,fib(6))
  }
  @Test def testTailRecursion(){
    assertEquals(8,fib_tail(6, 0, 1))
    assertEquals(fib(6), fib_tail(6, 0, 1))
  }
}
