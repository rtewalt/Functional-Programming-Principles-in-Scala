package week4

object ExprWS {
  Sum(Sum(Number(1), Sum(Number(3), Number(4))), Number(2)).show
                                                  //> res0: String = 1 + 3 + 4 + 2
  Sum(Prod(Number(1), Var("x")), Var("y")).show   //> res1: String = 1 * x + y
  Prod(Sum(Number(1), Var("x")), Var("y")).show   //> res2: String = (1 + x) * y
  Prod(
  	Var("y"),
  	Sum(Number(1), Var("x"))
  ).show                                          //> res3: String = y * (1 + x)
   Prod(
  	Sum(Var("y"), Number(2)),
  	Sum(Number(1), Var("x"))
  ).show                                          //> res4: String = (y + 2) * (1 + x)
}