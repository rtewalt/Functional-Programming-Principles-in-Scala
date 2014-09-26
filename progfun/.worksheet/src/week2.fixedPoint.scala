package week2

import math.abs

object fixedPoint {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 

	val tolerance = 0.00001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(92); 
	
	def isCloseEnough(x: Double, y: Double): Boolean = {
		abs((x-y) / x) / x < tolerance
	};System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(228); 
	
	def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {
		def iterate(guess: Double): Double = {
			val next = f(guess)
			if(isCloseEnough(guess, next)) next
			else iterate(next)
		}
		
		iterate(firstGuess)
	};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(68); 
	
	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(62); 
	
	def sqrt(x: Double) = fixedPoint(averageDamp(y => x/y))(1);System.out.println("""sqrt: (x: Double)Double""");$skip(31); val res$0 = 
	
	fixedPoint(x => 1 + x/2)(1);System.out.println("""res0: Double = """ + $show(res$0));$skip(9); val res$1 = 
	sqrt(2);System.out.println("""res1: Double = """ + $show(res$1))}

}
