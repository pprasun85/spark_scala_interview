package com.spark.scala



import org.apache.log4j.{Level,Logger}
import org.apache.spark.sql.SparkSession

object Join {
 def main(args: Array[String]) {
  Logger.getLogger("org").setLevel(Level.OFF)
  val spark = SparkSession.builder.master("local[1]").appName("joins").getOrCreate()
  // val sc = spark.sparkContext
  //val conf = new SparkConf().setAppName("joins").setMaster("local[*]")
  val sqlContext = spark.sqlContext
  import spark.implicits._
  //use of implicit is to provide string member
  val df1 = spark.read.options(Map("inferSchema" -> "true", "delimiter" -> ",", "header" -> "true"))
    .csv("D:\\DATA\\Project\\customer.csv")
  val df2 = spark.read.options(Map("inferSchema" -> "true", "delimiter" -> ",", "header" -> "true"))
    .csv("D:\\DATA\\Project\\Address.csv")
  val df3 = spark.read.options(Map("inferSchema" -> "true", "delimiter" -> ",", "header" -> "true"))
    .csv("D:\\DATA\\Project\\Order.csv")
  val df4 = df3.withColumn("Year", $"Date_Of_Order".substr(1, 4))
  df4.show()
  df1.printSchema()
  df2.printSchema()
  df3.printSchema()
  df1.show(false)
  df2.show(false)
  //df3.show(false)
  df1.createOrReplaceTempView("Customer")
  df1.createOrReplaceTempView( "Address")
  df1.createOrReplaceTempView("Order")
  val sqlDF = spark.sql("SELECT name,yob FROM Customer")
  //val joinDF2 = spark.sql("select c.customer_id,c.name,a.address,count(o.Product_id),o.Product_name from Customer c INNER JOIN Address a ON c.customer_id == a.customer_id INNER JOIN Order o on c.customer_id == o.customer_id group by o.order_id,c.customer_id,c.name,a.address,o.Product_name")
  //joinDF2.show(false)
  //val sqlDF1 = spark.sql("SELECT c.name,a.address,o.product_name,count(Product_id)  from Customer c  LEFT JOIN Address a ON c.customer_id == a.customer_id INNER JOIN Order o ON c.customer_id == o.customer_id GROUP BY c.name,a.address,o.product_name,Product_id ORDER BY name")
  //sqlDF.show(false)
  val sqlDF1 = spark.sql("SELECT name,address from Customer LEFT JOIN Address ON customer_id == customer_id GROUP BY name,address")
  sqlDF1.show(false)

  spark.stop()

 }
}
