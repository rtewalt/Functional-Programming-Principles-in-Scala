package week2

object curry {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(127); 

	def sum(f: Int => Int)(a: Int, b: Int): Int = {
		if( a > b) 0
		else f(a) + sum(f) (a+1, b)
	};System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(29); val res$0 = 
	
	sum((a: Int) => a) (1, 3);System.out.println("""res0: Int = """ + $show(res$0));$skip(33); 
	def sumId = sum((a: Int) => a)_;System.out.println("""sumId: => (Int, Int) => Int""");$skip(13); val res$1 = 
	sumId(1, 3);System.out.println("""res1: Int = """ + $show(res$1));$skip(31); val res$2 = 
	sum((a: Int) => a * a) (1, 3);System.out.println("""res2: Int = """ + $show(res$2));$skip(31); val res$3 = 
	sum((a: Int) => a + 1) (1, 3);System.out.println("""res3: Int = """ + $show(res$3))}
}
