package lab_ex
/*
curried and not curried fatte sulla base dell'ex di pag 27, ma non ci ho capito molto
 */
object Ex2bFunction {
  //ex4
  //WARM-UP SUM ELEMENTS: RETURN RESULT
  val simpleNoCurryingFunction:(Int, Int)=>Int=(x,y)=> x+y
  def simpleNoCurryingMethod(x:Int, y:Int )= simpleNoCurryingFunction(x,y)
  val simpleCurryingFunction: Int => Int=> Int = x=>y=>simpleNoCurryingFunction(x,y)
  def simpleCurryingMethod(x:Int)=(y:Int)=> simpleNoCurryingFunction(x,y)

  //NotcurriedFunType
  val p1:(Int, Int, Int)=>Boolean = (x,y,z)=> (x<=y)&&(y<=z)
  // CurriedFunType
  val p2: Int=>Int=>Int=>Boolean = x=>y=>z=> p1(x,y,z)
  //notCurried
  def p3(x:Int,y:Int,z:Int)= p1(x,y,z)
  //Curried
  def p4(x:Int) (y:Int) (z:Int): Boolean =p1(x,y,z)


  //WARM UP COMPOSITION
  def simpleComposeMethod (f:Int=>Int, g:Int=>Int, x:Int)=f(g(x))
  val simpleComposeFunction:(Int=>Int, Int=>Int, Int)=>Int=(f,g,x)=> f(g(x))

  //ex5: create function that implements functional compositions
  def composeMethod (f:Int=>Int, g:Int=>Int): Int=>Int=x=>f(g(x))
  //val composeFunction:(Int=>Int, Int=>Int)=>Int=>Int = f=>g=>composeMethod(f, g)(x)
   //NON CHIARO COSA CI DEVO METTERE DOPO
  def composeMethodGeneric[A,B,C](f:B=>C, g:A=>B): A=>C= x=> f(g(x))


}
