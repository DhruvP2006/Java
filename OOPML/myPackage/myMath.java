package myPackage;

public class myMath {

    public static double power(double base, int exp) {
        double result = 1.0;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static long fact(int num) {
        if (num < 0) {

          return -1; 
        }
        if (num == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}