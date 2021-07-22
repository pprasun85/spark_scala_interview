package com.spark.scala
//Scala program to swap two numbers .You have to get number from user
object include3 {
def main(args: Array[String]): Unit ={
  var num1 = 0
  var num2 = 0

  println("Enter the numbers:")
  num1 = scala.io.StdIn.readInt()
  num2 = scala.io.StdIn.readInt()
  println(s"enter the first number $num1")
  println(s"enter the first number $num2")
 var c = num1
  num1 = num2
  num2 =c
  println(s"Reverse of the number...first_number: $num1 and second number is $num2 ")
}
}
