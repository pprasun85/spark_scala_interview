package com.practicefromincludehelpw3resource.scala

object udf4 {
  def main(args: Array[String]) {

    var a = Array(1, 2, 3, 4, 5)
    var sum:Int = 0
    for(i<-0 to (a.length-1)){

      sum+=a(i)
    }
    println(s"sum of the array is : $sum")
  }


  }