package u02.exercises

import lab_ex.Composition.composeMethodGeneric
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

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
