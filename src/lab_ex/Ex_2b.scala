package lab_ex

object Ex_2b {
  //ex4
  //curriedFunType
  // p1: =
  // notcurriedFunType
  // p2:  =
  //def p3(..)(..)(..):...=..
  //def p4

  //ex5: create function that implements functional compositions (fog) (x)=f(g(x))
  compose(f:Int=>Int, g:Int=>Int): Int =>Int
  compose(_-1, _*2)(5)

}
