package zrh

import org.specs2.mutable.Specification

/**
 * Created by bibix on 24/11/14.
 */
class Problem01Test extends Specification {
  "last" should {
    "find last element of the list" in {
      Problem01.last(List(1, 1, 2, 3, 5, 8)) === 8
    }
  }
}
