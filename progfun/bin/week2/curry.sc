package week2

object curry {

	def sum(f: Int => Int)(a: Int, b: Int): Int = {
		if( a > b) 0
		else f(a) + sum(f) (a+1, b)
	}                                         //> sum: (f: Int => Int)(a: Int, b: Int)Int
	
	sum((a: Int) => a) (1, 3)                 //> res0: Int = 6
	def sumId = sum((a: Int) => a)_           //> sumId: => (Int, Int) => Int
	sumId(1, 3)                               //> res1: Int = 6
	sum((a: Int) => a * a) (1, 3)             //> res2: Int = 14
	sum((a: Int) => a + 1) (1, 3)             //> res3: Int = 9
}