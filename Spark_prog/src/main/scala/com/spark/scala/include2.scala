package com.spark.scala
//Scala program to read the value of two  integer variable and find their sum
object include2 {
  def main(args: Array[String]): Unit = {
var num1 = 0
  var num2 = 0
  num1 = scala.io.StdIn.readInt()
  println(s"first number is : $num1")
  num2 = scala.io.StdIn.readInt()
  println(s"second number is : $num2")
    val num = num1 + num2
    println(s"sum of the number is :$num")
  }
}
