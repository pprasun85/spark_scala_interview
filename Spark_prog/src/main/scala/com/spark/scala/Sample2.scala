package com.spark.scala
//w3resource
//3. Write a Scala program to get the absolute difference between n and 51. convert n into ascii value then find the diff
object Sample2 {
def main(args:Array[String]): Unit ={
  def diff(a:Int,b:Int): Unit ={
    val c =a-b
      println(s"Absolute difference is : $c)")
  }
  diff('n',51)
}
}
