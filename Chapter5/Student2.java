import javax.swing.JOptionPane;

public class Student2 extends Person {
    
    private String majorStudy;
    private float gradeAvg;

    @Override
    public void initialize(){
        super.initialize();
        this.majorStudy = JOptionPane.showInputDialog(null ,"Please enter the person's major study.");
        this.gradeAvg = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter the person's average grade."));
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("|Major Study: " + this.majorStudy 
        + "|Average Grade: " + this.gradeAvg);
    }
}