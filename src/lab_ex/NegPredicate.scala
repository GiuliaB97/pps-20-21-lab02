package lab_ex

object NegPredicate {

  //2b: Predicate
  val negFunction:(String => Boolean) =>String =>Boolean = predicate => !predicate(_) //HO
  
  def negMethod(predicate:String=>Boolean): String=>Boolean = !predicate(_)          
  
  def negMethodGenerics[A](predicate:A=>Boolean): A=>Boolean = !predicate(_)

}
