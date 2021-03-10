package u02.lab_ex

import lab_ex.NegPredicate.{emptyFunction, negFunction, negMethod, negMethodGenerics}
import org.junit.jupiter.api.Assertions.{assertFalse, assertTrue}
import org.junit.jupiter.api.Test

class TestNegPredicate {
  @Test def testNegFunction(){
    val notEmpty=negFunction(emptyFunction)
    assertTrue(notEmpty("abc"))
    assertFalse(notEmpty(""))
  }

  @Test def testNegMethod(){
    val notEmpty=negMethod(emptyFunction)
    assertTrue(notEmpty("abc"))
    assertFalse(notEmpty(""))
  }

  @Test def testNegMethodGenerics(){
    val notEmpty=negMethodGenerics(emptyFunction)
    assertTrue(notEmpty("abc"))
    assertFalse(notEmpty(""))
  }
}
