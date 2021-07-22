package practice.program.scala

object ArrarExample {
    val myarray:Array[Int] = new Array[Int](5)
  val myarray1 = new Array[Int](4)
  def main(args:Array[String]){
    myarray1(0)=10
    myarray1(1)=20
    myarray1(2)=30
    myarray1(3)=40
    for(x <- myarray1){
      println(x);

    }
    for(i<-0 to (myarray1.length -1)){
      println(myarray1(i)+10);

    }

  }

}
