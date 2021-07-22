package com.practicefromincludehelpw3resource.scala
//Scala program to return a value from the function without using the 'return' statement
object udf3 {
def main(args:Array[String]): Unit ={
  def sum(a:Int,b:Int): Unit ={
    val c = a+b
    println(s"Sum of two number is $c")
  }
  sum(10,20)
}
}
