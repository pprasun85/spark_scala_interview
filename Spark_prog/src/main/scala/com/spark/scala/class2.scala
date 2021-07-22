package com.spark.scala
import org.apache.spark.sql._
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._

  object class2
  {

    def main(args: Array[String])
    {
      val sparksessionobject = SparkSession.builder()
        .master("local")
        .config("spark.sql.warehouse.dir", "C:/Users/ox/spark/spark/spark-warehouse")
        .getOrCreate()
      sparksessionobject.conf.set("spark.sql.shuffle.partitions", 4)
      sparksessionobject.conf.set("spark.executor.memory", "2g")
      import sparksessionobject.sqlContext.implicits._

      val df = Seq(("DEPT1", 1000), ("DEPT1", 500), ("DEPT1", 700), ("DEPT2", 400), ("DEPT2", 200),  ("DEPT3", 500), ("DEPT3", 200))
        .toDF("department", "assetValue")
      val byDeptOrderByAssetDesc = Window.partitionBy($"department").orderBy($"assetValue" desc)
      df.withColumn("col3", dense_rank() over byDeptOrderByAssetDesc)
        .filter("col3=2").show()
    }
  }

