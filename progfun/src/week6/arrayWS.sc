package week6

object arrayWS {
  val xs = Array(1, 2, 3)                         //> xs  : Array[Int] = Array(1, 2, 3)
  xs map (x => x * 2)                             //> res0: Array[Int] = Array(2, 4, 6)

  val s = "HelloWorld"                            //> s  : String = HelloWorld
  s filter (c => c.isUpper)                       //> res1: String = HW

  s exists (c => c.isUpper)                       //> res2: Boolean = true
  s forall (c => c.isUpper)                       //> res3: Boolean = false

  val pairs = xs zip s                            //> pairs  : Array[(Int, Char)] = Array((1,H), (2,e), (3,l))
  pairs unzip                                     //> res4: (scala.collection.mutable.IndexedSeq[Int], scala.collection.mutable.In
                                                  //| dexedSeq[Char]) = (ArrayBuffer(1, 2, 3),ArrayBuffer(H, e, l))

  s flatMap (c => List(c, c, c))                  //> res5: String = HHHeeelllllloooWWWooorrrlllddd
  def permutate[X, Y](xs: Seq[X], ys: Seq[Y]): Seq[Pair[X, Y]] = {
    xs flatMap (x => ys map (y => (x, y)))
  }                                               //> permutate: [X, Y](xs: Seq[X], ys: Seq[Y])Seq[(X, Y)]

  permutate((1 to 10), (20 to 1 by -1))           //> res6: Seq[(Int, Int)] = Vector((1,20), (1,19), (1,18), (1,17), (1,16), (1,15
                                                  //| ), (1,14), (1,13), (1,12), (1,11), (1,10), (1,9), (1,8), (1,7), (1,6), (1,5)
                                                  //| , (1,4), (1,3), (1,2), (1,1), (2,20), (2,19), (2,18), (2,17), (2,16), (2,15)
                                                  //| , (2,14), (2,13), (2,12), (2,11), (2,10), (2,9), (2,8), (2,7), (2,6), (2,5),
                                                  //|  (2,4), (2,3), (2,2), (2,1), (3,20), (3,19), (3,18), (3,17), (3,16), (3,15),
                                                  //|  (3,14), (3,13), (3,12), (3,11), (3,10), (3,9), (3,8), (3,7), (3,6), (3,5), 
                                                  //| (3,4), (3,3), (3,2), (3,1), (4,20), (4,19), (4,18), (4,17), (4,16), (4,15), 
                                                  //| (4,14), (4,13), (4,12), (4,11), (4,10), (4,9), (4,8), (4,7), (4,6), (4,5), (
                                                  //| 4,4), (4,3), (4,2), (4,1), (5,20), (5,19), (5,18), (5,17), (5,16), (5,15), (
                                                  //| 5,14), (5,13), (5,12), (5,11), (5,10), (5,9), (5,8), (5,7), (5,6), (5,5), (5
                                                  //| ,4), (5,3), (5,2), (5,1), (6,20), (6,19), (6,18), (6,17), (6,16), (6,15), (6
                                                  //| ,14), (6,13), (6,12), (6,11), (6,10), (6,9), (6,8), (6,7), (6,6), (6,5), (6,
                                                  //| 4), (6,3), (6,2), (6,1),
                                                  //| Output exceeds cutoff limit.

  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys).map { case (x, y) => x * y }.sum  //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double

  scalarProduct(Vector(1, 2, 3), Vector(1, 2, 3)) //> res7: Double = 14.0

  def isPrime(n: Int): Boolean = (2 until n).forall(i => n % i != 0)
                                                  //> isPrime: (n: Int)Boolean

  (1 to 100) filter (isPrime(_))                  //> res8: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 5, 7, 11,
                                                  //|  13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                                                  //|  97)

}