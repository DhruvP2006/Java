class InsufficientFundsException extends Exception {
    
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f. New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount of $" + amount + " exceeds the current balance of $" + balance);
        }
        
        balance -= amount;
        System.out.printf("Withdrew: $%.2f. New Balance: $%.2f%n", amount, balance);
    }

    public double getBalance() {
        return balance;
    }
}


public class BankApp {
    public static void main(String[] args) {
        System.out.println("--- Welcome to Bank Account Management ---");
        
        BankAccount myAccount = new BankAccount(500.00);
        System.out.printf("Initial Balance: $%.2f%n%n", myAccount.getBalance());
        
        myAccount.deposit(250.00);
        
        try {
            myAccount.withdraw(100.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nAttempting an invalid withdrawal...");
        
        try {
            myAccount.withdraw(701.00);
        } catch (InsufficientFundsException e) {
            System.out.println("\nCaught the InsufficientFundsException!");
            System.err.println("ERROR: " + e.getMessage());
            System.out.printf("Current Balance remains: $%.2f%n", myAccount.getBalance());
        }
        
        System.out.println("\n--- Program finished ---");
    }
}
