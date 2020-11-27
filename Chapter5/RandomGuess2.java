import javax.swing.JOptionPane;

public class RandomGuess2{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");
        byte number = Byte.parseByte(JOptionPane.showInputDialog(null, "Enter the number that you think is correct"));
        byte random = (byte)(1+(int) (Math.random()*10));

        if (number == random) JOptionPane.showMessageDialog(null, "You have guessed the number!!!");
        else if (number < random) JOptionPane.showMessageDialog(null, "The number you entered is smaller than the guess number");
        else JOptionPane.showMessageDialog(null, "The number that you entered bigger than the guess number ");
        
    }
}