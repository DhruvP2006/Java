import java.util.Scanner;

class NumberException extends Exception {

    public NumberException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "NumberException: " + getMessage();
    }
}

public class Expt7_0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        String userInput = scanner.nextLine();
        scanner.close();

        try {
            checkNumber(userInput);
            System.out.println("Success! The number does not contain the digit '3'.");
        } catch (NumberException e) {
            System.err.println("Exception caught: " + e);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input: Please enter a valid number.");
        }
    }

    public static void checkNumber(String numberStr) throws NumberException, NumberFormatException {
        long number = Long.parseLong(numberStr);

        if (numberStr.contains("3")) {
            throw new NumberException("The number you entered contains the forbidden digit '3'.");
        }
    }
}
