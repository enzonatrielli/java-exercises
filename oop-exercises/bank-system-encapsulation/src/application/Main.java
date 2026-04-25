package application;

import entities.BankAccount;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit? (Y/N): ");
        char initialDeposit = sc.next().toUpperCase().charAt(0);

        if (initialDeposit == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double firstDeposit = sc.nextDouble();
            account = new BankAccount(accountNumber, accountHolder, firstDeposit);
        }
        else {
            account = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println("Account data: " + account);

        System.out.println("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data: " + account);

        System.out.println("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data: " + account);

        sc.close();
    }
}
