package com.cbougeno

import org.apache.spark.sql.SparkSession

/**
 * @author ${user.name}
 */
object App {

  def main(args : Array[String]) {
    val spark = SparkSession
      .builder()
      .appName("sparkpoc")
      .master("local[2]")
      .getOrCreate()

    val input = spark.read.textFile("~/developmenttools/input/prueba1.txt")

    println("exit...")
  }

}
