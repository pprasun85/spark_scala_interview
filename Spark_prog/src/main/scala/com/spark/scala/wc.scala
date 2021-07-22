package com.spark.scala

import org.apache.spark.{SparkConf, SparkContext}


object wc {
  def main(args: Array[String]) {
    val conf = new SparkConf()
      .setMaster("local")
      .setAppName("Word Count")
      .setSparkHome("src/main/resources")
    val sc = new SparkContext(conf)
    val input = sc.textFile("D:\\New_folder\\test.txt")

    val count = input.flatMap(line ⇒ line.split(" "))
          .map(word ⇒ (word, 1))
            .reduceByKey(_ + _)
    /*
    val count = input.map(word ⇒ (word, 1))

     */
    count.foreach(println)
  }
}