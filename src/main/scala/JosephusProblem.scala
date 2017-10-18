package org.example

import scala.collection.mutable.Queue

object JosephusProblem {

  def josephus(n: Int, k: Int): Int = {
    require(n > 0, "n must be greater than zero")
    require(k >= 1 && k < n, "k is out of range!")

    val people: Queue[Int] = Queue((0 until n): _*)
    
    while (people.size > 1) {
      (1 until k).foreach {
        people += people.dequeue
      }
      people.dequeue
    }
    people.dequeue
  }
}