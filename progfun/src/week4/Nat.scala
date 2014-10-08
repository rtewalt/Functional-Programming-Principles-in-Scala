package week4

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Successor(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

object Zero extends Nat {
  def isZero: Boolean = true
  def predecessor: Nat = throw new NoSuchElementException("Zero.predecessor")
  def +(that: Nat): Nat = that
  def -(that: Nat): Nat = 
    if (that.isZero) this
    else throw new UnsupportedOperationException("Zero.-")
}

class Successor(n: Nat) extends Nat {
  def isZero: Boolean = false
  def predecessor: Nat = n
  def +(that: Nat): Nat = new Successor(n + that)
  def -(that: Nat): Nat =
    if (that.isZero) this
    else n - that.predecessor
}