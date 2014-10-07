package week4

import week3._

object List {
  def apply[T](): List[T] = new Nil
  def apply[T](x: T): List[T] = new Cons(x, new Nil)
  def apply[T](x1: T, x2: T): List[T] = new Cons(x1, new Cons(x2, new Nil))
}