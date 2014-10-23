package week5

object ListWS {

  def last[T](xs: List[T]): T = xs match {
    case Nil => throw new Error("init of Nil")
    case List(x) => x
    case x :: xs => last(xs)
  }                                               //> last: [T](xs: List[T])T

  def init[T](xs: List[T]): List[T] = xs match {
    case Nil => throw new Error("init of Nil")
    case List(x) => Nil
    case x :: xs => x :: init(xs)
  }                                               //> init: [T](xs: List[T])List[T]

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case Nil => ys
    case x :: xs => x :: concat(xs, ys)
  }                                               //> concat: [T](xs: List[T], ys: List[T])List[T]

  def reverse[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case x :: xs => concat(reverse(xs), List(x))
  }                                               //> reverse: [T](xs: List[T])List[T]

  def removeAt[T](xs: List[T], n: Int): List[T] = xs match {
    case Nil => Nil
    case y :: ys =>
      if (n == 0) ys
      else y :: removeAt(ys, n - 1)
  }                                               //> removeAt: [T](xs: List[T], n: Int)List[T]

  def removeAt2[T](xs: List[T], n: Int): List[T] = (xs take n) ::: (xs drop n + 1)
                                                  //> removeAt2: [T](xs: List[T], n: Int)List[T]

  def flatten(xs: List[Any]): List[Any] = xs match {
    case Nil => Nil
    case (x: List[Any]) :: xs => flatten(x) ::: flatten(xs)
    case x :: xs => x :: flatten(xs)
  }                                               //> flatten: (xs: List[Any])List[Any]

  def msort(xs: List[Int]): List[Int] = {
    val n = xs.size / 2

    if (n == 0)
      xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs2, y :: ys2) =>
          if (x < y) x :: merge(xs2, ys)
          else y :: merge(xs, ys2)
      }

      val (first, second) = xs splitAt n
      merge(msort(first), msort(second))
    }

  }                                               //> msort: (xs: List[Int])List[Int]

  msort(List(2, 1, 3, 8, 4, 0, -1))               //> res0: List[Int] = List(-1, 0, 1, 2, 3, 4, 8)

  flatten(List(List(1, 1), 2, List(3, List(5, 8))))
                                                  //> res1: List[Any] = List(1, 1, 2, 3, 5, 8)

  last(List(1, 2, 3, 4))                          //> res2: Int = 4

  init(List(1, 2, 3, 4))                          //> res3: List[Int] = List(1, 2, 3)

  concat(List(1, 2, 3, 4), List(4, 3, 2, 1))      //> res4: List[Int] = List(1, 2, 3, 4, 4, 3, 2, 1)

  reverse(List(1, 2, 3, 4))                       //> res5: List[Int] = List(4, 3, 2, 1)

  removeAt(List(1, 2, 3, 4), -1)                  //> res6: List[Int] = List(1, 2, 3, 4)
  removeAt(List(1, 2, 3, 4), 0)                   //> res7: List[Int] = List(2, 3, 4)
  removeAt(List(1, 2, 3, 4), 1)                   //> res8: List[Int] = List(1, 3, 4)
  removeAt(List(1, 2, 3, 4), 2)                   //> res9: List[Int] = List(1, 2, 4)
  removeAt(List(1, 2, 3, 4), 3)                   //> res10: List[Int] = List(1, 2, 3)
  removeAt(List(1, 2, 3, 4), 4)                   //> res11: List[Int] = List(1, 2, 3, 4)

  removeAt2(List(1, 2, 3, 4), -1)                 //> res12: List[Int] = List(1, 2, 3, 4)
  removeAt2(List(1, 2, 3, 4), 0)                  //> res13: List[Int] = List(2, 3, 4)
  removeAt2(List(1, 2, 3, 4), 1)                  //> res14: List[Int] = List(1, 3, 4)
  removeAt2(List(1, 2, 3, 4), 2)                  //> res15: List[Int] = List(1, 2, 4)
  removeAt2(List(1, 2, 3, 4), 3)                  //> res16: List[Int] = List(1, 2, 3)
  removeAt2(List(1, 2, 3, 4), 4)                  //> res17: List[Int] = List(1, 2, 3, 4)
}