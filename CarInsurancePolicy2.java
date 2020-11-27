/**
 * CarInsurancePolicy2
 */
public class CarInsurancePolicy2 {

    private int policyNumber;
    private int numPayments;
    private String residentCity;

    public CarInsurancePolicy2(int policyNumber, int numPayments, String residentCity) {
        this.policyNumber = policyNumber;
        this.numPayments = numPayments;
        this.residentCity = residentCity;
    }

    public CarInsurancePolicy2(int policyNumber, int numPayments) {
        this(policyNumber,numPayments,"Mayfield");
    }

    public CarInsurancePolicy2(int policyNumber) {
        this(policyNumber,2,"Mayfield");
    }

    public void display() {
        System.out.println("Policy #" + this.policyNumber + ". " + this.numPayments +
        " payments annually. Driver resides in " + this.residentCity + ".");
    }
}