package onlinePayment;

public class creditCard implements onlinePayment{
  @Override
  public void pay(double amount){
    System.out.println("Paid using Credit Card" + amount);
  }

  @Override
  public void refund(double amount){
    System.out.println("Refunded to Credit Card"+ amount); 
  } 
}

