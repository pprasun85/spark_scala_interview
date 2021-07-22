package com.spark.scala

object include4 {

  def fact(n: Int):Int = {
    if (n <= 1)
      return 1
    return n * fact(n - 1)
  }

  def main(args: Array[String]): Unit = {
    var n = 0
println("enter the number")
n= scala.io.StdIn.readInt()
    println(s"factorial of $n is" + fact(n))
  }
}