class Student{
  int rollNo;
  String name;

  Student(int rollNo, String name){
this.rollNo = rollNo;
this.name = name;
  }
}

class Exam extends Student{
  float marks1;
  float marks2;
  float marks3;
  float marks4;
  float marks5;
  float marks6;

  Exam(int rollNo, String name, float marks1, float marks2, float marks3, float marks4,float marks5, float marks6){
    super(rollNo, name);
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
    this.marks4 = marks4;
    this.marks5 = marks5;
    this.marks6 = marks6;
  }
}

class Result extends Exam{
 float totalMarks;
 Result(int rollNo, String name, float marks1, float marks2, float marks3, float marks4,float marks5, float marks6, float totalMarks){
  super(rollNo, name, marks1, marks2, marks3, marks4, marks5, marks6);
this.totalMarks = marks1 + marks2 + marks3 + marks4 + marks5+ marks6;
 }
}

public class practice18 {
  
}
