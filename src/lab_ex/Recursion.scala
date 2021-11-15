package lab_ex

import scala.annotation.tailrec

object Recursion {
  def fib(n:Int): Int= n match{
    case 0 | 1 => n
    case _ => fib( n-1 ) + fib( n-2 )
  }
@tailrec
  def fib_tail(n:Int, a:Int, b:Int): Int = n match{
    case 0 => a
    case 1 => b
    case _ => fib_tail( n-1 , b, a+b)
  }
}
