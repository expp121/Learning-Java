import javax.swing.JOptionPane;

public class Dollars
{
    public static void main(String[] args) {
        double dollars;
        int cent20,cent10,cent5,cent1;
        
        dollars= Float.parseFloat(JOptionPane.showInputDialog(null, "Enter how many dollars you want to convert."))*100;
        cent20 = (int)Math.floor(dollars/20);
        cent10 = (int)Math.floor((dollars%20)/10);
        cent5 = (int)(((dollars%20)%10)/05);
        cent1 = (int)((((dollars%20)%10)%5)/1);
        JOptionPane.showMessageDialog(null, "That will be\n"+
         cent20 + " 20s\n"+ 
         cent10 + " 10s\n"+
         cent5+" 5s\n"+
         cent1+" 1s" );
    }
}