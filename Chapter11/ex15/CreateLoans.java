package ex15;
import loans.PersonalLoan;
import loans.BusynessLoan;
import loans.Loan;
import java.util.Scanner;

public class CreateLoans {
    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        Loan[] loans = new Loan[5];
        System.out.println("Enter the current prime interest rate: ");
        float primeInterestRate = input.nextFloat();
        for (int i = 0; i < (loans.length / 2); i++)
            loans[i] = new BusynessLoan(i + 1, "Banchev " + (i + 1), (i + 1) * 653.32, 3, primeInterestRate);
        
        for (int i = loans.length / 2; i < loans.length; i++) 
        loans[i] = new PersonalLoan(i + 1, "Danchev " + (i + 1), (i + 1) * 653.32, 3, primeInterestRate);

        for (int i = 0; i < loans.length; i++) {
            System.out.println(loans[i].toString());
        }
    }
}