package com.practicefromincludehelpw3resource.scala
//Scala program to create a function with arguments
object udf2 {
def sum(a:Int,b:Int): Int =
  {
   val c = a+b
    return c
  }
  def main(args:Array[String]): Unit ={
    println("sum of two number is :" +sum(25,35))
  }
}
