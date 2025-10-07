import java.util.*;

interface Payment{
  void pay(double amount);
  void refund(double amount);
}

class CreditCardPayment implements Payment{
  @Override
  public void pay(double amount){
    System.out.println("Paid " + amount + " using Credit Card.");
  }

  @Override
  public void refund(double amount){
    System.out.println("Refund" + amount + "recieved on Credit Card.");
  }
}

class UPIPayment implements Payment{
  @Override
  public void pay(double amount){
    System.out.println("Paid" + amount + "using UPI");
  }

  @Override
  public void refund(double amount){
    System.out.println("Refund" + amount + "recieved on UPI");
  }
}

class WalletPayment implements Payment{
 @Override
 public void pay(double amount){
  System.out.println("Paid" + amount + "using e-wallet");
 }

 @Override
 public void refund(double amount){
  System.out.println("Refund" + amount + "recived on e-wallet");
 }
}

public class practice17 {
  public static void main(String [] args){
    List<Payment> p = new ArrayList<>();
    Vector<Payment> p2 = new Vector<>();
    Payment[] p1 = new Payment[3];
     
    }


}
