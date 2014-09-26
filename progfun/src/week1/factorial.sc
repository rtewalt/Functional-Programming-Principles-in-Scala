package week1

object session {
  1 + 2                                           //> res0: Int(3) = 3
  1 until 10                                      //> res1: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
  
  def factorial(x: Int): Int = {
  	
  	def loop(accum: Int, next:Int): Int = {
  		if(next == 0) accum
  		else loop(accum * next, next - 1)
  	}
  	
  	loop(1, x)
  }                                               //> factorial: (x: Int)Int
  
  factorial(4)                                    //> res2: Int = 24
}