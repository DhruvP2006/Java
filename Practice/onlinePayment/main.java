package onlinePayment;
import java.util.*;

public class main {
  public static void main(String[] args){
     List<onlinePayment> modes = new ArrayList<>();
     modes.add(new upiPayment());
     modes.add(new creditCard());
     for(onlinePayment mode : modes)
        modes.pay(1000);
        modes.refund(500);
     }
  }
}
