package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r) throw new IllegalArgumentException()

    if (c == 0 || c == r) 1
    else pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def calculateParenRollingSum(workingChars: List[Char], previousSum: Int): Int =
      if (previousSum < 0 || workingChars.isEmpty) previousSum
      else if (workingChars.head == '(') calculateParenRollingSum(workingChars.tail, previousSum + 1)
      else if (workingChars.head == ')') calculateParenRollingSum(workingChars.tail, previousSum - 1)
      else calculateParenRollingSum(workingChars.tail, previousSum)

    calculateParenRollingSum(chars, 0) == 0
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def countDescendants(accum: Int, lastCoinTried: Int): Int =
      if(coins.isEmpty || accum > money) 0
      else if (accum == money) 1
      else loopAndCountChildren(accum, lastCoinTried, coins)

    def loopAndCountChildren(accum: Int, lastCoinTried: Int, coinsLeftToTry: List[Int]): Int =
      if (coinsLeftToTry.isEmpty) 0
      else if(coinsLeftToTry.head < lastCoinTried) loopAndCountChildren(accum, lastCoinTried, coinsLeftToTry.tail)
      else countDescendants(accum + coinsLeftToTry.head, coinsLeftToTry.head) + loopAndCountChildren(accum, lastCoinTried, coinsLeftToTry.tail)

    loopAndCountChildren(0, 0, coins)
  }
}
