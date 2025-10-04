// Import the banking package
import banking.Account;
import banking.Loan;

public class BankOperations {
    public static void main(String[] args) {
        // Create an account
        Account acc1 = new Account("Tanish", 5000);
        acc1.showBalance();

        // Deposit money
        acc1.deposit(2000);
        acc1.showBalance();

        // Sanction a loan
        Loan loan1 = new Loan("Home Loan", 1000000);
        loan1.sanctionLoan();
    }
}
