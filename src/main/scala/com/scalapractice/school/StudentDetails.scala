package com.scalapractice.school

import java.util

class StudentDetails {
  private val studentsNames = new util.ArrayList[String]()
  private val generalStudents = new util.ArrayList[StudentInfo]()
  private val scholarStudents = new util.ArrayList[StudentInfo]()

  def addStudent(studentInfo: StudentInfo): Unit = {
    if (studentInfo.isScolar)
      scholarStudents.add(studentInfo)
    else
      generalStudents.add(studentInfo)
    studentsNames.add(studentInfo.name)
  }

}
