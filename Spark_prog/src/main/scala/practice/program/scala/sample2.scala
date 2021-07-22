package practice.program.scala

object sample2 {
  def main(args:Array[String]): Unit ={
    val tuple1 = ("car",600000)
    val (product,price) = tuple1
    //println(tuple1._1)
   // println(tuple1._2)
    println(s"the value of $product is $price rupees")

    val  tupleList = List(("car",5000000),("Laptop",30000),("mobile",5000))
    tupleList.foreach{
      case (x,y)=>println(s"The value of $x is $y")}
        tupleList.foreach{ case (x,y)=> val hike = y+(0.1*y)
              println(s"The hiked price of $x in April is $hike")

        }

    }
}
