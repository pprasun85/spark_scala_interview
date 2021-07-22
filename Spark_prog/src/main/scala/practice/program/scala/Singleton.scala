package practice.program.scala

object Singleton {
  def main(args:Array[String]): Unit ={
    singletonObject.hello()
  }
object singletonObject{
  def hello(): Unit ={
    println("hello singleton object")
  }
}
}
