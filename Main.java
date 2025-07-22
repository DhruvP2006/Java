import java.util.Scanner;

public class Main{

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

  static void table(int a){
    for(int i=1; i<=12; i++){
    System.out.println(a*i);
    }
  }

  static void tableAll(){
    for(int i =1; i<=10; i++){
      for(int j = 1; j<=12; j++){
        System.out.println(i*j);
      }
    }

  }

  static void checkPrime(int a){
    for(int i = 2; i<a; i++){
      if(a%i==0){
        System.out.println("The given number is not a Prime Number"); 
        break;
      } else{
        System.out.println("The given number is a Prime Number"); 
      }
    }
  }

  static void printPrime(){
    for(int i = 1; i<100; i++){
       boolean isPrime = true;
       for(int j = 2; j<i; j++){
        if(i%j==0){
           isPrime = false;
          break;
        }
      }
      if(isPrime){
        System.out.println(i);
      } 
    }
  }

static int[] matrix1DInput(){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the size of the Array: ");
  int size =  sc.nextInt();
  int[] arr = new int[size];
  System.out.println("Enter the elements of the Array: ");
  for(int i= 0; i<size; i++){
    arr[i] = sc.nextInt();
  }
  return arr;
}

static int[] matrixMultiplication(int arr1[], int arr2[]){
  int[] result = new int[arr1.length];
  System.out.println("The Result of the Array Multiplication is: ");
  for(int i = 0; i<arr1.length; i++){
      result[i] = arr1[i]*arr2[i];
    }

    return result;
  }

  static void printMatrix(int arr[]){
     for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
     }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the First Number");
    // int a = sc.nextInt();
    // System.out.println("Enter the Second Number");
    // int b = sc.nextInt();
    // System.out.print("The GCD of the number is ");
    // System.out.println(gcd(a,b));
    // System.out.print("The LCM of the number is ");
    // System.out.println(lcm(a,b));
    // System.out.println("Enter a Number");
    // int a = sc.nextInt();
    // System.out.println("The table of the give number is ");
    // table(a);
    // tableAll();
    // System.out.println("Enter a Number");
    // int a = sc.nextInt();
    // checkPrime(a);
    // printPrime();

    printMatrix( matrixMultiplication(matrix1DInput(), matrix1DInput()));
  }
}