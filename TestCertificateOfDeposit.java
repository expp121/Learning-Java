/**
 * TestCertificateOfDeposit
 */
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCertificateOfDeposit {
    
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        CertificateOfDeposit certificate1 = new CertificateOfDeposit(), certificate2 = new CertificateOfDeposit();
        
        certificate1 = enterDate(certificate1);
        certificate2 = enterDate(certificate2);

        displayDate(certificate1);
        displayDate(certificate2);
    }

    public static CertificateOfDeposit enterDate(CertificateOfDeposit certificate){
        
        int tempY,tempM,tempD;
        
        System.out.print("\nEnter a certificate number: ");
        certificate.setCertificateNumber(input.nextInt());
        input.nextLine();
        
        System.out.print("Enter a name: ");
        certificate.setName(input.nextLine());
        
        System.out.print("Enter account balance: ");
        certificate.setBalance(input.nextFloat());
        input.nextLine();
        
        System.out.print("Enter a Year: ");
        tempY = input.nextInt();
        System.out.print("Month: ");
        tempM = input.nextInt()-1;
        System.out.print("Day: ");
        tempD = input.nextInt();
        input.nextLine();

        certificate.setIssueDate(tempY, tempM, tempD);
        
        return certificate;
    }

    public static void displayDate(CertificateOfDeposit certificate) {
        System.out.println("\nID: " + certificate.getCertificateNumber() + "\nAccount Name: " + certificate.getName()
        + "\nBalance: " + certificate.getBalance() + "\nIssue Date: " + certificate.getIssueDate().get(GregorianCalendar.YEAR) + '.' + (certificate.getIssueDate().get(GregorianCalendar.MONTH) + 1) + '.' + certificate.getIssueDate().get(GregorianCalendar.DAY_OF_MONTH)
        + "\nMaturnity date: " + certificate.getMaturityDate().get(GregorianCalendar.YEAR) + '.' + (certificate.getMaturityDate().get(GregorianCalendar.MONTH) + 1) + '.' + certificate.getMaturityDate().get(GregorianCalendar.DAY_OF_MONTH));
    }
}