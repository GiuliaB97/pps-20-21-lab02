package u02

import lab_ex.Composition.{composeMethod, composeMethodGeneric}
import lab_ex.Currying.{p1, p2, p3, p4}
import lab_ex.Parity.parityMethod
import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertNotEquals, assertTrue}
import org.junit.jupiter.api.Test
import u02.DefinedFunctions.factorial

import java.lang.module.ModuleFinder.compose

class TestComposition {
  @Test def testComposeMethod(){
    val f: Int => Int = {
      case n if(n>0) => n*n
      case _ => 1
    }
    val g: Int=>Int = {
      case n if(n>0) => n+n
      case _ => 1
    }

    val booleanToIntegerFunction=composeMethodGeneric(f,g)
    assertEquals(4,booleanToIntegerFunction(1))
    assertEquals(100,booleanToIntegerFunction(5))
  }

  @Test def testComposeGenericMethod(){
    val f: String => Int = {
      case "true" => 1
      case _ => 0
    }
    val g: Boolean=>String = {
      case true => "true"
      case _ => "false"
    }

    val booleanToIntegerFunction=composeMethodGeneric(f,g)
    assertEquals(1,booleanToIntegerFunction(true))
    assertEquals(0,booleanToIntegerFunction(false))
  }
}
