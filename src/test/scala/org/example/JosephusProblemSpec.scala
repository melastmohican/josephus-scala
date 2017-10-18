package org.example

import org.specs2.mutable._

/**
  * Make sure your tests cover the following scenarios
  * Invalid parameters
  * What happens if n = k?
  * What happens if n = 3 and k = 2?
  * What happens if n is very large, but k=2?
  * Choose a couple of other cases to test
  **/
class JosephusProblemSpec extends Specification {
  "JosephusProblem specification" >> {
    "Invalid parameters" >> {
      JosephusProblem.josephus(0, 0) must throwA[IllegalArgumentException]
    }
    "Wrong k" >> {
      JosephusProblem.josephus(10, 0) must throwA[IllegalArgumentException]
    }
    "k > n" >> {
      JosephusProblem.josephus(2, 3) must throwA[IllegalArgumentException]
    }
    "n = k" >> {
      JosephusProblem.josephus(4, 4) must throwA[IllegalArgumentException]
    }
    "n = 3 and k = 2" >> {
      JosephusProblem.josephus(3, 2) == 2
    }
    "n = 14 and k = 2" >> {
      JosephusProblem.josephus(14, 2) == 12
    }
    "n is very large, but k = 2" >> {
      JosephusProblem.josephus(100000, 2) == 68928
    }
  }

}
