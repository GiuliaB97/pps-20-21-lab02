package u02

import lab_ex.Currying.{p1, p2, p3, p4}
import lab_ex.Parity.parityMethod
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertNotEquals, assertTrue}
import org.junit.jupiter.api.Test
import u02.DefinedFunctions.factorial

import java.lang.module.ModuleFinder.compose

class TestComposition {
  @Test def testComposeMethod(){
    val sum= (val1:Int, val2:Int)=> val1+val2
    val pow= (val1:Int)=> val1*val1
    assertEquals(4, compose(pow(sum(1+1))))
    assertNotEquals(5, compose(pow(sum(1+1)))
  }
}
