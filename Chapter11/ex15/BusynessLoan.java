package loans;

public class BusynessLoan extends Loan {

    public BusynessLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeInterest) {
        super(loanNumber, customerLastName, loanAmount + loanAmount * 0.01, term);
        super.setInterestRate(primeInterest + 0.01);
    }
    
}
