package week4

abstract class MyBoolean {
  def ifThenElse[T](t: => T, e: => T): T

  def && (x: MyBoolean): MyBoolean = ifThenElse(x, False)
  def || (x: MyBoolean): MyBoolean = ifThenElse(True, x)
  def unary_! : MyBoolean = ifThenElse(False, True)
  
  def == (x: MyBoolean): MyBoolean = ifThenElse(x, !x)
  def != (x: MyBoolean): MyBoolean = ifThenElse(!x, x)

  def < (x: MyBoolean): MyBoolean = ifThenElse(False, x)
  def > (x: MyBoolean): MyBoolean = ifThenElse(!x, False)
}

object True extends MyBoolean {
  def ifThenElse[T](t: => T, e: => T): T = t
}

object False extends MyBoolean {
  def ifThenElse[T](t: => T, e: => T): T = e
}