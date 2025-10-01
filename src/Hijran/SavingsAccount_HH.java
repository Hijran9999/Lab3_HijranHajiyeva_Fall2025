package Hijran;

public class SavingsAccount_HH extends BankAccount_HH {

    // Constructor calls parent class
    public SavingsAccount_HH(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Override withdraw method
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 50) {
            System.out.println("Withdrawal denied! Balance cannot go below $50.");
        } else {
            super.withdraw(amount);
        }
    }
}
