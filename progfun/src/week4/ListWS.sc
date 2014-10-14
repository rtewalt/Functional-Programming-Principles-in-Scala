package week4

object ListWS {
  week4.List()                                    //> res0: week3.List[Nothing] = 
  week4.List(1)                                   //> res1: week3.List[Int] = [1]
  week4.List(1, 2)                                //> res2: week3.List[Int] = [1[2]]
  
  def isort(xs: scala.List[Int]): scala.List[Int] = xs match {
  	case scala.List() => scala.List()
  	case y :: ys => insert(y, isort(ys))
  }                                               //> isort: (xs: List[Int])List[Int]
  
  def insert(x: Int, xs: scala.List[Int]): scala.List[Int] = xs match {
  	case scala.List() => scala.List(x)
  	case y :: ys => if (x > y) y :: insert(x, ys) else x :: xs
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]
  
  isort(scala.List(2, 9, 7, 1, 2, 8))             //> res3: List[Int] = List(1, 2, 2, 7, 8, 9)
}