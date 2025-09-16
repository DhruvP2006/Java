import java.util.*;

public class practice5{
  public static void main(String args[]){
    Vector<Number> num = new Vector<>();
num.add(10);
num.add(20);
num.add(30);
num.add(40);
num.add(50);
num.add(60);
num.add(70);
num.add(80);
Enumeration<Number> c = num.elements();
while(c.hasMoreElements()){
System.out.println(c.nextElement());
} 
  }
}