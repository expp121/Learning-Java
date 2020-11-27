import javax.swing.JOptionPane;

public class AirLineDialog
{
    public static void main(String[] args) {
        int choice;
        choice=JOptionPane.showConfirmDialog(null, "Choose something","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(choice==0)JOptionPane.showMessageDialog(null, "You've pressed the YES button.");
            else JOptionPane.showMessageDialog(null, "You've pressed the NO button.");

    }
}