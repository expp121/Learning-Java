public class InternnationalDivision extends Division {
    private String country;
    private String spokenLanguage;

    public InternnationalDivision(String companyName, String accountNumber, String country, String spokenLanguage) {
        super(companyName, accountNumber);
        this.country = country;
        this.spokenLanguage = spokenLanguage;
    }

    @Override
    public void display() {
        System.out.println("Country: " + this.country + "\nLanguage: " + this.spokenLanguage + "\nCompany Name: "
                + super.getCompanyDivisionName() + "\nAccount Number: " + super.getAccountNumber());
    }

}
