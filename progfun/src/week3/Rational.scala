package week3

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