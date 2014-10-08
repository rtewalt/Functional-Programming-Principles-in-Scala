package week4

object BooleanWS {
  True && True                                    //> res0: week4.Boolean = week4.True$@3d74098f
  True && False                                   //> res1: week4.Boolean = week4.False$@466155e3
  False && True                                   //> res2: week4.Boolean = week4.False$@466155e3
  
  True < False                                    //> res3: week4.Boolean = week4.False$@466155e3
  False < True                                    //> res4: week4.Boolean = week4.True$@3d74098f
  True < True                                     //> res5: week4.Boolean = week4.False$@466155e3
  False < False                                   //> res6: week4.Boolean = week4.False$@466155e3
}