import java.util.*;
import bank;

class Shape{
    public void area(){
        System.out.println("displays area")

    }
}

class Triangle extends Shape{
public void area(float h, float l){
    System.out.println(0.5*l*h);
}
}

class equilateralTriangle extends Triangle{
    public void area(float h, float l){
System.out.println(0.5*l*h);
    }
}

class Circle extends Shape{
    public void area(float r){
        System.out.println(3.14*r*r);
    }
}

public class practice12 {
    public static void main(String[] args){
bank.Account account1 = new bank.Account();
account1.name  = "customer1"
    }
}