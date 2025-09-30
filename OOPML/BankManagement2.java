import java.util.Scanner;

public class BankManagement2 {

    public final static class BankAccount {
        private final String accountNumber;
        private final String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                System.out.println("Deposited: Rs." + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
            } else if (amount > this.balance) {
                System.out.println("Insufficient balance. Cannot withdraw $" + amount);
            } else {
                this.balance -= amount;
                System.out.println("Withdrew: Rs." + amount);
            }
        }

        public double checkBalance() {
            return this.balance;
        }

        public String getAccountDetails() {
            return String.format("Account Number: %s, Account Holder: %s, Balance: Rs.%.2f",
                this.accountNumber, this.accountHolderName, this.balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Create a BankAccount object
        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);

        // class SpecialAccount extends BankAccount {
        //     public SpecialAccount(String accountNumber, String accountHolderName, double initialBalance) {
        //         super(accountNumber, accountHolderName, initialBalance);
        //     }
        // }
   
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Current Balance: Rs." + String.format("%.2f", account.checkBalance()));
                        break;
                    case 4:
                        System.out.println(account.getAccountDetails());
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number from the menu.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }
    }
}