package Hijran;



import java.util.Scanner;

public class DriverMainClass_HijranHajiyeva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Run 1: Create 3 objects dynamically
        System.out.println("Enter account number for Bank Account 1: ");
        String acc1 = sc.nextLine();
        BankAccount_HH account1 = new BankAccount_HH(acc1, 1500);

        System.out.println("Enter account number for Savings Account 2: ");
        System.out.println("Enter account number for Savings Account 3: ");
        System.out.println("\n--- Run 1 ---");
        account1.deposit(1000);
        System.out.println("New balance after deposit: $" + account1.getBalance());

        System.out.println("\n--- Run 2 ---");
        account1.withdraw(600);
        System.out.println("New balance after withdrawal: $" + account1.getBalance());

        System.out.println("\n--- Run 3 ---");
        account1.withdraw(2500);
        System.out.println("New balance after withdrawal: $" + account1.getBalance());

        sc.close();
    }
}
