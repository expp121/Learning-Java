public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String companyName, String accountNumber, String state) {
        super(companyName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("State: " + this.state + "\nCompany Name: " + super.getCompanyDivisionName()
                + "\nAccount Number: " + super.getAccountNumber());
    }

}
