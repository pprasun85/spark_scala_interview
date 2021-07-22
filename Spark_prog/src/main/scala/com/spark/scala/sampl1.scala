package com.spark.scala
//2. Write a Scala program to compute the sum of the two given integer values. If the two values are the same, then return triples their sum.
object sampl1 {
  def main(args:Array[String]): Unit =
  {
def sum(a:Int,b:Int):Unit={
  val c= a+b
  if(a==b){
    print("sum of simillar number is triple of  normal sum "+(3*c) )
  }
  else {
    print("sum is " +c)
  }
}
sum(25,25)
    sum(20,30)
  }

}
