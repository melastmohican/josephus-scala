package org.example

import scala.collection.mutable

/**
  * Josephus problem is a theoretical problem related to a certain counting-out game.
  * People are standing in a circle waiting to be executed. Counting begins at a specified point in the circle and proceeds around the circle in a specified direction.
  * After a specified number of people are skipped, the next person is executed. The procedure is repeated with the remaining people, starting with the next person,
  * going in the same direction and skipping the same number of people, until only one person remains, and is freed.
  */
object JosephusProblem {

  /**
    * Josephus problem solution using a queue
    *
    * @param n people in the circle
    * @param k step rate
    * @return last person left
    */
  def josephus(n: Int, k: Int): Int = {
    require(n > 0, "n must be greater than zero")
    require((1 until n) contains k, "k is out of range!")

    val people: mutable.Queue[Int] = mutable.Queue(0 until n: _*)

    while (people.size > 1) {
      (1 until k).foreach {
        people += people.dequeue
      }
      people.dequeue
    }
    people.dequeue
  }
}
