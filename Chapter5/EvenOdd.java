/**
 * EvenOdd
 */
import java.util.Scanner;

public class EvenOdd {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        short number;
        System.out.print("Enter a number: ");
        number = input.nextShort();
        if (number%2 == 0) 
            System.out.println("The number you have entered is even.");
        else 
            System.out.println("The number you have entered is odd.");
    }
}