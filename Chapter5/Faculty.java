import javax.swing.JOptionPane;

public class Faculty extends CollegeEmployee {
    private boolean isMemberTenured;

    @Override
    public void initialize(){
        super.initialize();
        this.isMemberTenured = JOptionPane.showConfirmDialog(null, "Is Member Tenured") == 0 ? false : true;    
    }

    @Override
    public void display(){
        super.display();
        System.out.println("|Is the member Tenured: " + (this.isMemberTenured == true ? "Yes" : "No"));
    }
}