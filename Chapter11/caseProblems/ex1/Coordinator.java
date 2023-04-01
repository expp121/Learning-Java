package Chapter11.caseProblems.ex1;

public class Coordinator extends Employee {

    @Override
    public void setPayRate(double payRate) {
        this.payRate = payRate <= 20 ? payRate : 0;
    }

    @Override
    public void setJobTitle() {
        this.jobTitle = "coordinator";
    }
}
