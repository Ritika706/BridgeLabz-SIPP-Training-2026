package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CLASS_AND_OBJ;

class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMSimulation {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Ritika", 123456789, 10000);

        account.deposit(5000);
        account.withdraw(3000);
        account.displayBalance();
    }
}