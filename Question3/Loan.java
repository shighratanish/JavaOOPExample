package banking;

public class Loan {
    private String loanType;
    private double loanAmount;

    // Constructor
    public Loan(String loanType, double loanAmount) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    // Method to sanction loan
    public void sanctionLoan() {
        System.out.println("Loan of ₹" + loanAmount + " for " + loanType + " is sanctioned.");
    }
}
