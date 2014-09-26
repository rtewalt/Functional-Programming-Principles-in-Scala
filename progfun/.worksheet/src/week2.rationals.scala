package week2

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 

  val x = new Rational(1, 3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 

  val y = new Rational(5, 7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(8); val res$2 = 
  x + y;System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(6); val res$3 = 

  -x;System.out.println("""res3: week2.Rational = """ + $show(res$3));$skip(13); val res$4 = 

  x - y - z;System.out.println("""res4: week2.Rational = """ + $show(res$4));$skip(9); val res$5 = 

  y + y;System.out.println("""res5: week2.Rational = """ + $show(res$5));$skip(8); val res$6 = 
  x < y;System.out.println("""res6: Boolean = """ + $show(res$6));$skip(11); val res$7 = 

  x max y;System.out.println("""res7: week2.Rational = """ + $show(res$7));$skip(19); val res$8 = 

  new Rational(3);System.out.println("""res8: week2.Rational = """ + $show(res$8));$skip(42); val res$9 = 
  new Rational(1, 3) + new Rational(2, 3);System.out.println("""res9: week2.Rational = """ + $show(res$9))}
}

class Rational(n: Int, d: Int) {

  require(d != 0, "denominator must be non-zero")

  def this(n: Int) = this(n, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private def abs(x: Int): Int = if (x < 0) -x else x

  private val g = gcd(abs(n), abs(d))

  def numer = n / g
  def denom = d / g

  def < (that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def unary_- : Rational = new Rational(-numer, denom)

  def - (that: Rational): Rational = this + -that

  override def toString = if (denom == 1) numer.toString else numer + "/" + denom
}
