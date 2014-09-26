package week2

import math.abs

object fixedPoint {

	val tolerance = 0.00001                   //> tolerance  : Double = 1.0E-5
	
	def isCloseEnough(x: Double, y: Double): Boolean = {
		abs((x-y) / x) / x < tolerance
	}                                         //> isCloseEnough: (x: Double, y: Double)Boolean
	
	def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {
		def iterate(guess: Double): Double = {
			val next = f(guess)
			if(isCloseEnough(guess, next)) next
			else iterate(next)
		}
		
		iterate(firstGuess)
	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
	
	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
	
	def sqrt(x: Double) = fixedPoint(averageDamp(y => x/y))(1)
                                                  //> sqrt: (x: Double)Double
	
	fixedPoint(x => 1 + x/2)(1)               //> res0: Double = 1.999969482421875
	sqrt(2)                                   //> res1: Double = 1.4142135623746899

}