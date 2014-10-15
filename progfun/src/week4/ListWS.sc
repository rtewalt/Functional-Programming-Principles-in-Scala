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
  
 	def init[T](xs: scala.List[T]): scala.List[T] = xs match {
 		case scala.List() => throw new Error("init of empty list")
 		case scala.List(x) => scala.List()
 		case y :: ys => y :: init(ys)
 	}                                         //> init: [T](xs: List[T])List[T]
 	
 	def removeAt[T](n: Int, xs: scala.List[T]): List[T] = xs.take(n) ::: xs.drop(n+1)
                                                  //> removeAt: [T](n: Int, xs: List[T])List[T]
                                                  
	def flatten(xs: scala.List[Any]): scala.List[Any] = xs match {
		case scala.List() => scala.List()
		case (l: List[Any]) :: ys => flatten(l) ::: flatten(ys)
		case y :: ys => y :: flatten(ys)
	}                                         //> flatten: (xs: List[Any])List[Any]
	
	
	flatten(scala.List(1, 1))                 //> res4: List[Any] = List(1, 1)
	flatten(scala.List(scala.List(1, 1)))     //> res5: List[Any] = List(1, 1)
	flatten(scala.List(scala.List(1, 1), 2, scala.List(3, scala.List(5, 8))))
                                                  //> res6: List[Any] = List(1, 1, 2, 3, 5, 8)
 	
 	removeAt(4, scala.List('a', 'b', 'c', 'd'))
                                                  //> res7: List[Char] = List(a, b, c, d)
 	removeAt(1, scala.List('a', 'b', 'c', 'd'))
                                                  //> res8: List[Char] = List(a, c, d)
 	removeAt(0, scala.List('a', 'b', 'c', 'd'))
                                                  //> res9: List[Char] = List(b, c, d)
 	removeAt(3, scala.List('a', 'b', 'c', 'd'))
                                                  //> res10: List[Char] = List(a, b, c)
  
 
 	init(scala.List(1, 2, 3, 4))              //> res11: List[Int] = List(1, 2, 3)
 	init(scala.List(1))                       //> res12: List[Int] = List()
 	init(scala.List())                        //> java.lang.Error: init of empty list
                                                  //| 	at week4.ListWS$$anonfun$main$1.init$1(week4.ListWS.scala:21)
                                                  //| 	at week4.ListWS$$anonfun$main$1.apply$mcV$sp(week4.ListWS.scala:47)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week4.ListWS$.main(week4.ListWS.scala:3)
                                                  //| 	at week4.ListWS.main(week4.ListWS.scala)
}