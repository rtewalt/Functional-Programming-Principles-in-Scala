package week1

object sqrt {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(36); val res$0 = 
  1 + 2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(45); 
  def abs(x: Double) = if (x >= 0) x else -x;System.out.println("""abs: (x: Double)Double""");$skip(11); val res$1 = 

  abs(-1);System.out.println("""res1: Double = """ + $show(res$1));$skip(389); 

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      guessDifference(guess) / x < 0.0000001

    def guessDifference(guess: Double) =
      abs(guess * guess - x)

    def improve(guess: Double) =
      (guess + x / guess) / 2
    
    sqrtIter(1.0)
  };System.out.println("""sqrt: (x: Double)Double""")}
}

  sqrt(2)
  sqrt(4)
  sqrt(1e-6)
  sqrt(1e60)
  sqrt(0.001)
  sqrt(1e-20)
  sqrt(1e20)
  sqrt(1e50)
  
}
