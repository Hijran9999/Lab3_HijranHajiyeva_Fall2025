package Hijran;

import java.util.Scanner;

public class DriverMainClass_Hijran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 3 accounts with user input
        System.out.println("Enter account number for Bank Account 1: ");
        String acc1 = sc.nextLine();
        BankAccount_HH account1 = new BankAccount_HH(acc1, 1500);

        System.out.println("Enter account number for Savings Account 2: ");
        String acc2 = sc.nextLine();
        SavingsAccount_HH account2 = new SavingsAccount_HH(acc2, 2000);

        System.out.println("Enter account number for Savings Account 3: ");
        String acc3 = sc.nextLine();
        SavingsAccount_HH account3 = new SavingsAccount_HH(acc3, 500);

        // --- Run 1 ---
        System.out.println("\n--- Run 1: Deposits ---");
        account1.deposit(1000);
        System.out.println("Account 1 balance: $" + account1.getBalance());

        account2.deposit(500);
        System.out.println("Account 2 balance: $" + account2.getBalance());

        account3.deposit(200);
        System.out.println("Account 3 balance: $" + account3.getBalance());

        // --- Run 2 ---
        System.out.println("\n--- Run 2: Withdraw $600 from each account ---");
        account1.withdraw(600);
        System.out.println("Account 1 balance: $" + account1.getBalance());

        account2.withdraw(600);
        System.out.println("Account 2 balance: $" + account2.getBalance());

        account3.withdraw(600);
        System.out.println("Account 3 balance: $" + account3.getBalance());

        // --- Run 3 ---
        System.out.println("\n--- Run 3: Withdraw $2500 from each account ---");
        account1.withdraw(2500);
        System.out.println("Account 1 balance: $" + account1.getBalance());

        account2.withdraw(2500);
        System.out.println("Account 2 balance: $" + account2.getBalance());

        account3.withdraw(2500);
        System.out.println("Account 3 balance: $" + account3.getBalance());

        sc.close();
    }
}
