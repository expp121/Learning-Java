package Chapter11.caseProblems.ex1;

public class Bartender extends Employee {

    @Override
    public void setPayRate(double payRate) {
        this.payRate = payRate <= 14 ? payRate : 0;

    }

    @Override
    public void setJobTitle() {
        this.jobTitle = "bartender";
    }
}
