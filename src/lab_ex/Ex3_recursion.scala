package lab_ex

import scala.annotation.tailrec

object Ex3_recursion {
  //ricorsione NOT tail
  def fib(n:Int): Int={
    case 0 | 1 => n
    case _ => fib( n-1 ) + fib( n-2 )
  }
@tailrec
  def fib_tail(n:Int, a:Int, b:Int): Int = n match{
    case 0 | 1 => n
    case _ => fib_tail( n-1 , a, a+b)
  }

  //fib_tail (n, 0, 1)
}
