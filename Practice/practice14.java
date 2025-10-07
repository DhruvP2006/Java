import java.util.*;

abstract class Employee{
  public int empId;
  public String name;
  public double basicSalary;

  Employee(int empId, String name, double basicSalary){
    this.empId = empId;
    this.name = name;
    this.basicSalary = basicSalary;
  }

  public abstract double calculateSalary();

  public void displayDetails(){
    System.out.println("Name: " + name + "\nEmployee ID: " + empId + "\nBasic Salary: " + basicSalary);
  }
}

class FullTimeEmployee extends Employee{
 
  public float allowances;
  public float deductions;

 FullTimeEmployee(int empId, String name, double basicSalary, float allowances, float deductions){
  super(empId, name, basicSalary);
  this.allowances = allowances;
  this.deductions = deductions;
 }
 
  @Override
  public double calculateSalary(){
    return this.basicSalary + this.allowances - this.deductions;
  }
}

class PartTimeEmployee extends Employee{
  public float hoursWorked;
  public float hourlyRate;

  PartTimeEmployee(int empId, String name, float hourlyRate, float hoursWorked){
    super(empId, name, 0);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }

  @Override
  public double calculateSalary(){
    return this.hoursWorked * this.hourlyRate;
  }
}

class Intern extends Employee{
  public int stipend;

  Intern(int stipend, String name, int empId){
    super(empId, name, 0);
    this.stipend = stipend;
  }

  @Override
  public double calculateSalary(){
    return this.stipend;
  }
}

public class practice14 {
 
  public static void main(String [] args){
    List<Employee> emp = new ArrayList<>();

    emp.add(new FullTimeEmployee(123, "Dhruv", 1000, 50, 20));
    emp.add(new PartTimeEmployee(2, "Aarya", 60, 20));
    emp.add(new Intern(2, "Adeep", 60));
    for(Employee emps : emp){
      emps.displayDetails();
      System.out.println("Total Salary: " + emps.calculateSalary());
      System.out.println();
    }
  }
}
