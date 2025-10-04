package banking;

public class Account {
    private String accountHolder;
    private double balance;

    // Constructor
    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Method to check balance
    public void showBalance() {
        System.out.println(accountHolder + "'s account balance: ₹" + balance);
    }
}
