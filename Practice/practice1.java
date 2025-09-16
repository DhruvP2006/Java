import java.util.Scanner;

class Calculator{
  public int add(int a, int b){
    return a+b;
  }
  public int add(int a, int b, int c){
    return a+b+c;
  }

  public double add(double a, double b){
    return a+b;
  }
}


class Person{
  String Name;
  int age;
}

class Student extends Person{
  int rollNumber;

  void displayInfo(){
    System.out.println("Name: " + Name);
    System.out.println("Age: " + age);
    System.out.println("Roll Number: " + rollNumber);
  }
}

class Teacher extends Person{
  String subject;
  int salary;

  void displayInfo(){
    System.out.println("Name: " + Name);
    System.out.println("Age: " + age);
    System.out.println("Subject: " + subject);
    System.out.println("Salary: " + subject);
  }
}

class gcd_lcm{
 static int gcd(int a, int b){
  if(b==0){
    return a;
  } else{
   return gcd(b, a%b);
  }

}

static int lcm(int a, int b){
  return  (a*b)/gcd(a, b);
} 

}

public class practice1 {
  public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Calculator calc = new Calculator();

// Student S1 = new Student();

// S1.Name = "Dhruv Pankhaia";
// S1.age = 19;
// S1.rollNumber = 216;

// S1.displayInfo();

System.out.print("Enter first number");
int num1 = sc.nextInt();
System.out.print("Enter second Number");
int num2 = sc.nextInt();
System.out.println(calc.add(num1, num2)) ;
System.out.print("Enter third Number");
int num3 = sc.nextInt();
System.out.println(calc.add(num1, num2, num3));
// System.out.println(gcd_lcm.gcd(num1, num2));
// System.out.println(gcd_lcm.lcm(num1, num2));
  }
}
