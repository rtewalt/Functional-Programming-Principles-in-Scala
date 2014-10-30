package week6

object nqueens {

  def queens(n: Int): Set[List[Int]] = {
    def isSafe(column: Int, queens: List[Int]): Boolean = {
      val row = queens.size
      val queenPlacements = (row - 1 to 0 by -1) zip queens

      queenPlacements forall {
        case (r, c) =>
          val rowDiff = row - r
          val colDiff = math.abs(c - column)
          colDiff != 0 && colDiff != rowDiff
      }
    }

    def placeQueens(k: Int): Set[List[Int]] = {
      if (k == 0) Set(List())
      else
        for {
          a <- placeQueens(k - 1)
          c <- (0 until n)
          if isSafe(c, a)
        } yield c :: a
    }
    placeQueens(n)
  }                                               //> queens: (n: Int)Set[List[Int]]
  
  def show(solution: List[Int]) = {
  	val lines =
  	for(col <- solution.reverse)
  	yield Vector.fill(solution.size)("* ").updated(col, "X ").mkString
  	"\n" + (lines mkString "\n")
  }                                               //> show: (solution: List[Int])String

  queens(8) take 3 map show mkString "\n"         //> res0: String = "
                                                  //| * * * * * X * * 
                                                  //| * * * X * * * * 
                                                  //| * X * * * * * * 
                                                  //| * * * * * * * X 
                                                  //| * * * * X * * * 
                                                  //| * * * * * * X * 
                                                  //| X * * * * * * * 
                                                  //| * * X * * * * * 
                                                  //| 
                                                  //| * * * * X * * * 
                                                  //| * * * * * * X * 
                                                  //| * X * * * * * * 
                                                  //| * * * X * * * * 
                                                  //| * * * * * * * X 
                                                  //| X * * * * * * * 
                                                  //| * * X * * * * * 
                                                  //| * * * * * X * * 
                                                  //| 
                                                  //| * * * * * X * * 
                                                  //| * * X * * * * * 
                                                  //| * * * * * * X * 
                                                  //| * * * X * * * * 
                                                  //| X * * * * * * * 
                                                  //| * * * * * * * X 
                                                  //| * X * * * * * * 
                                                  //| * * * * X * * * "

}