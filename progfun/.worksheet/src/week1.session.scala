package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(39); val res$0 = 
  1 + 2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(13); val res$1 = 
  1 until 10;System.out.println("""res1: scala.collection.immutable.Range = """ + $show(res$1));$skip(172); 
  
  def factorial(x: Int): Int = {
  	
  	def loop(accum: Int, next:Int): Int = {
  		if(next == 0) accum
  		else loop(accum * next, next - 1)
  	}
  	
  	loop(1, x)
  };System.out.println("""factorial: (x: Int)Int""");$skip(18); val res$2 = 
  
  factorial(4);System.out.println("""res2: Int = """ + $show(res$2))}
}
