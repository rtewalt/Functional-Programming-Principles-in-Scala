import week3.{ Rational }

object scratch {
  new Rational(1, 2)                              //> res0: week3.Rational = 1/2

  def error(message: String) = throw new Error(message)
                                                  //> error: (message: String)Nothing

  val x = null                                    //> x  : Null = null
  
  val y:String = x                                //> y  : String = null
  
  if(true) 1 else false                           //> res1: AnyVal = 1
}