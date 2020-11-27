
import javax.swing.JOptionPane;

public class CollegeEmployee extends Person {
    private int securityNum;
    private float annualSalary;
    private String departmentName;

    @Override
    public void initialize(){
        super.initialize();
        this.securityNum = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Please enter the person's security number."));
        this.annualSalary = Float.parseFloat(
            JOptionPane.showInputDialog(null, "Please enter the person's annual salary."));
        this.departmentName = JOptionPane.showInputDialog(null, "Please enter the person's department name.");
    }

    @Override
    public void display(){
        super.display();
        System.out.println("|Security Number: " + this.securityNum
        + "|Annual Salary: " + this.annualSalary
        + "|Department Name: " + this.departmentName);
    }
}