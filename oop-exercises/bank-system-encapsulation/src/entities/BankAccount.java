package entities;

public class BankAccount {

    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Methods

    public void deposit(double depositValue) {
        balance += depositValue;
    }

    public void withdraw(double withdrawValue) {
        balance -= withdrawValue + 5.00;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f.", accountNumber, accountHolder, balance);
    }
}
