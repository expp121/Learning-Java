package Chapter12;

import javax.swing.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        int numerator = 0, denominator = 0, result;
        String inputString;
        try {
            inputString = JOptionPane.showInputDialog(null, "Enter a number to be divided");
            numerator = Integer.parseInt(inputString);
            inputString = JOptionPane.showInputDialog(null, "Enter a number to divide into the first number");
            denominator = Integer.parseInt(inputString);
            result = numerator / denominator;
        } catch (ArithmeticException ae) {
            JOptionPane.showMessageDialog(null, ae.getMessage());
            result = 0;
        }
        JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
    }
}
