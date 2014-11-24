package zrh

import org.specs2.mutable.Specification

/**
  * Created by bibix on 24/11/14.
  */
class Problem03Test extends Specification{
   "nth" should {
     "find the Kth element of a list" in {
       Problem03.nth(2, List(1, 1, 2, 3, 5, 8)) === 2
     }
   }

 }
