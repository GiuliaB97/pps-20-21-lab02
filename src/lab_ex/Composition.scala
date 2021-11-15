package lab_ex

object Composition {
  def composeMethod (f:Int=>Int, g:Int=>Int): Int=>Int=x=>f(g(x))
  
  def composeMethodGeneric[A,B,C](f:B=>C, g:A=>B): A=>C= x=> f(g(x))
}
