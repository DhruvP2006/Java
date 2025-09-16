package OOPML;
import java.util.Scanner;

public class Expt1_0{

  static int gcd(int a, int b){
    if (b == 0){
    return a;
  }
  else{
    return gcd(b, a % b);
  }
  }

  static int lcm(int m, int n){
     return ((m*n)/gcd(m,n));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First Number");
    int a = sc.nextInt();
    System.out.println("Enter the Second Number");
    int b = sc.nextInt();
    System.out.print("The GCD of the number is ");
    System.out.println(gcd(a,b));
    System.out.print("The LCM of the number is ");
    System.out.println(lcm(a,b));
  }
}