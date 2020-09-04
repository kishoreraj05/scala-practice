package com.scalapractice
// classes/ case / traits / switch / Array/
// Collections same as in Java

object MainClass {
  def main(args: Array[String]): Unit = {
    println("Hello Word! Raj!!!")

    if (args.length == 0)
      println("no arguments")
    else
      println(s"no of input arguments is ${args.length}, arguments: ${args(0)}, ${args(1)}")

    val num1 = 21
    var num2 = 32

    val mulNum = 10

    val multipPlyWithTen = (i: Int) => i * mulNum

    println(multipPlyWithTen(5))

    val arr1 = Array[Int](1, 2, 3, 4)
    arr1.foreach(no => {
      println(no)
    })

    /**
     * list of lines.foreach( line => {
     * val processed = processing(line)
     * write(processed)
     * })
     */

    // printNoUsingRange(10)
    val sumOfOddNo = getSumOfOddNumber(5)
    println(sumOfOddNo)
    println(checkIfInputIsOddNo(2))

    println("Print Prime Nos:")
    printAllPrimeNoBetweenOneAndInput(20)
  }

  def checkIfInputIsOddNo(num: Int): Boolean = {

    val isOdd: Boolean = if (num % 2 == 0)
      false
    else
      true

    isOdd
  }

  def printNoUsingWhileLoop(maxNo: Int): Unit = {
    var i = 0
    while (i <= maxNo) {
      println(i)
      i = i + 1
    }
  }

  def printNoUsingRange(maxNo: Int): Unit = {
    for (i <- 0 to maxNo) {
      println(i)
    }
  }

  def getSumOfOddNumber(maxNo: Int): Int = {
    var sum = 0
    for (i <- 0 to maxNo) {
      if (checkIfInputIsOddNo(i))
        sum = sum + i
    }
    sum
  }

  // 1. Write a function to check if the input no is prime no or not
  def checkIfNumIsPrime(num: Int): Boolean = {
    var isPrime = true
    if (num == 1) isPrime = false
    var i = 2
    while (i <= (num / 2) && isPrime) {
      if (num % i == 0) {
        isPrime = false
      }
      i = i + 1
    }
    isPrime
  }

  // 2. Write a function to print all the prime number present between 1 and given input number.
  // Use above checkifNumIsPrime()
  def printAllPrimeNoBetweenOneAndInput(maxNum: Int): Unit = {
    for(i <- 1 to maxNum){
      if(checkIfNumIsPrime(i)){
        println(i)
      }
    }
  }

}
