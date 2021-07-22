package com.spark.scala
//scala program to read and print the value of the string
object include1 {
def main(args:Array[String]): Unit =
  {
    var str=""
    println("What is your name :")
    str= scala.io.StdIn.readLine()
    println(s"My name is : $str")
  }
}
