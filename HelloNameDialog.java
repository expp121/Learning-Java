import javax.swing.JOptionPane;

public class HelloNameDialog{
    public static void main(String[] args) {

        String name=JOptionPane.showInputDialog(null, "What's your name? ","",3);
        int age=Integer.parseInt(JOptionPane.showInputDialog(null,"How old are you ?","",JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null,"Ok, So your name is "+ name +" and you are " + age + " years old right? ","",JOptionPane.INFORMATION_MESSAGE);
    }
}