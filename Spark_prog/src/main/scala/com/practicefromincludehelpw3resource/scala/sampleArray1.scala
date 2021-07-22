package com.practicefromincludehelpw3resource.scala
//Scala program to implement a one-dimensional array using Array() function
object sampleArray1 {
def main(args:Array[String]): Unit ={
  val list = Array(1,5,3,4,6,9,8,7)
  for(a<-list)
    {
      println(s"number of Array is $a")
    }
}
}
