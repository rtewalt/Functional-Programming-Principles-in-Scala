package week2

object sum {

	def sum(f: Int => Int, a: Int, b: Int) = {
		def loop(a: Int, acc: Int): Int = {
			if(a > b) acc
			else loop(a+1, acc+f(a))
		}
		
		loop(a, 0)
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
	
	sum((a: Int) => a, 1, 3)                  //> res0: Int = 6
	sum((a: Int) => a * a, 1, 3)              //> res1: Int = 14
	sum((a: Int) => a + 1, 1, 3)              //> res2: Int = 9
}