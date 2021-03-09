package lab_ex

object NegPredicate {
  //WARM-UP PREDICATE
  def containSubstringMethod(s1: String, s2: String): Boolean = {
    if (s1.contains(s2))
      return true
    else
      return false
  }
  //println("Substring method " + containSubstringMethod("Ciao", "ia"))

  val containSubstringFunction = (s1: String, s2: String) => s1.contains(s2)
  //println("Substring function " + containSubstringFunction("Ciao", "h"))

  val emptyFunction: String=> Boolean={
    case s if(s.isEmpty) => true
    case _ => false
  }
  //println("emptyMethod " + emptyMethod("h"))

  def emptyMethod(s1: String): Boolean = s1.isEmpty
  //println("emptyMethod " + emptyMethod(""))

  val neg_sub: (String, String, (String, String) => Boolean) => Boolean = (a, b, f) => !f(a, b)
  //println("Neg containsubstring " + neg_sub("Ciao", "h", containSubstringFunction))

  val neg_empty: (String, String => Boolean) => Boolean = (a, f) => !f(a)
  //println("Neg emptyMethod " + neg_empty("", emptyMethod))


  //2b: Predicate
  val negFunction:(String => Boolean) =>String =>Boolean = predicate => !predicate(_) //HO
  def negMethod(predicate:String=>Boolean): String=>Boolean = !predicate(_)           //qui non lo devo ripetere in fondo l'ho messo tra i parametri come si chiama il metodo

  //val negFunctionGenerics[A]:(A => Boolean) =>A =>Boolean = predicate => !predicate(_) //Non funziona

  def negMethodGenerics[A](predicate:A=>Boolean): A=>Boolean = !predicate(_)

}
