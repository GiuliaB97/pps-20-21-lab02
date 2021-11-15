package lab_ex

object Parity {
  val parityFunction: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }
  //val input: Integer = 3;
  //println("Parity function, value: " + input + ", is: " + parityFunction(input))

  def parityMethod(n: Int): String = n match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }
  //println("Parity Method, value: " + input + ", is: " + parityFunction(input))

}
