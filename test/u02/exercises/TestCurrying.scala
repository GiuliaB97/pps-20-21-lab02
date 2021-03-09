package u02.exercises

import lab_ex.Currying.{p1, p2, p3, p4}
import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test

class TestCurrying {
  @Test def testNoCurringFunction(){
    assertTrue(p1(3,4,5))
    assertFalse(p1(5, 6, 4))
  }
  @Test def testCurringFunction(){
    assertTrue(p2(3)(4)(5))
    assertFalse(p2(5)(6)(4))
  }
  @Test def testNoCurringMethod(){
    assertTrue(p3(3,4,5))
    assertFalse(p3(5, 6, 4))
  }
  @Test def testCurringMethod(){
    assertTrue(p4(3)(4)(5))
    assertFalse(p4(5)(6)(4))
  }
}
