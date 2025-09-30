import myPackage.myMath;
import java.util.Scanner;

public class CosineSeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x in degrees: ");
        double degrees = scanner.nextDouble();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        scanner.close();

        double x_radians = degrees * (Math.PI / 180.0);

        double sum = 0;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            int exponent = 2 * i;
            double numerator = myMath.power(x_radians, exponent);
            long denominator = myMath.fact(exponent);
            
            sum += sign * (numerator / denominator);
            
            sign *= -1; 
        }

        System.out.printf("The value of cos(%.2f) up to %d terms is: %.6f\n", degrees, n, sum);
        System.out.printf("For comparison, Math.cos(%.2f) is: %.6f\n", degrees, Math.cos(x_radians));
    }
}