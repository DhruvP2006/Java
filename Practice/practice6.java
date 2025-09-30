import java.util.*;

final class MathConstants{
  public static final double PI = 3.14159;
  private MathConstants(){}
  public static double getPi(){
    return PI;
  }

}

public class practice6{
  public static void main(String args[]){
    System.out.println("Value of Pi: " + MathConstants.getPi());    

  }
}