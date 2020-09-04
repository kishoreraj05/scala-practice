package com.scalapractice

import java.lang.Integer

object ArrayExample {
  def main(args: Array[String]): Unit = {
    // constant array
    val fruits = Array("apples", "oranges","pears")
    var nums = new Array[Int](3)
    nums(0) = 123
    nums(1) = 1
    nums(2) = 23
    nums.foreach(x => println(x))

    // constant list
    val fruitsList: List[String] = List("apples", "oranges","pears")
    println(fruitsList)

    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    println(s"other way to create list: $fruit")

    val list1:List[Any] = List(1, "apples", 23.4)
    list1.foreach(x => {
      if (x.isInstanceOf[Int])
        println(s"$x is instance of Int")
      if (x.isInstanceOf[String])
        println(s"${x} is instance of String")
      if (x.isInstanceOf[Double])
        println(s"$x is instance of Double")
    })
    println(s"print one element from list: ${list1(1)}")
    println(list1)
  }
  // Ques-1 -> Write a program to sort the list of names using array
  def sortArrayValue(names: Array[String]): Array[String] = {
    names
  }

}
