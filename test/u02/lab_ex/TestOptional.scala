package u02.lab_ex

import org.junit.jupiter.api.Assertions.{assertEquals, assertNotEquals}
import org.junit.jupiter.api.Test

class TestOptional {
  import lab_ex.Optional._
  import lab_ex.Optional.Option._

  @Test def testFilter(){
    val isEmpty:(String)=>Boolean={
      case ""=> true
      case _=> false
    }
    assertEquals(Some(3), filter[Int](Some(3))(_<5))
    assertEquals(None(), filter[String](Some("string"))(isEmpty))
  }
  @Test def testMap(){
    val isEmpty:(String)=>Boolean={
      case "" => true
      case _ => false
    }
    val binaryToString:(Int)=>String={
      case 1 => "one"
      case 0 => "zero"
      case _=> ""
    }

    assertEquals(Some(false), map[String, Boolean](Some("string"))(isEmpty))
    assertEquals(Some("one"), map[Int, String](Some(1))(binaryToString))
  }
  @Test def testMap2(){
    val s1: Option[Int] = Some(1)
    val string1: String= "aaa"
    val s2: Option[String] = Some(string1)
    val string2: String= ""
    val s3: Option[String] = Some(string2)

    assertNotEquals(None(), map2[String, String, String](s2)(s3)(_+_))
    assertEquals(Some(6), map2[Int, Int, Int](Some(2))(Some(4))(_+_))
  }
}
