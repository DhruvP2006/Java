package OOPML;
public class Expt2_0 {
  public static void main(String[] args){
    long n = 0;
    long nSquare;
    System.out.println("The Kaprekar Numbers below 1000 are:");
    while(n<=1000){

      nSquare = n*n;
      for(long p = 10; ;p*=10){
      long leftPart = nSquare/p;
      long rightPart = nSquare%p;
      
      if (rightPart != 0 && leftPart + rightPart == n) {
         System.out.println(n);
         break;
       }

       if (leftPart == 0) {
          break;
        }
      }
      n++;
    }
  }
}
