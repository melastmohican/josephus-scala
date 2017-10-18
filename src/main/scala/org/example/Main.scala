package org.example

/**
  * Application that takes in 2 parameters: the number of people in the circle (n) and the step rate (k).
  * For example, if k is the step rate, then you skip k-1 people and eliminate the kth person.
  * The output of the program should be the place you need to stand in the circle to be the last person left.
  */
object Main {
  def main(args: Array[String]) {
    val n: Int = args(0).toInt
    val k: Int = args(1).toInt
    require(n > 0, "n must be greater than zero")
    require((1 until n) contains k, "k is out of range!")

    println("Josephus Problem:" + " n=" + n + " k=" + k)
    val result = JosephusProblem.josephus(n, k)
    println("Result = " + result)
  }
}
