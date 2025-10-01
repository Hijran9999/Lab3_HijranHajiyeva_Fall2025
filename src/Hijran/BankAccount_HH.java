package Hijran;

public class BankAccount_HH {
    private final String accountNumber;
    protected double balance;

    // Constructor with validation
    public BankAccount_HH(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty!");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive!");
            return;
        }
        balance += amount;
        System.out.println("Deposited $" + amount + " successfully.");
    }

    // Withdraw method (base class)
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " successfully.");
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
