package week2

object sum {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(178); 

	def sum(f: Int => Int, a: Int, b: Int) = {
		def loop(a: Int, acc: Int): Int = {
			if(a > b) acc
			else loop(a+1, acc+f(a))
		}
		
		loop(a, 0)
	};System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(28); val res$0 = 
	
	sum((a: Int) => a, 1, 3);System.out.println("""res0: Int = """ + $show(res$0));$skip(30); val res$1 = 
	sum((a: Int) => a * a, 1, 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(30); val res$2 = 
	sum((a: Int) => a + 1, 1, 3);System.out.println("""res2: Int = """ + $show(res$2))}
}
