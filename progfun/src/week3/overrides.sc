package week3

object overrides {
	new Sub().foo                             //> res0: Int = 2
	new Sub().bar                             //> res1: Int = 3
}

abstract class Base {
  def foo = 1
  def bar: Int
}

class Sub extends Base {
	override def foo = 2
	def bar = 3
}