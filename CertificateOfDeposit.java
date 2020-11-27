/**
 * CertificateOfDeposit
 */
import java.util.GregorianCalendar;

public class CertificateOfDeposit {
    
    private int certificateNumber;
    private String name;
    private float balance;
    private GregorianCalendar issueDate;
    private GregorianCalendar maturityDate;

    public CertificateOfDeposit(){
        this.certificateNumber = 0;
        this.name = "";
        this.balance = 0.0f;
        issueDate = new GregorianCalendar();
        maturityDate = issueDate;
        maturityDate.set(GregorianCalendar.YEAR, issueDate.get(GregorianCalendar.YEAR)+1);
    }

    public CertificateOfDeposit(int certificateNumber, String name, float balance , GregorianCalendar issueData) {
        this.certificateNumber = certificateNumber;
        this.name = name;
        this.balance = balance;
        this.issueDate = issueData;
        this.maturityDate = issueData;
        this.maturityDate.set(GregorianCalendar.YEAR, GregorianCalendar.YEAR+1);
    }

    public int getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(int certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public GregorianCalendar getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int year, int month, int day) {
        this.issueDate = new GregorianCalendar(year, month, day);
        this.maturityDate.set(GregorianCalendar.YEAR, issueDate.get(GregorianCalendar.YEAR)+1);
    }

    public GregorianCalendar getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(GregorianCalendar maturityDate) {
        this.maturityDate = maturityDate;
    }

}