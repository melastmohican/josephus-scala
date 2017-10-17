package org.example

object Main {
  def main(args: Array[String]) {
    val n: Int = args(0).toInt
    val k: Int = args(1).toInt
    require(n > 0, "n must be greater than zero")
    require(k >= 1 || k < n, "k is out of range!")

    println("Josephus Problem:" + " n=" + n + " k=" + k )
    val result = JosephusProblem.josephus(n,k)
    println("Result = " + result)
  }
}
