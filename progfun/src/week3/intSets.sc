package week3

object intSets {
  val t1 = new NonEmpty(3, Empty, Empty)          //> t1  : week3.NonEmpty = {.3.}
	val t2 = new NonEmpty(4, Empty, Empty)    //> t2  : week3.NonEmpty = {.4.}
	t2 union t1 union t2                      //> res0: week3.IntSet = {{.3.}4.}
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(that :IntSet): IntSet
}

object Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  def union(that: IntSet): IntSet = that
  
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
    
  def contains(x: Int): Boolean =
  	if (x < elem) left contains x
  	else if(x > elem) right contains x
  	else true

	def union(that: IntSet): IntSet = ((left union right) union that) incl elem

	override def toString = "{" + left + elem + right + "}"
}