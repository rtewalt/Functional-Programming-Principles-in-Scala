package week3

object nth {

  val l1 = new Cons(2, new Cons(3, new Cons(1, new Nil)))
                                                  //> l1  : week3.Cons[Int] = [2[3[1]]]
  
  def nth[T](x: Int, xs: List[T]): T =
  	if(xs.isEmpty) throw new IndexOutOfBoundsException
  	else if(x == 0) xs.head
  	else nth(x - 1, xs.tail)                  //> nth: [T](x: Int, xs: week3.List[T])T

	nth(0, l1)                                //> res0: Int = 2
	nth(1, l1)                                //> res1: Int = 3
	nth(2, l1)                                //> res2: Int = 1
	nth(3, l1)                                //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week3.nth$$anonfun$main$1.nth$1(week3.nth.scala:8)
                                                  //| 	at week3.nth$$anonfun$main$1.apply$mcV$sp(week3.nth.scala:15)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.nth$.main(week3.nth.scala:3)
                                                  //| 	at week3.nth.main(week3.nth.scala)
}