import java.util.InputMismatchException;
import java.util.Scanner;

// UserDefined Exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private final int pin;

    public BankAccount(String accountNumber, String accountHolder, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    // Deposit method
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount should be positive.");
        }
        balance += amount;
        System.out.println("Rs." + amount + " deposited. New balance: Rs." + balance);
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException, IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount should be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("You do not have enough funds for this transaction.");
        }
        balance -= amount;
        System.out.println("Rs." + amount + " withdrawn. New balance: Rs." + balance);
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current balance: Rs." + balance);
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }

    // Method to validate PIN
    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }
}

// ATM Simulation
public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("123456", "John Doe", 100000, 1234);

        // Prompt for PIN validation before showing the menu
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = scanner.nextInt();
        if (!account.validatePin(enteredPin)) {
            System.out.println("Invalid PIN. Access denied.");
            scanner.close();
            return;
        }

        account.displayAccountInfo();

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric option.");
                scanner.nextLine(); // consume invalid input
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.out.println("Thank you for using the ATM!");
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (InsufficientFundsException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
