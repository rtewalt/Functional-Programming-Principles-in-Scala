package week3

object singleton {

  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
  //> singleton: [T](elem: T)week3.Cons[T]

  singleton(1) //> res0: week3.Cons[Int] = [1]
  singleton(true) //> res1: week3.Cons[Boolean] = [true]
}