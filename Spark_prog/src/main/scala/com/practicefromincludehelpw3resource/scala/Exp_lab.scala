package com.practicefromincludehelpw3resource.scala

object Exp_lab {
def main(args:Array[String]): Unit ={
  val list = List("One","Two","TWo","Three","Four")
  //val rdd1 = list.map(x=>(x,1))
  val rdd1 = list.flatMap(line=>line.split(","))
  rdd1.foreach(println)
}
}
