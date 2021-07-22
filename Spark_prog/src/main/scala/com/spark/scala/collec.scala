package com.spark.scala

object collec {
  def main(args: Array[String]): Unit = {
    var aSequence = Seq(1,5,3,6)
    println(aSequence)
    println(aSequence.reverse)
    println(aSequence.sorted)
    var aSequence1 = Seq(9,5)
println(aSequence ++ aSequence1)
  }
}
