package com.scalapractice

import com.scalapractice.school.{StudentDetails, StudentInfo}

object ClassExample {
  def main(args: Array[String]): Unit = {

    val bankAccount = new BankAccount()
    bankAccount.deposit(100)
    bankAccount.printBalance()
    bankAccount.withdraw(50)
    bankAccount.printBalance()

    val bankAccount1 = new BankAccount
    bankAccount1.deposit(100)

    val bankAccount2 = new BankAccount
    bankAccount2.deposit(100)

    println(bankAccount1 == bankAccount2)

    val c3 = Note("C", "Quarter", 3)
    val cThree = Note("C", "Quarter", 3)

    println(c3 == cThree)

    val studentDetails = new StudentDetails
    val studentInfo = StudentInfo("s1", "ram", "03-04-1989", null, false)
    println(studentInfo.name)
    println(studentInfo)
    studentDetails.addStudent(studentInfo)



  }
}
