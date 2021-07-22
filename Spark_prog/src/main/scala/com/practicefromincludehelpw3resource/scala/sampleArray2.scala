package com.practicefromincludehelpw3resource.scala

object sampleArray2 {
  def main(args:Array[String]): Unit ={
    var num=Array("mon","tues","wed","thrus","fri","sat")
    var number =Array(1,2,3,4)
    num(1)="prem"
    for(a<-num) {
      println(a)

    }
    /*
    println("enter the list of number")
    var number = new Array[Int](6)
    number = scala.io.StdIn.readLine(Array)
    */

    var b=0
    for (b<- 0 to (number.length-1)) {

      if (b % 2 == 1) {
        number(b) = number(b) + 10
      }



      // for(b<- 0 to (number.length-1)){
      println(number(b))
    }
   // }
    }

}