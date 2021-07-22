package com.spark.scala
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession
object lab_df {

  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.OFF)
    val spark = SparkSession.builder.master("local[1]").appName("joins").getOrCreate()
    // val sc = spark.sparkContext
    //val conf = new SparkConf().setAppName("joins").setMaster("local[*]")
    val sqlContext = spark.sqlContext
    //use of implicit is to provide string member
    val df1 = spark.read.options(Map("inferSchema" -> "true", "delimiter" -> ",", "header" -> "true"))
      .csv("D:\\DATA\\Project\\customer.csv")
    val df2 = spark.read.options(Map("inferSchema" -> "true", "delimiter" -> ",", "header" -> "true"))
      .csv("D:\\DATA\\Project\\Address.csv")
   // val finaldf = df1.join(df2,"customer_id")
   val finaldf = df1.select("customer_id","name")
    //df1.join(df2,df1("customer_id")== df2("customer_id"),"inner").show(false)
    finaldf.show(false)


  }
}