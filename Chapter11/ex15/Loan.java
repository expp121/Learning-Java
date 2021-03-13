package loans;

public abstract class Loan implements LoanConstants {
    private int loanNumber;
    private String customerLastName;
    private double loanAmount;
    private double interestRate;
    private int term;

    public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        this.loanAmount = loanAmount <= LoanConstants.MAX_LOAN ? loanAmount : 0.0;
        if (term == LoanConstants.SHORT_TERM || term == LoanConstants.MEDIUM_TERM || term == LoanConstants.LONG_TERM)
            this.term = term;
        else
            this.term = LoanConstants.SHORT_TERM;

    }

    protected void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String toString() {
        return "Loan Number: " + loanNumber + "\nLast name: " + customerLastName + "\nLoan Amount: " + loanAmount
                + "\nInterest Rate: " + interestRate + "\nTerm: " + term + " years";
    }

}
