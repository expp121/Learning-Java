package loans;

public class PersonalLoan extends Loan {

    public PersonalLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeInterest) {
        super(loanNumber, customerLastName, loanAmount + loanAmount * 0.02, term);
        super.setInterestRate(primeInterest + 0.02);
    }

}
