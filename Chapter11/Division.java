public abstract class Division {
    private String companyDivisionName;
    private String accountNumber;

    public Division(String companyName, String accountNumber) {
        this.companyDivisionName = companyName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();

    public String getCompanyDivisionName() {
        return companyDivisionName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
