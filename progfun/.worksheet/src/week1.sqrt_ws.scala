package week1

object sqrt_ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(39); val res$0 = 
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
  };System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$2 = 

  sqrt(2);System.out.println("""res2: Double = """ + $show(res$2));$skip(10); val res$3 = 
  sqrt(4);System.out.println("""res3: Double = """ + $show(res$3));$skip(13); val res$4 = 
  sqrt(1e-6);System.out.println("""res4: Double = """ + $show(res$4));$skip(13); val res$5 = 
  sqrt(1e60);System.out.println("""res5: Double = """ + $show(res$5));$skip(14); val res$6 = 
  sqrt(0.001);System.out.println("""res6: Double = """ + $show(res$6));$skip(14); val res$7 = 
  sqrt(1e-20);System.out.println("""res7: Double = """ + $show(res$7));$skip(13); val res$8 = 
  sqrt(1e20);System.out.println("""res8: Double = """ + $show(res$8));$skip(13); val res$9 = 
  sqrt(1e50);System.out.println("""res9: Double = """ + $show(res$9))}
  
}
