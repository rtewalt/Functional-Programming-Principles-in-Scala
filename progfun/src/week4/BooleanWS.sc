package week4

object BooleanWS {
  True && True                                    //> res0: week4.MyBoolean = week4.True$@38f42ac9
  True && False                                   //> res1: week4.MyBoolean = week4.False$@72f5381f
  False && True                                   //> res2: week4.MyBoolean = week4.False$@72f5381f

  True < False                                    //> res3: week4.MyBoolean = week4.False$@72f5381f
  False < True                                    //> res4: week4.MyBoolean = week4.True$@38f42ac9
  True < True                                     //> res5: week4.MyBoolean = week4.False$@72f5381f
  False < False                                   //> res6: week4.MyBoolean = week4.False$@72f5381f

  True > False                                    //> res7: week4.MyBoolean = week4.True$@38f42ac9
  False > True                                    //> res8: week4.MyBoolean = week4.False$@72f5381f
  True > True                                     //> res9: week4.MyBoolean = week4.False$@72f5381f
  False > False                                   //> res10: week4.MyBoolean = week4.False$@72f5381f
}