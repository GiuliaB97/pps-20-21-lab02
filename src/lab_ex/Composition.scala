package lab_ex
/*
curried and not curried fatte sulla base dell'ex di pag 27, ma non ci ho capito molto
 */
object Composition {

  //WARM UP COMPOSITION
  //def simpleComposeMethod (f:Int=>Int, g:Int=>Int, x:Int)=f(g(x))
  //val simpleComposeFunction:(Int=>Int, Int=>Int, Int)=>Int=(f,g,x)=> f(g(x))

  //ex5: create function that implements functional compositions
  def composeMethod (f:Int=>Int, g:Int=>Int): Int=>Int=x=>f(g(x))
  //val composeFunction:(Int=>Int, Int=>Int)=>Int=>Int = f=>g=>composeMethod(f, g)(x)
   //NON CHIARO COSA CI DEVO METTERE DOPO
  def composeMethodGeneric[A,B,C](f:B=>C, g:A=>B): A=>C= x=> f(g(x))
}
