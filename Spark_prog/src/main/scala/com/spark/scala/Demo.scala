package com.spark.scala

object Demo extends App {
  def factorial(n: Int): Unit = {

    if (n == 1) {
      def factorial(n: Int): Int = {

        if (n == 1) {

          return 1

        }
        n * factorial(n - 1)

      }
    }
    println(factorial(6))
  }}
