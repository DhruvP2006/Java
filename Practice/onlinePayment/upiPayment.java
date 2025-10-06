package onlinePayment;

public class upiPayment implements onlinePayment{
  @Override
  public void pay(double amount){
    System.out.println("Paid using UPI" + amount);
  }

  @Override
  public void refund(double amount){
    System.out.println("Refunded to UPI"+ amount); 
  } 
}

