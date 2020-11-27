
public class TaxReturn {

    private String taxPayerSecurityNumber;
    private String name;
    private String lastName;
    private String streetName;
    private String city;
    private String state;
    private String zipCode;
    private String maritualStatus;
    private float annualIncome;
    private float taxLiability;

    public TaxReturn(String taxPayerSecurityNumber, String name, String lastName, String streetName, String city,
            String state, String zipCode, String maritualStatus, float annualIncome) {

        this.taxPayerSecurityNumber = taxPayerSecurityNumber;
        this.name = name;
        this.lastName = lastName;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.maritualStatus = maritualStatus;
        this.annualIncome = annualIncome;

        computeTaxLiability(this.annualIncome);
    }

    private void computeTaxLiability(float annualIncome) {

        float percentage = 1f;

        if (annualIncome >= 0 && annualIncome <= 20000) {

            if (maritualStatus.toLowerCase().equals("married"))
                percentage = 0.14f;
            else if (maritualStatus.toLowerCase().equals("single"))
                percentage = 0.15f;

        } else if (annualIncome >= 20001 && annualIncome <= 50000) {

            if (maritualStatus.toLowerCase().equals("married"))
                percentage = 0.20f;
            else if (maritualStatus.toLowerCase().equals("single"))
                percentage = 0.22f;

        } else if (annualIncome >= 50001) {

            if (maritualStatus.toLowerCase().equals("married"))
                percentage = 0.28f;
            else if (maritualStatus.toLowerCase().equals("single"))
                percentage = 0.30f;
        }

        this.taxLiability = annualIncome * percentage;
    }

    public void displayData() {
        System.out.println("TAX PAYER NUMBER: " + this.taxPayerSecurityNumber + "\nLAST NAME: " + this.lastName
                + "\nFIRST NAME: " + this.name + "\nSTREET NAME: " + this.streetName + "\nCITY: " + this.city
                + "\nSTATE: " + this.state + "\nZIP CODE: " + this.zipCode + "\nMARITUAL STATUS: " + this.maritualStatus
                + "\nANNUAL INCOME: " + this.annualIncome + "$\nTAX LIABILITY: " + this.taxLiability);
    }
}