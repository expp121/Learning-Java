package Chapter11.caseProblems.ex1;

public abstract class Employee {

    private int idNumber;
    private String lastName;
    private String firstName;
    protected double payRate;
    protected String jobTitle;

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public abstract void setPayRate(double payRate);

    public abstract void setJobTitle();

    public int getIdNumber() {
        return idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getPayRate() {
        return payRate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

}
