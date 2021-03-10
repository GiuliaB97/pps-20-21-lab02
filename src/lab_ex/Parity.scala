package lab_ex

object Parity {
  //WARM-UPEVEN ODD (Integer->Boolean)
  //def evenTypesMethod(d1: Integer): Boolean = d1 % 2 == 0
  //println("Even types method " + evenTypesMethod(7))

  //def oddTypesMethod(d1: Integer): Boolean = !evenTypesMethod(d1)
  //println("Odd types method " + oddTypesMethod(2))

  //val evenTypesFunction = (x: Int) => x % 2 == 0
  //println("Even types function " + evenTypesFunction(2))
  //val oddTypesFunction = (x: Int) => !evenTypesFunction(x)
  //println("Odd types function " + evenTypesFunction(2))


  //2A: EVEN-ODD (Integer->String)
  //val input: Integer = 3;
  val parityFunction: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }
  //println("Parity function, value: " + input + ", is: " + parityFunction(input))

  def parityMethod(n: Int): String = n match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }
  //println("Parity Method, value: " + input + ", is: " + parityFunction(input))

}
