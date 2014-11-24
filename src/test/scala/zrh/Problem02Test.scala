package zrh

import org.specs2.mutable.Specification

/**
 * Created by bibix on 24/11/14.
 */
class Problem02Test extends Specification{
  "penultimate" should {
    "find last but one element of the list" in {
      Problem02.penultimate(List(1, 1, 2, 3, 5, 8)) === 5
    }
  }

}
