import javax.swing.JOptionPane;
/**
 * Insurance
 */
public class Insurance {

    public static void main(String[] args) {
        short currYear,birthYear;
        short premiumAmount;
        birthYear= Short.parseShort(JOptionPane.showInputDialog(null, "Enter your birth year."));
        currYear = Short.parseShort(JOptionPane.showInputDialog(null, "Enter the current year."));
        premiumAmount = calcPremium(currYear,birthYear);
        JOptionPane.showMessageDialog(null, "Your premium amount is: $"+ premiumAmount);
    }
    public static short calcPremium(short currYear,short birthYear) {
        byte age= (byte)(currYear-birthYear);
        return (short)(((age/10)+15)*20);
    }
}