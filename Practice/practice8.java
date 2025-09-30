import java.util.*;

public class practice8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number to check: ");
        int num = sc.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic Number.");
        } else {
            System.out.println(num + " is not an Automorphic Number.");
        }
          if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }
           if (isStrong(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }
sc.close();
  }

  public static boolean isAutomorphic(int num){
  long squaredNum = (long)num*num;
  String numStr = Integer.toString(num);
  String squaredNumString = Long.toString(squaredNum);

  return squaredNumString.endsWith(numStr);
}

  public static boolean isArmstrong(int num){
  if(num<0) return false;
  String numStr= Integer.toString(num);
  int power = numStr.length();
  int temp = num;
  int sum = 0;
  while(temp>0){
    int digit = temp%10;
    sum += Math.pow(digit, power);
    temp = temp/10; 
  }
  return num == sum;
}

public static boolean isPallindrome(int num){
  String numStr = Integer.toString(num);
  String reversed = new StringBuilder(numStr).reverse().toString();
  return numStr.equals(reversed);
}

public static boolean isStrong(int num){
  if(num<0) return false;
  int sum = 0;
  int temp = num;
  while(temp>0){
    int digit = temp%10;
    sum += factorial(digit);
    temp /=10;
  }
  return sum == num;

}

public static int factorial(int num){
  if(num<1) return 1;
  else return num*factorial(num-1);
}

}

