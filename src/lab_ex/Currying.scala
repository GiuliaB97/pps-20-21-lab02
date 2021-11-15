package lab_ex

object Currying {

  //NotcurriedFunType
  val p1:(Int, Int, Int)=>Boolean = (x,y,z)=> (x<=y)&&(y<=z)
  // CurriedFunType
  val p2: Int=>Int=>Int=>Boolean = x=>y=>z=> p1(x,y,z)
  //notCurried
  def p3(x:Int,y:Int,z:Int)= p1(x,y,z)
  //Curried
  def p4(x:Int) (y:Int) (z:Int): Boolean =p1(x,y,z)

}
