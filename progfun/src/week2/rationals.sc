package week2

object rationals {

  val x = new Rational(1, 3)                      //> x  : week2.Rational = 1/3
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3

  val y = new Rational(5, 7)                      //> y  : week2.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : week2.Rational = 3/2
  x + y                                           //> res2: week2.Rational = 22/21

  -x                                              //> res3: week2.Rational = -1/3

  x - y - z                                       //> res4: week2.Rational = -79/42

  y + y                                           //> res5: week2.Rational = 10/7
  x < y                                           //> res6: Boolean = true

  x max y                                         //> res7: week2.Rational = 5/7

  new Rational(3)                                 //> res8: week2.Rational = 3
  new Rational(1, 3) + new Rational(2, 3)         //> res9: week2.Rational = 1
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