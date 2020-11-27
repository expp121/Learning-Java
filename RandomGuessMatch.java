import javax.swing.JOptionPane;

public class RandomGuessMatch
{
    public static void main(String[] args) {
        byte random = (byte)(Math.random()*5);
        random++;
        byte guess=Byte.parseByte(JOptionPane.showInputDialog(null, "Guess a number between 1 and 5."));
        if(guess==random)JOptionPane.showMessageDialog(null, "You Guessed the number.");
        else JOptionPane.showMessageDialog(null, "The difference between your number and the guess number is "+ (random-guess));
    }
}