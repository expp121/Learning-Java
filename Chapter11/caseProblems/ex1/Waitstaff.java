package Chapter11.caseProblems.ex1;

public class Waitstaff extends Employee {

    @Override
    public void setPayRate(double payRate) {
        this.payRate = payRate <= 10 ? payRate : 0;

    }

    @Override
    public void setJobTitle() {
        this.jobTitle = "waitstaff";
    }
}
