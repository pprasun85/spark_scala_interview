package com.practicefromincludehelpw3resource.scala

object Area {
  var radius:Float=0;
  var Area:Float=0;
  radius = scala.io.StdIn.readFloat()
  def main(args:Array[String]): Unit ={
    Area = 3.14F*radius*radius
    println("Area of circle is :" +Area)
  }

}
