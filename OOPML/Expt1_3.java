package OOPML;
import java.util.Scanner;

public class Expt1_3 {

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1; 
        else
            return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        scanner.close(); 
          }
}
