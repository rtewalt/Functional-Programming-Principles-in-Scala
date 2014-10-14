package week4

object NatWS {
  val two = Zero.successor.successor              //> two  : week4.Nat = week4.Successor@7224e11c
  val five = Zero.successor.successor.successor.successor.successor
                                                  //> five  : week4.Nat = week4.Successor@2c6487a9
  val four = two - two                            //> four  : week4.Nat = week4.Zero$@7c067f03
  four.predecessor                                //> java.util.NoSuchElementException: Zero.predecessor
                                                  //| 	at week4.Zero$.predecessor(Nat.scala:13)
                                                  //| 	at week4.NatWS$$anonfun$main$1.apply$mcV$sp(week4.NatWS.scala:7)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week4.NatWS$.main(week4.NatWS.scala:3)
                                                  //| 	at week4.NatWS.main(week4.NatWS.scala)
  
}