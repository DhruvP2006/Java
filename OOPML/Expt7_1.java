import java.util.ArrayList;
import java.util.List;

interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Payment of Rs.%.2f made using Credit Card.\n", amount);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Refund of Rs.%.2f processed for Credit Card.\n", amount);
    }
}

class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Payment of Rs.%.2f made using UPI.\n", amount);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Refund of Rs.%.2f processed for UPI.\n", amount);
    }
}

class WalletPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.printf("Payment of Rs.%.2f made using E-wallet.\n", amount);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Refund of Rs.%.2f processed for E-wallet.\n", amount);
    }
}

public class Expt7_1 {
    public static void main(String[] args) {
        System.out.println("--- Online Payment System Demonstration ---\n");

        List<Payment> payments = new ArrayList<>();
        payments.add(new CreditCardPayment());
        payments.add(new UPIPayment());
        payments.add(new WalletPayment());

        for (Payment paymentMethod : payments) {
            paymentMethod.pay(150.75);
            paymentMethod.refund(50.25);
            System.out.println();
        }
    }
}
