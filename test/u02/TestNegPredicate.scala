package u02

import lab_ex.NegPredicate.{containSubstringMethod, emptyFunction, negFunction, negMethod, negMethodGenerics}
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
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
