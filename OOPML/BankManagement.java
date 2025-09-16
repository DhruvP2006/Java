import java.util.Scanner;

class Customer {
    private int accountId;
    private String name;
    private double balance;

    public Customer(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Name: " + name + ", Balance: Rs." + String.format("%.2f", balance);
    }
}

public class BankManagement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 100;
        Customer[] customers = new Customer[n];
        int customerCount = 0; 

        int choice;
        do {
            System.out.println("\n--- Bank Account Management System ---");
            System.out.println("1. Add New Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Display All Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (customerCount < n) {
                        System.out.print("Enter Account ID: ");
                        int accountId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Initial Balance: ");
                        double balance = scanner.nextDouble();
                        scanner.nextLine();

                        customers[customerCount] = new Customer(accountId, name, balance);
                        customerCount++;
                        System.out.println("Account added successfully!");
                    } else {
                        System.out.println("Cannot add more accounts. The database is full.");
                    }
                    break;

                case 2:
                    if (customerCount == 0) {
                         System.out.println("No accounts to delete.");
                         break;
                    }
                    System.out.print("Enter Account ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    scanner.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < customerCount; i++) {
                        if (customers[i].getAccountId() == idToDelete) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        for (int i = foundIndex; i < customerCount - 1; i++) {
                            customers[i] = customers[i + 1];
                        }
                        customers[customerCount - 1] = null;
                        customerCount--;
                        System.out.println("Account deleted successfully!");
                    } else {
                        System.out.println("Account with ID " + idToDelete + " not found.");
                    }
                    break;

                case 3:
                    if (customerCount == 0) {
                        System.out.println("No account details to display.");
                    } else {
                        System.out.println("\n--- All Customer Account Details ---");
                        for (int i = 0; i < customerCount; i++) {
                            System.out.println(customers[i].toString());
                        }
                        System.out.println("------------------------------------");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

